package com.bv.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bv.main.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String displayEmployeeForm(Model model) {
		System.out.println("in displayEmployeeForm()");
		Employee employee = new Employee();

		model.addAttribute("employee", employee);
		System.out.println(employee);
		return "employeedetails";
	}

	@RequestMapping("/saveemployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee);
		return "savedetails";
	}
}
