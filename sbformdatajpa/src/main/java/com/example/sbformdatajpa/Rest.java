package com.example.sbformdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Rest {

	EmployerDAOClass edc;

	@Autowired
	public Rest(EmployerDAOClass edc) {
		super();
		this.edc = edc;
	}
	
	@GetMapping("/fo")
	public String showForm(Model model) {
		model.addAttribute("emp1");
		return "emp_from";
	}
	
	@PostMapping("/insert")
	public String registerStudent(@ModelAttribute("emp2") Employer user, Model model){
	model.addAttribute("stud1", user);
	edc.insertStudent(user);
	return "display";
	}
	
}
