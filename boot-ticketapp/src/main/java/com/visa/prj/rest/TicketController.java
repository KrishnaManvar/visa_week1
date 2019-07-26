package com.visa.prj.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.Ticket;
import com.visa.prj.service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	/*@PostMapping("raise")
	public ResponseEntity<Ticket> addTicket(@RequestBody Ticket t) {
		service.addTicket(t);
		return new ResponseEntity(t, HttpStatus.CREATED);
	}
	
	@GetMapping("ticket")
	public @ResponseBody List<Ticket> getOrders() {
		return service.getTickets();
	}
	
	@PostMapping("resolve")
	public ResponseEntity<Ticket> resolveTicket(@RequestBody Ticket t) {
		service.addTicket(t);
		return new ResponseEntity(t, HttpStatus.CREATED);
	}*/
	


}
