package com.f22pkj31.dao;

import com.f22pkj31.bean.LeadcampusStudent;
import com.f22pkj31.bean.LeadcampusStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeadcampusStudentMapper {
    int countByExample(LeadcampusStudentExample example);

    int deleteByExample(LeadcampusStudentExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(LeadcampusStudent record);

    int insertSelective(LeadcampusStudent record);

    List<LeadcampusStudent> selectByExample(LeadcampusStudentExample example);

    LeadcampusStudent selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") LeadcampusStudent record, @Param("example") LeadcampusStudentExample example);

    int updateByExample(@Param("record") LeadcampusStudent record, @Param("example") LeadcampusStudentExample example);

    int updateByPrimaryKeySelective(LeadcampusStudent record);

    int updateByPrimaryKey(LeadcampusStudent record);
}