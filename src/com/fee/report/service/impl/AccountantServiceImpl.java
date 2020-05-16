/**
 * 
 */
package com.fee.report.service.impl;

import java.util.List;

import com.fee.report.dao.AccountantDao;
import com.fee.report.model.Accountant;
import com.fee.report.service.AccountantService;

/**
 * @author sv
 *
 */
public class AccountantServiceImpl implements AccountantService {
	
	AccountantDao aDao;
	
	public AccountantServiceImpl() {
		// TODO Auto-generated constructor stub
		aDao = new AccountantDao();
	}
	
	@Override
	public void addAccountant(Accountant accountant) {
		// TODO Auto-generated method stub
		aDao.save(accountant);
	}

	@Override
	public List<Accountant> viewAccountant() {
		// TODO Auto-generated method stub
		return aDao.view();
	}

	@Override
	public boolean checkAccountantExist(Accountant accountant) {
		// TODO Auto-generated method stub
		return aDao.checkAccountantExistinDB(accountant);
	}

}
