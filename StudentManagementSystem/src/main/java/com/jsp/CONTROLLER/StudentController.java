package com.jsp.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.StudentDao;
import com.jsp.DTO.Student;

@RestController
public class StudentController 
{
	@Autowired
	StudentDao dao;
	
	//API to insert employee object to DB
		@RequestMapping("/insert")
		public ModelAndView getStudent()
		{
			ModelAndView mv=new ModelAndView();
			mv.addObject("student", new Student());
			mv.setViewName("create.jsp");
			return mv;
			
		}
		@RequestMapping("/save")
		public ModelAndView saveStudent(@ModelAttribute Student student)
		{
			dao.saveStudent(student);
			ModelAndView v=new ModelAndView();
			v.setViewName("index.jsp");
			return v;
		}
		
		//API based on ID for searching an object in DB 
		@RequestMapping("/search")
		public ModelAndView searchStudent()
		{
			ModelAndView mv=new ModelAndView();
			mv.addObject("student", new Student());
			mv.setViewName("get.jsp");
			return mv;
			
		}
		
		
		@RequestMapping("/display")
		public ModelAndView findStudent(@ModelAttribute Student student)
		{
			ModelAndView mv=new ModelAndView();
			Student std=dao.getStudentById(student.getId());
			mv.addObject("student", std);
			mv.setViewName("display.jsp");
			return mv;
		}
		//API based on ID for deleting an object in DB
		@RequestMapping("/delete")
		public ModelAndView deleteStudent()
		{
			ModelAndView mv=new ModelAndView();
			mv.addObject("student", new Student());
			mv.setViewName("delete.jsp");
			return mv;
		}
		
		@RequestMapping("/remove")
		public String removeStudent(@ModelAttribute Student student)
		{
			dao.deleteStudent(student.getId());
			return "employee details removed successfully!.....";
		}

		//API to  display all details of the employee
		@RequestMapping("/displayall")
		public ModelAndView getAllStudent()
		{
			ModelAndView mv=new ModelAndView();
			List<Student> students=dao.getAllStudent();
			mv.addObject("studentlist",students);
			mv.setViewName("displayall.jsp");
			return mv;
		}
		
		//API to update employee details in DB
		@RequestMapping("/update")
		public ModelAndView updateStudent()
		{
			ModelAndView mv=new ModelAndView();
			mv.addObject("student", new Student());
			mv.setViewName("update.jsp");
			return mv;
		}
		
		@RequestMapping("/modify")
		public String modifyStudentDetails(@ModelAttribute Student student)
		{
			dao.updateStudent(student);
			return "STUDENT DETAILS UPDATED SUCCESSFULLY.";
		}
		
}
