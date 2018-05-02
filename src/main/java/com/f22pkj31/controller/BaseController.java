package com.f22pkj31.controller;

import com.f22pkj31.service.RecordService;
import com.f22pkj31.service.RouteService;
import com.f22pkj31.service.SessionService;
import com.f22pkj31.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

	@Autowired
	protected StudentService studentService;
	@Autowired
	protected SessionService sessionService;
	@Autowired
	protected RecordService recordService;
	@Autowired
	protected  RouteService routeService;
	@Autowired
	protected HttpServletRequest request;
	
}
