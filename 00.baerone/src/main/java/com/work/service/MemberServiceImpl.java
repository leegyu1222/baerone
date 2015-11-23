package com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.MemberDAO;
import com.work.dao.MemberDAOImpl;

@Service
public class MemberServiceImpl implements MemberService {
	private MemberDAO dao;
	@Autowired
	public void setService(MemberDAOImpl dao){
		this.dao = dao;
	}

}
