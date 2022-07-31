package com.abhay.Examination.Management.System.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class Exam 
{
	@Id
	private int sid;
	private String ename;
	private int eid;
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setHallno(int hallno) {
		this.hallno = hallno;
	}

	private String sname;
	private String subject;
	private int hallno;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(int sid, String sname, String subject, int hallno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.subject = subject;
		this.hallno = hallno;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public int getEid() {
		return eid;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getHallno() {
		return hallno;
	}
	
	@Override
	public String toString() {
		return "Exam [sid=" + sid + ", sname=" + sname + ", subject=" + subject + ", hallno=" + hallno + "]";
	}
	
	
}
