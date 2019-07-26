package com.visa.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.prj.dao.EmployeeDao;
import com.visa.prj.dao.TicketDao;
import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao;
	
	@Autowired
	private EmployeeDao employeeDao;

	public void addEmployee(Employee e) {
		employeeDao.save(e);
	}

	public void addTicket(Ticket t) {
		ticketDao.save(t);
	}

	public List<Ticket> getTickets() {
		return ticketDao.findAll();
	}

}
