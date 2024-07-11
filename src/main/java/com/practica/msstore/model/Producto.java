package com.practica.msstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String producto;
	private String descripcion;
	private double precio;
	private int cantidad;
	
	@ManyToOne
	private Usuario usuario;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}


	public Producto(Integer id, String producto, String descripcion, double precio, int cantidad, Usuario usuario) {
		super();
		this.id = id;
		this.producto = producto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.usuario = usuario;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", producto=" + producto + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	
}
