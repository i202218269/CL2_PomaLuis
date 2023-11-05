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

@Table(name = "tbl_empleados")
@Entity(name = "Empleado")
@Getter
@Setter
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ape_pat", length = 100, nullable = false)
	private String apellidoPaterno;

	@Column(name = "ape_mat", length = 100, nullable = false)
	private String apellidoMaterno;

	@Column(name = "nombres", length = 50, nullable = false)
	private String nombres;

	private Integer nroHijos;

	@Column(name = "sueldo", precision = 10, scale = 2)
	private BigDecimal sueldo;

	private LocalDate fechaNacimiento;

	@Lob
	@Column(length = 16777215)
	private byte[] foto;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Departamento departamento;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(unique = true)
	private Estacionamiento estacionamiento;

	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Proyecto> proyectos;

	@OneToMany(mappedBy = "empleado", cascade = CascadeType.PERSIST)
	private List<Tarea> tareas;

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombres=" + nombres + ", nroHijos=" + nroHijos + ", sueldo=" + sueldo + ", fechaNacimiento="
				+ fechaNacimiento + ", departamento=" + departamento + ", estacionamiento=" + estacionamiento + "]";
	}

}
