package com.abhay.Examination.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhay.Examination.Management.System.dao.ExamRepo;
import com.abhay.Examination.Management.System.entity.Exam;


@Service
public class ExamService {
	@Autowired
	private ExamRepo examrepo;
	
	public String addExam(Exam e)
	{	
		examrepo.save(e);
		return "Added..";
	}
	
	public List<Exam> getAll()
	{
		return examrepo.findAll();
	}
	public String viewExam(int eid)
	{
		Exam e = examrepo.findById(eid).orElse(null);
		if(e!=null)
		{
			return e.toString();
		}
		return "Exam unavailable";
	}
	
	public String updateExam(Exam e1)
	{
		Exam e = examrepo.findById(e1.getEid()).orElse(null);
		if(e!=null)
		{
			examrepo.delete(e);
		}
		examrepo.save(e1);
		return "Updated..";
	}
	
	public String deleteExam(int eid)
	{
		Exam e = examrepo.findById(eid).orElse(null);
		if(e!=null)
		{
			examrepo.delete(e);
		}
		return "Exam unavailable";
	}
	
	
	
	
}
