package com.jsp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.DTO.Student;

@Repository
public class StudentDao 
{
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	//to insert employee object to the DB
	
		public void saveStudent(Student student)
		{
			transaction.begin();
			manager.persist(student);
			transaction.commit();
		}
		
		
		//to find employee based on ID
		
		public Student getStudentById(int id)
		{
			Student s=manager.find(Student.class,id);
			return s;
		}
		
		//to delete an employee
		public void deleteStudent(int id)
		{
			Student s=manager.find(Student.class,id);
			if(s!=null)
			{
				transaction.begin();
				manager.remove(s);
				transaction.commit();
			}
		}
		
		//to update employee details
		public void updateStudent(Student updatedStudent)
		{
			transaction.begin();
			manager.merge(updatedStudent);
			transaction.commit();
		}
		
		//to get all employee details
		public  List<Student> getAllStudent(){
			Query q=manager.createQuery("select s from Student s");
			List<Student> students=q.getResultList();
			return students;
		}
		
		

}
