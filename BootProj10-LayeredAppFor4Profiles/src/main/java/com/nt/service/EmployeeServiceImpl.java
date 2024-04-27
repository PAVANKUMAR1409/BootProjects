package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bean.Employee;
import com.nt.repository.IEmployeeDAO;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService
{
	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<Employee> fetchAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=dao.getEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}

}
