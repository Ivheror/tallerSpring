package org.springframework.samples.petclinic.bill;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.visit.Visit;

@Entity
@Table(name="facturas")

public class Bill extends BaseEntity {
	
	@Digits(integer=10, fraction=0)
	private long id;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date pago;
	
	@Digits(integer=5, fraction=2)
	@DecimalMin("0.0")
	private float dinero;
	
	@ManyToOne
    @JoinColumn(name = "owner")
	private Owner owner;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "bill", cascade = CascadeType.ALL)
	private Visit visit;
	
	public Bill()
	{
		
	}

	public long getIdNumber() {
		return id;
	}

	public void setIdNumber(long id) {
		this.id = id;
	}

	public Date getPago() {
		return pago;
	}

	public void setPago(Date pago) {
		this.pago = pago;
	}

	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Visit getVisit() {
		return visit;
	}

	public void setVisit(Visit visit) {
		this.visit = visit;
	}

	
	
}
