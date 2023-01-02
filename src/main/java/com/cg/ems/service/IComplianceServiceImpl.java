package com.cg.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.ems.repository.ComplianceRepository;
import com.cg.ems.repository.StatusReportRepository;
import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.ComplianceIdExistsException;
import com.cg.ems.exception.RlNotExistsException;
@Service
public class IComplianceServiceImpl implements IComplianceService{
	@Autowired
	ComplianceRepository cRepository;
	
	

	/* @author : VignathaNossam
	 * @return : It doesn't return anything as return type is void but it saves the created compliance in the repository
	 * @description : This method creates Compliance and saves it in the repository
	 */
	
	@Override
	public void createRl(ComplianceDto co) throws ComplianceIdExistsException{
		Optional<ComplianceDto> cd =  cRepository.findById(co.getComplianceId());
		if(cd.isPresent()) {
			throw new ComplianceIdExistsException("Compliance id exists in the table");
		}
		cRepository.save(co);
		
	}

	/* @author : VignathaNossam
	 * @return : List Of Compliances
	 * @description : This method  returns the  List of Compliances of Regulation or Legislation
	 */

	@Override
	public List<ComplianceDto> getAllRl() throws RlNotExistsException{
		if(cRepository.findAll().isEmpty()) {
			throw new RlNotExistsException("Data not found ");
		}
		return cRepository.findAll();
	
	}
	
	/* @author : VignathaNossam
	 * @return : List Of Compliances with the given userId
	 * @description : This method returns the  List of Compliance with the given userId of Regulation or Legislation
	 */

	@Override
	public List<ComplianceDto> getAllRl(String userId) {
		
		return cRepository.getAllRl(userId);
	}

	
	

	
}
