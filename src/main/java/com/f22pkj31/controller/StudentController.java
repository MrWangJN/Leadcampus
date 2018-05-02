package com.f22pkj31.controller;

import com.f22pkj31.bean.LeadcampusStudent;
import com.f22pkj31.utils.AuthenticationUtil;
import com.f22pkj31.utils.RandomStrUtil;
import com.f22pkj31.utils.ReturnUtil;
import com.f22pkj31.utils.UploadFile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;
import java.util.Map;

@RequestMapping("Student")
@RestController
public class StudentController extends BaseController {

    /**
     * 学生登陆
     * @param student
     * @param session
     * @return
     */
    @RequestMapping(value = "Login")
    public Map<String, Object> Login(LeadcampusStudent student, HttpSession session) {
        Map<String, Object> login = studentService.login(student);
        Integer flag = (Integer) login.get("flag");
        if (flag == 0) {
            return ReturnUtil.failReturn("0001", "用户名或密码错误");
        } else {
            List<LeadcampusStudent> dataList = (List<LeadcampusStudent>) login.get("data");
            if (sessionService.putSessionId(dataList.get(0), session.getId()) >= 1) {
                return ReturnUtil.successReturn(dataList, session.getId());
            } else {
                return ReturnUtil.failReturn("0012", "sessionId获取错误");
            }

        }
    }



    /**
     *学生注销
     * @param studentId
     * @return
     */
    @RequestMapping(value = "Logout")
    public Map<String, Object> Logout(Integer studentId) {
        Map<String, Object> map = null;
        if (sessionService.removeSessionId(studentId) >= 1) {
            map = ReturnUtil.successReturn();
        } else {
            map = ReturnUtil.failReturn("0010", "注销失败");
        }
        return map;
    }

    /**
     * 学生注册
     * @param student
     * @param code
     * @return
     */
    @RequestMapping(value = "Register")
    public Map<String, Object> Register(LeadcampusStudent student, String code) {
        if (studentService.verifyAuthentication(code, student.getPhoneNum())) {
            if (studentService.equalStudentNum(student.getStudentNum())) {
                Integer flag = studentService.Register(student);
                if (flag >= 1) {
                    return ReturnUtil.successReturn();
                } else {
                    return ReturnUtil.failReturn("0002", "用户注册失败");
                }
            } else {
                return ReturnUtil.failReturn("0004", "该学号已被注册");
            }
        } else {
            return ReturnUtil.failReturn("0005", "验证码输入错误");
        }
    }

    /**
     *获取学校列表
     * @param schoolName
     * @return
     */
    @RequestMapping(value = "getSchoolList")
    public Map<String, Object> getSchoolList(@RequestParam(value = "schoolName", defaultValue = "") String schoolName) {
        Map<String, Object> map = null;
        map = ReturnUtil.successReturn(studentService.getSchoolList(schoolName));
        return map;
    }

    /**
     * 修改密码
     * @param student
     * @param newPasswd
     * @param sessionId
     * @return
     */
    @RequestMapping(value = "updatePasswd")
    public Map<String, Object> updatePasswd(LeadcampusStudent student, String newPasswd, String sessionId) {
        if (sessionService.equalSessionId(student.getStudentId(), sessionId)) {
            Map<String, Object> map = null;
            int flag = (int) studentService.updatePasswd(student, newPasswd).get("flag");
            if (flag == -1) {
                map = ReturnUtil.failReturn("0006", "原始密码错误");
            } else if (flag == 0) {
                map = ReturnUtil.failReturn("0007", "修改失败");
            } else if (flag == 1) {
                map = ReturnUtil.successReturn();
            }
            return map;
        } else {
            return ReturnUtil.failReturn("0000", "sessionId不匹配");
        }
    }

    /**
     * 获取验证码
     * @param phoneNum
     * @return
     */
    @RequestMapping(value = "sendCode")
    public Map<String, Object> sendCode(String phoneNum) {
        if (studentService.equalPhoneNum(phoneNum)) {
            String randomStr = RandomStrUtil.getRandomStr(6);
            AuthenticationUtil.getAuthenticationCode(phoneNum, randomStr);
            studentService.putAuthentication(phoneNum, randomStr);
            return ReturnUtil.successReturn();
        } else {
            return ReturnUtil.failReturn("0008", "该手机号已被注册");
        }
    }

    /**
     * 获取个人信息
     * @param studentId
     * @param sessionId
     * @return
     */
    @RequestMapping(value = "getPersonalInformation")
    public Map<String, Object> getPersonalInformation(Integer studentId, String sessionId) {
        if (sessionService.equalSessionId(studentId, sessionId)) {
            List<LeadcampusStudent> studentList = studentService.getStudentById(studentId);
            if (!studentList.isEmpty()) {
                return ReturnUtil.successReturn(studentList);
            } else {
                return ReturnUtil.failReturn("0009", "该学生不存在");
            }
        } else {
            return ReturnUtil.failReturn("0000", "sessionId不匹配");
        }
    }

    /**
     * 修改手机号
     * @param studentId
     * @param newPhoneNum
     * @param code
     * @param sessionId
     * @return
     */
    @RequestMapping(value = "updatePhoneNum")
    public Map<String, Object> updatePhoneNum(Integer studentId, String newPhoneNum, String code, String sessionId) {
        if (sessionService.equalSessionId(studentId, sessionId)) {
            if (studentService.verifyAuthentication(code, newPhoneNum)) {
                if (studentService.updatePhoneNum(studentId, newPhoneNum) >= 1) {
                    return ReturnUtil.successReturn();
                } else {
                    return ReturnUtil.failReturn("0007", "修改失败");
                }
            } else {
                return ReturnUtil.failReturn("0005", "验证码输入错误");
            }
        } else {
            return ReturnUtil.failReturn("0000", "sessionId不匹配");
        }
    }

    /**
     * 修改个人信息
     * @param file
     * @param student
     * @param sessionId
     * @return
     */
    @RequestMapping(value = "updatePersonalInformation")
    public Map<String, Object> updatePersonalInformation(@RequestParam(value = "headPicFile", required = false) MultipartFile file,
                                                         LeadcampusStudent student, String sessionId) {
        if (sessionService.equalSessionId(student.getStudentId(), sessionId)) {
            student.setPhoneNum(null);
            student.setStudentNum(null);
            student.setStudentPasswd(null);
            student.setTotalCalories(null);

            student.setTotalMileage(null);
            student.setTotalTime(null);
            try {
                if (file != null) {
                    String filePath = UploadFile.URL + UploadFile.STUPICURL + file.getOriginalFilename();
                    file.transferTo(new File(filePath));
                    student.setStudentPic(UploadFile.SERVICEUTL + UploadFile.STUPICURL + file.getOriginalFilename());
                }
                if (studentService.updatePersonalInformation(student) >= 1) {
                    return ReturnUtil.successReturn();
                } else {
                    return ReturnUtil.failReturn("0007", "修改失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return ReturnUtil.failReturn("0003", "图片上传失败");
            }
        } else {
            return ReturnUtil.failReturn("0000", "sessionId不匹配");
        }
    }


}
