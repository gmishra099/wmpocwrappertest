package com.wm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wm.model.Contact;
import com.wm.model.Individual;
import com.wm.service.ContactService;
import com.wm.service.IndividualService;
import com.wm.wrapper.WrapperIndividual;

@RestController
@RequestMapping({ "/api" })
public class ContactController {
	
	@Autowired
	ContactService contactService;
	@Autowired
	IndividualService individualService;
	
		@RequestMapping(value = "/test", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
		public String home(Model model) {
			System.out.println("test");
			return "testhome123";
		}
		
		@RequestMapping(value = "/test1", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
		public List<Contact> home1() {
			System.out.println("test");
			contactService.getAllContacts();
			return contactService.getAllContacts();
		}
		
		@RequestMapping(value = "/test2", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
		public List<Individual> home2() {
			//System.out.println("test");
			//contactService.getAllContacts();
			return individualService.getAllIndividuals();
		}
		
		@RequestMapping(value = "/test3", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
		public List<WrapperIndividual> home3() {
			List<WrapperIndividual> WrapperIndividual = new ArrayList<WrapperIndividual>();
			
			List<Individual> indiviList = individualService.getAllIndividuals();
			List<Contact> conList = contactService.getAllContacts();
			for( Contact con:conList) {
				for(Individual indivi:indiviList) {

				if(con.getCusId()=="10001") {
					WrapperIndividual obj = new WrapperIndividual();
					obj.setCusId("10001");;
					obj.setHasoptedouttracking(indivi.getHasoptedouttracking());
					obj.setName(indivi.getName());
					obj.setName(indivi.getShouldforget());
					WrapperIndividual.add(obj);
				}
					
				}
				
			}
			
			
			return WrapperIndividual;
		}

	
}
