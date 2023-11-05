package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_estacionamientos")
@Entity(name = "Estacionamiento")
@Getter
@Setter
public class Estacionamiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descripcion;

	@Override
	public String toString() {
		return "Estacionamiento [id=" + id + ", descripcion=" + descripcion + "]";
	}

}
