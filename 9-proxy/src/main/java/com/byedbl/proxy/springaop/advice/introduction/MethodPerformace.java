package com.byedbl.proxy.springaop.advice.introduction;

import java.util.Date;

public class MethodPerformace {

	private String method;
	private Date beginTime;
	private Date endTime;
	public MethodPerformace(){
		
	}
	public MethodPerformace(String method,Date beginTime){
		this.method=method;
		this.beginTime=beginTime;
	}
	public MethodPerformace(String method,Date beginTime,Date endTime){
		this(method, beginTime);
		this.endTime=endTime;
	}
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public void printPerformance() {
		System.out.println(this.method +": "+(this.endTime.getTime()-this.beginTime.getTime()));
		
	}
	
}
