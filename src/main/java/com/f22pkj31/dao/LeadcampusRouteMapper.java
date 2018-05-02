package com.f22pkj31.dao;

import com.f22pkj31.bean.LeadcampusRoute;
import com.f22pkj31.bean.LeadcampusRouteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface LeadcampusRouteMapper {
    int countByExample(LeadcampusRouteExample example);

    int deleteByExample(LeadcampusRouteExample example);

    int deleteByPrimaryKey(Integer routeId);

    int insert(LeadcampusRoute record);

    int insertSelective(LeadcampusRoute record);

    List<LeadcampusRoute> selectByExample(LeadcampusRouteExample example);

    LeadcampusRoute selectByPrimaryKey(Integer routeId);

    int updateByExampleSelective(@Param("record") LeadcampusRoute record, @Param("example") LeadcampusRouteExample example);

    int updateByExample(@Param("record") LeadcampusRoute record, @Param("example") LeadcampusRouteExample example);

    int updateByPrimaryKeySelective(LeadcampusRoute record);

    int updateByPrimaryKey(LeadcampusRoute record);
}