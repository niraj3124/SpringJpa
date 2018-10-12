package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.RechargeBean;

@Repository
@Transactional
public class RechargeDaoImpl implements IRechargeDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public int rechargeInfo(RechargeBean r) {
		em.persist(r);
		System.out.println(r.getRid());
		return r.getRid();
		
	}

}
