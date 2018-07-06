package com.daendev.hellospring.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daendev.hellospring.model.Greeting;
import com.daendev.hellospring.util.HibernateUtil;

@RestController
@RequestMapping("/data")
public class HelloSpringController {

	@RequestMapping("/hello")
	public List<Greeting> hi() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
         
        // Get all data from Greeting table
        List<Greeting> greetings = session.createQuery("from Greeting").list();
         
        session.close();
        
        // Return all data as list
        return greetings;
	}
	
}
