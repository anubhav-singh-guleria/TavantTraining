package com.org.tav.spring.autowired;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Passport {
	private int passNum;
	private Date dateofIssue;
	private Date dateofExpiry;
	
    
	public int getPassNum() {
		return passNum;
	}
	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}
	public Date getDateofIssue() {
		return dateofIssue;
	}
	public void setDateofIssue(Date dateofIssue) {
		this.dateofIssue = dateofIssue;
	}
	public Date getDateofExpiry() {
		return dateofExpiry;
	}
	public void setDateofExpiry(Date dateofExpiry) {
		this.dateofExpiry = dateofExpiry;
	}
	@Override
	public String toString() {
		return "Passport [passNum=" + passNum + ", dateofIssue=" + dateofIssue + ", dateofExpiry=" + dateofExpiry + "]";
	}
	

}