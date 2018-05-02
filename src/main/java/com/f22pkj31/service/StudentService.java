package com.f22pkj31.service;

import com.f22pkj31.bean.LeadcampusSchool;
import com.f22pkj31.bean.LeadcampusSchoolExample;
import com.f22pkj31.bean.LeadcampusStudent;
import com.f22pkj31.bean.LeadcampusStudentExample;
import com.f22pkj31.bean.LeadcampusStudentExample.Criteria;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService extends BaseService {

	public Map<String, Object> login(LeadcampusStudent student) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		LeadcampusStudentExample example = new LeadcampusStudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStudentNumEqualTo(student.getStudentNum());
		criteria.andStudentPasswdEqualTo(student.getStudentPasswd());
		List<LeadcampusStudent> list = leadcampusStudentMapper.selectByExample(example);
		if (list.isEmpty()) {
			example.clear();
			criteria = example.createCriteria();
			criteria.andPhoneNumEqualTo(student.getStudentNum());
			criteria.andStudentPasswdEqualTo(student.getStudentPasswd());
			list = leadcampusStudentMapper.selectByExample(example);
		}
		if (list.isEmpty()) {
			map.put("flag", 0);
		} else {
			map.put("flag", 1);
			map.put("data", list);
		}
		return map;
	}

	public Integer Register(LeadcampusStudent student) {
		// TODO Auto-generated method stub
		return leadcampusStudentMapper.insertSelective(student);
	}

	public List<LeadcampusSchool> getSchoolList(String schoolName) {
		// TODO Auto-generated method stub
		char[] charArray = schoolName.toCharArray();
		List<LeadcampusSchool> list = null;
		String string = "%";
		for (char c : charArray) {
			string = string + c + "%";
		}
		LeadcampusSchoolExample example = new LeadcampusSchoolExample();
		com.f22pkj31.bean.LeadcampusSchoolExample.Criteria criteria = example.createCriteria();
		criteria.andIsserviceEqualTo(1);
		criteria.andSchoolNameLike(string);
		list = leadcampusSchoolMapper.selectByExample(example);
		if (list.isEmpty()) {
			example.clear();
			criteria = example.createCriteria();
			criteria.andIsserviceEqualTo(1);
			criteria.andSchoolPinyinLike(string);
			list = leadcampusSchoolMapper.selectByExample(example);
		}
		return list;
	}

	public Map<String, Object> updatePasswd(LeadcampusStudent student, String newPasswd) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		LeadcampusStudentExample example = new LeadcampusStudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStudentIdEqualTo(student.getStudentId());
		criteria.andStudentPasswdEqualTo(student.getStudentPasswd());
		List<LeadcampusStudent> studentList = leadcampusStudentMapper.selectByExample(example);
		if (studentList.isEmpty()) {
			map.put("flag", -1);
		} else {
			LeadcampusStudent student2 = new LeadcampusStudent();
			student2.setStudentPasswd(newPasswd);
			int flag = leadcampusStudentMapper.updateByExampleSelective(student2, example);
			if (flag >= 1) {
				map.put("flag", 1);
			} else {
				map.put("flag", 0);
			}
			
		}
		return map;
	}

	public void putAuthentication(String phoneNum, String randomStr) {
		// TODO Auto-generated method stub
		redisDao.add(phoneNum, randomStr,20L);
		System.out.println("resultMap==" + redisDao.get(phoneNum));
	}

	public boolean  verifyAuthentication(String code, String phoneNum) {
		// TODO Auto-generated method stub
		String string = redisDao.get(phoneNum);
		if (string != null && string.equals(code)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equalPhoneNum(String phoneNum) {
		LeadcampusStudentExample example = new LeadcampusStudentExample();
		example.createCriteria().andPhoneNumEqualTo(phoneNum);
		if (leadcampusStudentMapper.selectByExample(example).isEmpty()) {
			return true;
		} else {
			return false;
		}
		// TODO Auto-generated method stub

	}

	public boolean equalStudentNum(String studentNum) {
		LeadcampusStudentExample example = new LeadcampusStudentExample();
		example.createCriteria().andStudentNumEqualTo(studentNum);
		if (leadcampusStudentMapper.selectByExample(example).isEmpty()) {
			return true;
		} else {
			return false;
		}
		// TODO Auto-generated method stub

	}

	public List<LeadcampusStudent> getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		LeadcampusStudentExample example = new LeadcampusStudentExample();
		example.createCriteria().andStudentIdEqualTo(studentId);
		List<LeadcampusStudent> selectByExample = leadcampusStudentMapper.selectByExample(example);
		for (LeadcampusStudent leadcampusStudent : selectByExample) {
			leadcampusStudent.setSessionId(null);
		}
		return selectByExample;
	}

	public int updatePhoneNum(Integer studentId, String newPhoneNum) {
		// TODO Auto-generated method stub
		LeadcampusStudent student = new LeadcampusStudent();
		student.setStudentId(studentId);
		student.setPhoneNum(newPhoneNum);
		return leadcampusStudentMapper.updateByPrimaryKeySelective(student);
	}

	public int updatePersonalInformation(LeadcampusStudent student) {
		// TODO Auto-generated method stub
		try {
			return leadcampusStudentMapper.updateByPrimaryKeySelective(student);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}

	}


	
}
