/**
 * 
 */
package com.fee.report.service;

import java.util.List;

import com.fee.report.model.Student;

/**
 * @author sv
 *
 */
public interface StudentService {

	public void addStudent(Student student);
	
	public void editStudent(Student student);
	
	public List<Student> viewStudent();
	
	public Student viewStudentById(Student student);
	
}
