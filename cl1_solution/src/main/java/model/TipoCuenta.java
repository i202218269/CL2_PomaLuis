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


@Table(name = "tbl_tipoCuentas")
@Entity(name = "TipoCuenta")
@Getter
@Setter


public class TipoCuenta {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "descripcion", length = 255, nullable = false)
	private String descripcion;
	
	
	@Column(name = "moneda", length = 255, nullable = false)
	private String moneda;

	
	@Override
	public String toString() {
		return "TipoCuenta [id=" + id + ", descripcion=" + descripcion + ", moneda=" + moneda + "]";
	}
	
	
	
	
	
}
