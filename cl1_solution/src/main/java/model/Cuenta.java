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


@Table(name = "tbl_cuentas")
@Entity(name = "Cuenta")
@Getter
@Setter

public class Cuenta {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "activa", length = 1, nullable = false)	
	private String activa;
	
	@Column(name = "numeroCuenta", length = 255, nullable = false)
	private String numeroCuenta;
	
	@Column(name = "sueldo", precision = 10, scale = 2)
	private BigDecimal saldo;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	private Cliente cliente;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	private TipoCuenta tipoCuenta;

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", activa=" + activa + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo
				+ ", cliente=" + cliente + ", tipoCuenta=" + tipoCuenta + "]";
	}

	
	

	
	
	

}
