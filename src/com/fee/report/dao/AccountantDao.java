/**
 * 
 */
package com.fee.report.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fee.report.model.Accountant;
import com.fee.report.util.DBConnection;

/**
 * @author sv
 *
 */
public class AccountantDao {

	List<Accountant> laccountant;
	Connection connection;
	ResultSet resultSet;
	PreparedStatement preparedStatement;

	public AccountantDao() {
		// TODO Auto-generated constructor stub
		laccountant = new ArrayList<>();
		connection = DBConnection.openConnection();
	}

	public void save(Accountant accountants) {
		if (!checkAccountantExistinDB(accountants)) {
			try {
				String sql = "Insert into accountant values(default,?,?,?,?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, accountants.getName());
				preparedStatement.setString(2, accountants.getPassword());
				preparedStatement.setString(3, accountants.getEmailID());
				preparedStatement.setLong(4, accountants.getContactNo());
				preparedStatement.executeUpdate();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public boolean checkAccountantExistinDB(Accountant accountant) {
		try {
			String sql = "Select * from accountant where name = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, accountant.getName());
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public List<Accountant> view() {
		try {
			String sql = "select * from accountant";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				Accountant accountant = new Accountant();
				accountant.setName(resultSet.getString("name"));
				accountant.setPassword(resultSet.getString("password"));
				accountant.setEmailID(resultSet.getString("emailid"));
				accountant.setContactNo(resultSet.getLong("contact_no"));
				laccountant.add(accountant);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return laccountant;
	}
}
