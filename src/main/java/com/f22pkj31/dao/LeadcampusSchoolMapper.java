package com.f22pkj31.dao;

import com.f22pkj31.bean.LeadcampusSchool;
import com.f22pkj31.bean.LeadcampusSchoolExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface LeadcampusSchoolMapper {
    int countByExample(LeadcampusSchoolExample example);

    int deleteByExample(LeadcampusSchoolExample example);

    int deleteByPrimaryKey(Integer schoolId);

    int insert(LeadcampusSchool record);

    int insertSelective(LeadcampusSchool record);

    List<LeadcampusSchool> selectByExample(LeadcampusSchoolExample example);

    LeadcampusSchool selectByPrimaryKey(Integer schoolId);

    int updateByExampleSelective(@Param("record") LeadcampusSchool record, @Param("example") LeadcampusSchoolExample example);

    int updateByExample(@Param("record") LeadcampusSchool record, @Param("example") LeadcampusSchoolExample example);

    int updateByPrimaryKeySelective(LeadcampusSchool record);

    int updateByPrimaryKey(LeadcampusSchool record);
}