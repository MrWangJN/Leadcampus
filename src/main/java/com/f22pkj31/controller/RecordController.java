package com.f22pkj31.controller;


import com.alibaba.fastjson.JSONObject;
import com.f22pkj31.bean.LeadcampusRunningRecord;
import com.f22pkj31.utils.DateUtil;
import com.f22pkj31.utils.ReturnUtil;
import com.f22pkj31.utils.UploadFile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("Record")
public class RecordController extends BaseController {

    /**
     * 上传跑步数据
     *
     * @param Json
     * @param file
     * @return
     */
    @RequestMapping(value = "uploadRunningRecord")
    public Map<String, Object> uploadRunningRecord(String Json,
                                                   @RequestParam(value = "image", required = false) MultipartFile file) {

        JSONObject parse = JSONObject.parseObject(Json);
        if (sessionService.equalSessionId(parse.getInteger("studentId"), parse.getString("sessionId"))) {
            try {
                LeadcampusRunningRecord runningRecord = new LeadcampusRunningRecord(parse.getInteger("studentId"),
                        parse.getString("locationArray").toString(),
                        parse.getDouble("pace"),
                        parse.getInteger("useTime"),
                        parse.getString("colorArray").toString(),
                        parse.getDouble("distance"),
                        parse.getString("indexArray").toString(),
                        new Date()
                );
                if (file != null) {
                    String filePath = UploadFile.URL + UploadFile.STUPICURL + file.getOriginalFilename();
                    file.transferTo(new File(filePath));
                    runningRecord.setRecordImg(UploadFile.SERVICEUTL + UploadFile.STUPICURL + file.getOriginalFilename());
                    System.out.println(runningRecord);
                }
                if (recordService.uploadRunningRecord(runningRecord) >= 1) {
                    return ReturnUtil.successReturn();
                } else {
                    return ReturnUtil.failReturn("0011", "上传数据失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return ReturnUtil.failReturn("0003", "图片上传失败");
            }
        } else {
            return ReturnUtil.failReturn("0000", "sessionId不匹配");
        }
    }

    @RequestMapping(value = "uploadRunningImage")
    public Map<String, Object> uploadRunningImage(String sessionId, Integer studentId, @RequestParam(value = "image", required = false) MultipartFile file) {
        if (sessionService.equalSessionId(studentId, sessionId)) {
            if (file != null) {
                String filePath = UploadFile.URL + UploadFile.STUPICURL + file.getOriginalFilename();
                try {
                    file.transferTo(new File(filePath));
                    LeadcampusRunningRecord runningRecord = new LeadcampusRunningRecord();
                    runningRecord.setRecordId(recordService.getRecordIdByStudentId(studentId));
                    runningRecord.setRecordImg(UploadFile.SERVICEUTL + UploadFile.STUPICURL + file.getOriginalFilename());
                    if (recordService.uploadRunningRecordImage(runningRecord) >= 1) {
                        return ReturnUtil.successReturn();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return ReturnUtil.failReturn("0003", "图片上传失败");
                }
            }
            return ReturnUtil.failReturn("0003", "图片上传失败");
        }
        return ReturnUtil.failReturn("0000", "sessionId不匹配");
    }

    /**
     * 获取跑步数据
     *
     * @param sessionId
     * @param studentId
     * @param mouth
     * @return
     */
    @RequestMapping(value = "getRunningRecord")
    public Map<String, Object> getRunningRecord(String sessionId, Integer studentId, Integer mouth) {
        Date[] dates = DateUtil.getMouths(mouth);

        if (sessionService.equalSessionId(studentId, sessionId)) {

            return ReturnUtil.successReturn(recordService.getRunningRecord(studentId, dates[0], dates[1]));

        } else {
            return ReturnUtil.failReturn("0000", "sessionId不匹配");
        }


    }
}
