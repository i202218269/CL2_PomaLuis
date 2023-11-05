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


@Table (name = "tbl_movimientos")
@Entity (name = "Movimiento")
@Setter
@Getter

public class Movimiento {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "descripcion", length = 255, nullable = false)
	private String descripcion;
	
	private LocalDate fecha;
	
	@Column(name = "monto", precision = 10, scale = 2)
	private BigDecimal monto;
	
	
	private long cuenta_id;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Cuenta cuenta;
	
	/*
	@ManyToOne
	private List<Cuenta> cuentas;
	
	*/
	
	
	
	@Override
	public String toString() {
		return "Movimiento [id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + ", monto=" + monto
				+ ", cuenta_id=" + cuenta_id + "]";
	}
	
	
	

}
