/**
 * 
 */
package com.fee.report.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.fee.report.model.Student;
import com.fee.report.util.DBConnection;

/**
 * @author sv
 *
 */
public class StudentDao {

	List<Student> lStudent;
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
		lStudent = new CopyOnWriteArrayList<>();
		connection = DBConnection.openConnection();
		
	}
	
	public void save(Student student) {
	if(!checkStudentExist(student)) {
		try {
			String sql = "Insert into student values(default,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmailID());
			preparedStatement.setString(3, student.getCourse());
			preparedStatement.setInt(4, student.getFee());
			preparedStatement.setInt(5, student.getPaid());
			preparedStatement.setInt(6, student.getDue());
			preparedStatement.setString(7, student.getAddress());
			preparedStatement.setString(8, student.getCity());
			preparedStatement.setString(9, student.getState());
			preparedStatement.setString(10, student.getCountry());
			preparedStatement.setLong(11, student.getContactNo());
			preparedStatement.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}else {
		System.out.println("Student already present in the table");
	}
	}
	
	private boolean checkStudentExist(Student student) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from student where name =? and contact_no=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setLong(2, student.getContactNo());
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public void update(Student student) {
		if(checkStudentExist(student)) {
			Student students = new Student();
			students.setName(student.getName());
			students.setEmailID(student.getEmailID());
			students.setCourse(student.getCourse());
			students.setFee(student.getFee());
			students.setPaid(student.getPaid());
			students.setDue(student.getDue());
			students.setAddress(student.getAddress());
			students.setCity(student.getCity());
			students.setState(student.getState());
			students.setCountry(student.getCountry());
			students.setContactNo(student.getContactNo());
			lStudent.add(students);
		}else {
			System.out.println("Student not Available");
		}
	}
	
	public List<Student> view(){
		try {
			String sql = "select * from student";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				Student student = new Student();
				student.setName(resultSet.getString("name"));
				student.setEmailID(resultSet.getString("emailid"));
				student.setCourse(resultSet.getString("course"));
				student.setFee(resultSet.getInt("fee"));
				student.setPaid(resultSet.getInt("paid"));
				student.setDue(resultSet.getInt("due"));
				student.setAddress(resultSet.getString("address"));
				student.setCity(resultSet.getString("city"));
				student.setState(resultSet.getString("state"));
				student.setCountry(resultSet.getString("country"));
				student.setContactNo(resultSet.getLong("contact_no"));
				lStudent.add(student);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lStudent;
	}
	
}
