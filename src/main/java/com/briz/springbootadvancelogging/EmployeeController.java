package com.briz.springbootadvancelogging;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController
{
@Autowired
EmployeeRepository erepo;
Logger logger = LoggerFactory.getLogger(EmployeeController.class);

@RequestMapping("/test")
public String test()
{
		logger.info("Application started for kanchan log appication");
		return "This is logger test";

}
@RequestMapping("/save")
public String save()
{
	logger.info("data saving started");
	Employee employee=new Employee();
	employee.setAge(12);
	employee.setName("manu");
	employee.setCity("tatanagar");
	erepo.save(employee);
	logger.warn("data saved into database");
	return "data saved";
}
@RequestMapping("/all")
public List<Employee> alldata()
{
	logger.info("data displayed on screen of all employees");
	return erepo.findAll();
}
}
