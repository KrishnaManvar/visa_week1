package com.visa.prj.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;

public class TicketRestClient {
	
	public static void main(String[] args) {
		String url = "http://localhost:8080/ticket";
		RestTemplate template = new RestTemplate();
		
		registerEmployee(template,url);
		//logTicket(template, url);
		// resolveTicket(template,url);
		
	}

/*	private static void resolveTicket(RestTemplate template, String url) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		Ticket ticket = template.getForObject(url, Ticket.class);
		Employee e = new Employee("j@visa.com","john", 122, "IT");
		ticket.setResolvedBy(e);
		ticket.setResolvedInfo("Changed RAM");
		HttpEntity<Ticket> requestEntity = new HttpEntity<Ticket>(ticket, headers);
		
		ResponseEntity<Ticket> result = template.postForEntity(url, requestEntity, Ticket.class);
		System.out.println(result.getStatusCode()); // 201
		System.out.println(result.getBody().getTicketId());

	} */

	private static void registerEmployee(RestTemplate template, String url) {
		HttpHeaders headers = new HttpHeaders();
		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 headers.setContentType(MediaType.APPLICATION_JSON);
		Employee e = new Employee("k@visa.com", "Krishna", 123, "MAP");
		HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(e, headers);

		ResponseEntity<Employee> result = template.postForEntity(url, requestEntity, Employee.class);
		System.out.println(result.getStatusCode()); // 201
		System.out.println(result.getBody().getEmail());
	}

	private static void logTicket(RestTemplate template, String url) {

		HttpHeaders headers = new HttpHeaders();
		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 headers.setContentType(MediaType.APPLICATION_JSON);
		 Ticket t = new Ticket();
		 t.setDesc("Slow");
		 Employee e = new Employee();
		 e.setEmail("k@visa.com");
		 t.setRaisedBy(e);
		 HttpEntity<Ticket> requestEntity = new HttpEntity<Ticket>(t, headers);
		 ResponseEntity<Ticket> result = template.postForEntity(url, requestEntity, Ticket.class);
		 System.out.println(result.getStatusCode()); // 201
		 System.out.println(result.getBody().getTicketId());
	}
}
