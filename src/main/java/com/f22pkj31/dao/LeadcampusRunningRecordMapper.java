package com.f22pkj31.dao;

import com.f22pkj31.bean.LeadcampusRunningRecord;
import com.f22pkj31.bean.LeadcampusRunningRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface LeadcampusRunningRecordMapper {
    int countByExample(LeadcampusRunningRecordExample example);

    int deleteByExample(LeadcampusRunningRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(LeadcampusRunningRecord record);

    int insertSelective(LeadcampusRunningRecord record);

    List<LeadcampusRunningRecord> selectByExample(LeadcampusRunningRecordExample example);

    LeadcampusRunningRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") LeadcampusRunningRecord record, @Param("example") LeadcampusRunningRecordExample example);

    int updateByExample(@Param("record") LeadcampusRunningRecord record, @Param("example") LeadcampusRunningRecordExample example);

    int updateByPrimaryKeySelective(LeadcampusRunningRecord record);

    int updateByPrimaryKey(LeadcampusRunningRecord record);
}