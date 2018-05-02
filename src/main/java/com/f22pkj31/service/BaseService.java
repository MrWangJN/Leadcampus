package com.f22pkj31.service;

import com.f22pkj31.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BaseService {

	@Autowired
	protected LeadcampusSchoolMapper leadcampusSchoolMapper;
	@Autowired
	protected LeadcampusStudentMapper leadcampusStudentMapper;
	@Autowired
	protected LeadcampusRunningRecordMapper leadcampusRunningRecordMapper;
	@Autowired
	protected RedisDao redisDao;
	@Autowired
	protected LeadcampusRouteMapper leadcampusRouteMapper;
}
