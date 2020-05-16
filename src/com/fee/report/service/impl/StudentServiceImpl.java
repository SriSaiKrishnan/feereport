/**
 * 
 */
package com.fee.report.service.impl;

import java.util.List;

import com.fee.report.dao.StudentDao;
import com.fee.report.model.Student;
import com.fee.report.service.StudentService;

/**
 * @author sv
 *
 */
public class StudentServiceImpl implements StudentService {
	
	StudentDao studentDao;
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
		studentDao = new StudentDao();
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}

	@Override
	public void editStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student);
	}

	@Override
	public List<Student> viewStudent() {
		// TODO Auto-generated method stub
		return studentDao.view();
	}

}
