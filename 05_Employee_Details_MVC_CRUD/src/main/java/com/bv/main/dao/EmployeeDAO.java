package com.bv.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.bv.main.model.Employee;

@Component("employeedao")
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String query = "";
	private int count = 0;

	public int addNewEmployee(Employee employee) {
		query = "insert into employee_master values(?,?,?)";
		Object[] args = { employee.getEmployeeId(), employee.getName(), employee.getSalary() };

		count = jdbcTemplate.update(query, args);
		return count;
	}

	public int updateEmployee(Employee employee) {
		query = "update employee_master set name=? , salary=? where employee_id=?";
		Object[] args = { employee.getName(), employee.getSalary(), employee.getEmployeeId() };
		count = jdbcTemplate.update(query, args);
		return count;
	}

	public boolean deleteEmployee(int employeeId) {
		query = "delete from employee_master where employee_id = ?";
		Object[] args = { employeeId };
		count = jdbcTemplate.update(query, args);
		if (count > 0)
			return true;
		else
			return false;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		Employee employee = null;
		try {
			query = "select * from employee_master where employee_id = ?";
			Object[] args = { employeeId };

			employee = jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), args);
		} catch (Exception e) {
			e.getMessage();
		}
		return employee;
	}

	public List<Employee> getAllEmployees() {
		query = "select * from employee_master";
		List<Employee> allEmployees = jdbcTemplate.query(query, new EmployeeRowMapper());
		return allEmployees;
	}

}
