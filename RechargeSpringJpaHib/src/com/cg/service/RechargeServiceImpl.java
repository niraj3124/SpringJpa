package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.RechargeBean;
import com.cg.dao.IRechargeDao;

@Service
public class RechargeServiceImpl implements IRechargeService{
	
	@Autowired
	private IRechargeDao ird;

	@Override
	public int rechargeInfo(RechargeBean r) {
		
		System.out.println("In service"+r.getRid());
		int b=ird.rechargeInfo(r);
		return b;
	}

}
