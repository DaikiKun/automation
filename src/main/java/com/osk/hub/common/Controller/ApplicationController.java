/**
 * @author OAK SOE KHANT
 *
 */
package com.osk.hub.common.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.osk.hub.common.Company;
import com.osk.hub.common.Service.CompanyService;

import jakarta.servlet.http.HttpServletResponse;


@RestController
public class ApplicationController {
	private static final Logger LOGGER=LoggerFactory.getLogger(ApplicationController.class);
	@Autowired
	private CompanyService companyService;

	@GetMapping(value = "/getCompanyList")
	public ResponseEntity<String> getCompanyList(){
		LOGGER.info("Start Retriving Company Data.");
		List<Company> list=companyService.getAllCompany();
		LOGGER.info("Retriving Process End.");
		
		return ResponseEntity.ok().body("List count :"+ list.size());
	}
	@PostMapping(value ="/insertCompany")
	public String insertCompany(@RequestBody Company c) throws Exception{
		LOGGER.info("Inserting Company Data");
		companyService.addOne(c);
		LOGGER.info("Inserting Process End.");
		return "Done";

		
	}
	@PutMapping(value ="/updateCompany/{id}")
	public String insertCompany(@RequestBody Company c,@PathVariable String id){
		LOGGER.info("Updating Company Data");
		companyService.update(c, id);
		LOGGER.info("Updating Process End");
		return "Update 	Done";
	}
	@DeleteMapping(value="/deleteCompany/{id}")
	public String deleteCompany(@PathVariable String id){
		LOGGER.info("Deleting Company Data");
		companyService.deleteByCompanyId(id);
		LOGGER.info("Deleting Process End");
		return "Delete Done";
	}
}
