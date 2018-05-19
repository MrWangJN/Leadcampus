package com.f22pkj31.service;

import com.alibaba.fastjson.JSONArray;
import com.f22pkj31.bean.*;
import com.f22pkj31.bean.LeadcampusRunningRecordExample.Criteria;
import com.f22pkj31.utils.DateUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

@Service
public class RecordService extends BaseService {


    public int uploadRunningRecord(LeadcampusRunningRecord runningRecord, HttpSession session) {
        // TODO Auto-generated method stub
        Date[] mouths = DateUtil.getMouths(runningRecord.getUploadTime().getMonth() + 1);
        runningRecord.setSumDistance(getSumDistanceByStudentId(runningRecord.getStudentid(), mouths) + runningRecord.getDistance());
        System.out.println(getSumDistanceByStudentId(runningRecord.getStudentid(), mouths) + runningRecord.getDistance());
        int flag = leadcampusRunningRecordMapper.insertSelective(runningRecord);
        if (flag >= 1) {
            LeadcampusRunningRecordExample example = new LeadcampusRunningRecordExample();
            session.setAttribute("recordId", runningRecord.getRecordId());
            Criteria criteria = example.createCriteria();
            criteria.andStudentidEqualTo(runningRecord.getStudentid());

            criteria.andUploadTimeBetween(mouths[0], mouths[1]);
            LeadcampusRunningRecord leadcampusRunningRecord = new LeadcampusRunningRecord();
            leadcampusRunningRecord.setSumDistance(runningRecord.getSumDistance());
            int flag2 = leadcampusRunningRecordMapper.updateByExampleSelective(leadcampusRunningRecord, example);
            if (flag2 > 1) {
                LeadcampusStudentExample example2 = new LeadcampusStudentExample();
                LeadcampusStudentExample.Criteria criteria1 = example2.createCriteria();
                criteria1.andStudentIdEqualTo(runningRecord.getStudentid());
                LeadcampusStudent leadcampusStudent = leadcampusStudentMapper.selectByPrimaryKey(runningRecord.getStudentid());
                leadcampusStudent.setTotalTime(leadcampusStudent.getTotalTime() + runningRecord.getUseTime());
                example.clear();
                Criteria criteria2 = example.createCriteria();

                ZoneId zoneId1 = ZoneId.systemDefault();
                LocalDate localDate1 = LocalDate.now().minusDays(-1);
                ZonedDateTime zdt1 = localDate1.atStartOfDay(zoneId1);
                Date date1 = Date.from(zdt1.toInstant());

                ZoneId zoneId2 = ZoneId.systemDefault();
                LocalDate localDate2 = LocalDate.now();
                ZonedDateTime zdt2 = localDate2.atStartOfDay(zoneId2);
                Date date2 = Date.from(zdt2.toInstant());
                criteria2.andUploadTimeBetween(date2, date1);
                criteria2.andStudentidEqualTo(runningRecord.getStudentid());
                int i = leadcampusRunningRecordMapper.countByExample(example);
                System.out.println(i);
                if (i <= 1) {
                    leadcampusStudent.setTrainingDays(leadcampusStudent.getTrainingDays() + 1);
                }
                return leadcampusStudentMapper.updateByPrimaryKeySelective(leadcampusStudent);
            }
        }
        return 0;
    }

    public List<LeadcampusRunningRecordJson> getRunningRecord(Integer studentId, Date start, Date end) {
        Map<String, Object> map = new HashMap<>();
        LeadcampusRunningRecordExample example = new LeadcampusRunningRecordExample();
        Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentId);
        criteria.andUploadTimeBetween(start, end);
        List<LeadcampusRunningRecordJson> leadcampusRunningRecordJsons = new ArrayList<>();
        List<LeadcampusRunningRecord> list = leadcampusRunningRecordMapper.selectByExample(example);
        for (LeadcampusRunningRecord leadcampusRunningRecord : list) {
            JSONArray locationArray = JSONArray.parseArray(leadcampusRunningRecord.getLocationArray());
            JSONArray colorArray = JSONArray.parseArray(leadcampusRunningRecord.getColorArray());
            JSONArray indexArray = JSONArray.parseArray(leadcampusRunningRecord.getIndexArray());
            leadcampusRunningRecordJsons.add(new LeadcampusRunningRecordJson(leadcampusRunningRecord, locationArray.toArray(), colorArray.toArray(), indexArray.toArray()));
        }
        return leadcampusRunningRecordJsons;
        // TODO Auto-generated method stub

    }

    public double getSumDistanceByStudentId(Integer studentId, Date[] mouths) {
        LeadcampusRunningRecordExample example = new LeadcampusRunningRecordExample();
        Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentId);
        criteria.andUploadTimeBetween(mouths[0], mouths[1]);
        List<LeadcampusRunningRecord> leadcampusRunningRecords = leadcampusRunningRecordMapper.selectByExample(example);
        if (!leadcampusRunningRecords.isEmpty()) {
            return leadcampusRunningRecords.get(0).getSumDistance();
        }
        return 0;
    }

    public int uploadRunningRecordImage(LeadcampusRunningRecord runningRecord) {
        return leadcampusRunningRecordMapper.updateByPrimaryKeySelective(runningRecord);
    }
}
