/**
 * @author OAK SOE KHANT
 *
 */
package com.osk.hub.common.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osk.hub.common.Company;
import com.osk.hub.common.DAO.CompanyRepo;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepo repo;
	
	public List<Company> getAllCompany(){
		List<Company> companyList=new ArrayList<Company>();
		companyList=repo.findAll();
		return companyList;
		
	}
	public void addOne(Company c){
		repo.saveAndFlush(c);
	}
	
	public void update(Company c,String id) {
		Company company=repo.findById(id).get();
		company.setVersion(company.getVersion()+1);
		company.setCpnAddress(c.getCpnAddress());
		company.setCpnContact(c.getCpnContact());
		company.setCpnName(c.getCpnName());
		repo.save(company);
		
	}
	public void deleteByCompanyId(String id) {
		repo.deleteById(id);
	}
}
