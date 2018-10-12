package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RechargeBean {
	
	@Id
	@GeneratedValue
	private int rid;
	private String plan;
	private int amount;
	private String mobile;
	private String description;
	private String date;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public RechargeBean(int rid, String plan, int amount, String mobile,
			String description, String date) {
		super();
		this.rid = rid;
		this.plan = plan;
		this.amount = amount;
		this.mobile = mobile;
		this.description = description;
		this.date = date;
	}
	public RechargeBean(String plan, int amount, String mobile,
			String description, String date) {
		super();
		this.plan = plan;
		this.amount = amount;
		this.mobile = mobile;
		this.description = description;
		this.date = date;
	}
	public RechargeBean() {
		super();
	}
	@Override
	public String toString() {
		return "RechargeBean [rid=" + rid + ", plan=" + plan + ", amount="
				+ amount + ", mobile=" + mobile + ", description="
				+ description + ", date=" + date + "]";
	}
	
	
	
	
	

}
