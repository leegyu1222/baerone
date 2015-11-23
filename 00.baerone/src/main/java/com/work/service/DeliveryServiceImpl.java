package com.work.service;

import org.springframework.stereotype.Service;

import com.work.dao.DeliveryDAOImpl;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	private DeliveryDAOImpl dao;
	public void setService(DeliveryDAOImpl dao){
		this.dao = dao;
	}

}
