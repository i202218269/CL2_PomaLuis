package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_clientes")
@Entity(name = "Cliente")
@Getter
@Setter

public class Cliente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "apellidoPaterno", length = 255, nullable = false)
	private String apellidoPaterno;

	@Column(name = "apellidoMaterno", length = 255, nullable = false)
	private String apellidoMaterno;

	@Column(name = "nombres", length = 255, nullable = false)
	private String nombres;

	@OneToMany
	private List<Cuenta> cuentas;
	
	
	/*
	@OneToMany (mappedBy = "cliente", cascade = CascadeType.PERSIST)
	private List <Cliente_Rol> clienteRoles;
	*/
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombres=" + nombres + "]";
	}







}