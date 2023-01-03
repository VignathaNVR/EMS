package com.cg.ems;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.ems.repository.IComplianceRepository;
import com.cg.ems.repository.IDepartmentRepository;
import com.cg.ems.repository.IStatusReportRepository;
import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.DepartmentDto;
import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.DepartmentException;
import com.cg.ems.exception.RlNotExistsException;
import com.cg.ems.service.IComplianceServiceImpl;
import com.cg.ems.service.IDepartmentService;
import com.cg.ems.service.IStatusReportServiceImpl;

import org.mockito.junit.MockitoJUnitRunner;
import org.junit.jupiter.api.Test;
@SpringBootTest
class EmployeeManagementSystemApplicationTests {
	
	@Test
	void contextLoads() {
	
	}
	

	}

