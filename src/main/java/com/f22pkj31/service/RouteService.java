package com.f22pkj31.service;

import com.f22pkj31.bean.LeadcampusRoute;
import com.f22pkj31.bean.LeadcampusRouteExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService extends BaseService {
    public List<LeadcampusRoute> selectByExample(LeadcampusRouteExample example){
        return leadcampusRouteMapper.selectByExample(example);
    }
}
