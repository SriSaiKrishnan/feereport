/**
 * 
 */
package com.fee.report.service;

import java.util.List;

import com.fee.report.model.Accountant;

/**
 * @author sv
 *
 */
public interface AccountantService {
	
	public void addAccountant(Accountant accountant);
	
	public boolean checkAccountantExist(Accountant accountant);
	
	public List<Accountant> viewAccountant();

}
