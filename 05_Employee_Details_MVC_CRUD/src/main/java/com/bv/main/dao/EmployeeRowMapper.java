package com.bv.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bv.main.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Employee employee = new Employee();

		int employeeId = resultSet.getInt("employee_id");
		employee.setEmployeeId(employeeId);

		String name = resultSet.getString("name");
		employee.setName(name);

		double salary = resultSet.getDouble("salary");
		employee.setSalary(salary);

		return employee;
	}

}