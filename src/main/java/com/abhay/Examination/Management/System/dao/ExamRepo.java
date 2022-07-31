package com.abhay.Examination.Management.System.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhay.Examination.Management.System.entity.Exam;


public interface ExamRepo  extends JpaRepository<Exam,Integer>{

}
