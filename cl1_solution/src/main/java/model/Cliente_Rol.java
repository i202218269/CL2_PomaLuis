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

@Table (name = "tbl_clienteRoles")
@Entity (name = "ClienteRoles")
@Getter
@Setter

public class Cliente_Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "roles_id", nullable = false)
	private Long roles_id;

	@OneToMany(mappedBy = "id", cascade = CascadeType.PERSIST)
	private List<Rol> roles;
	
	@JoinColumn(name = "id")
	private Cliente clientes;
	


	
	@Override
	public String toString() {
		return "Cliente_Rol [id=" + id + ", roles_id=" + roles_id + "]";
	}
	
	
	
}
