package com.visa.prj.entity;

import java.util.Date;
import com.visa.prj.entity.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ticketId;
	
	private String desc;
	
	private Date raiseDate;
	
	private boolean resolved;
	
	@ManyToOne
	@JoinColumn(name="email_raised")
	private Employee raisedBy;
	
	@ManyToOne
	@JoinColumn(name="email_resolved")
	private Employee resolvedBy;
	
	private Date resolvedDate;
	
	private String resolvedInfo;
	
	public Ticket() {
		super();
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getRaiseDate() {
		return raiseDate;
	}

	public void setRaiseDate(Date raiseDate) {
		this.raiseDate = raiseDate;
	}

	public Employee getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(Employee raisedBy) {
		this.raisedBy = raisedBy;
	}

	/*public Employee getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}*/

	public Date getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	public String getResolvedInfo() {
		return resolvedInfo;
	}

	public void setResolvedInfo(String resolvedInfo) {
		this.resolvedInfo = resolvedInfo;
	}
	

	public boolean isResolved() {
		return resolved;
	}

	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}

	

}
