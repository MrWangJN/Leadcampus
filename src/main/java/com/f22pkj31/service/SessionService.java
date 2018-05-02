package com.f22pkj31.service;

import org.springframework.stereotype.Service;

import com.f22pkj31.bean.LeadcampusStudent;
@Service
public class SessionService extends BaseService{

	public int putSessionId(LeadcampusStudent student, String id) {
		// TODO Auto-generated method stub
		student.setSessionId(id);
		return leadcampusStudentMapper.updateByPrimaryKeySelective(student);
	}

	public boolean equalSessionId(Integer studentId, String sessionId) {
		// TODO Auto-generated method stub
		String string = leadcampusStudentMapper.selectByPrimaryKey(studentId).getSessionId();
		if (string != null && !string.equals("") && string.equals(sessionId)) {
			return true;
		}
		return false;
	}

	public int removeSessionId(Integer studentId) {
		// TODO Auto-generated method stub
		LeadcampusStudent student = new LeadcampusStudent();
		student.setSessionId("");
		student.setStudentId(studentId);
		return leadcampusStudentMapper.updateByPrimaryKeySelective(student);
	}
}
