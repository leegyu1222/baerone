package com.work.service;

import org.springframework.stereotype.Service;

import com.work.dao.FareDAOImpl;

@Service
public class FareServiceImpl implements FareService {
	private FareDAOImpl dao;
	public void setService(FareDAOImpl dao){
		this.dao = dao;
	}

}
