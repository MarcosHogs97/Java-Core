package Entities;

import java.util.Date;
import Collection.StatusPedido;

public class Pedido {
	private Integer id;
	private Date instante;
	private StatusPedido pedido;

	// construtor S.
	public Pedido() {

	}

	// construtor p.
	public Pedido(Integer id, Date instante, StatusPedido status) {
		this.id = id;
		this.instante = instante;
		this.pedido = status;
	}

	// Gets e Sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public StatusPedido getPedido() {
		return pedido;
	}

	public void setPedido(StatusPedido pedido) {
		this.pedido = pedido;
	}

	
	public String toString() {
		return "Pedido \nID= " + id + "\nData/Hora= " + instante + "\nStatus do Pedido= " + pedido;
	}
	
	

}
