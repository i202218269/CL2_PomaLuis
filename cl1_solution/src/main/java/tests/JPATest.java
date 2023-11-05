package tests;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Departamento;
import model.Empleado;
import model.Estacionamiento;
import model.Proyecto;
import model.Tarea;
import model.*;

public class JPATest {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();

		tx.begin();

		
		Cuenta cuenta = new Cuenta();
		cuenta.setActiva("S");
		cuenta.setNumeroCuenta("12345678");
		cuenta.setSaldo(new BigDecimal(1350));
		
		
		TipoCuenta tc1 = new TipoCuenta();
		tc1.setDescripcion("Ahorros");
		tc1.setMoneda("Soles");
		
		TipoCuenta tc2 = new TipoCuenta();
		tc1.setDescripcion("Corriente");
		tc1.setMoneda("Dólares");
		
		Movimiento mov1 = new Movimiento();
		mov1.setDescripcion("retiro");
		mov1.setFecha(LocalDate.now());
		mov1.setMonto(new BigDecimal(100));
		
		Cliente cliente = new Cliente();
		cliente.setApellidoPaterno("Poma");
		cliente.setApellidoMaterno("Rosales");
		cliente.setNombres("Luis");
		
	
		
		Rol r = new Rol ();
		r.setActivo("S");
		r.setDescripcion("Ingeniero de sistemas");

		
		
		/*
		
		//////////////
		
		Empleado empleado = new Empleado();
		empleado.setApellidoPaterno("Medina");
		empleado.setApellidoMaterno("Rodríguez");
		empleado.setNombres("Juan");
		empleado.setNroHijos(4);
		empleado.setSueldo(new BigDecimal(2000));
		empleado.setFechaNacimiento(LocalDate.now());

		byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/img/goku.jpeg"));
		empleado.setFoto(bytes);

		Departamento d1 = new Departamento();
		d1.setDescripcion("Sistemas");
		empleado.setDepartamento(d1);

		Estacionamiento es1 = new Estacionamiento();
		es1.setDescripcion("ABC-01");
		empleado.setEstacionamiento(es1);
		
		Proyecto p1 = new Proyecto();
		p1.setDescripcion("Proyecto 1");
		
		Proyecto p2 = new Proyecto();
		p2.setDescripcion("Proyecto 2");
		
		Proyecto p3 = new Proyecto();
		p3.setDescripcion("Proyecto 3");
		
		List<Proyecto> proyectos = Arrays.asList(p1, p2, p3);
		
		empleado.setProyectos(proyectos);
		
		Tarea t1 = new Tarea();
		t1.setDescripcion("Tarea 1");
		
		Tarea t2 = new Tarea();
		t2.setDescripcion("Tarea 2");
		
		List<Tarea> tareas = Arrays.asList(t1, t2);
		
		empleado.setTareas(tareas);
		
		*/
		
		// Insertar
		manager.persist(cuenta);

		// Busqueda
//		Empleado e2 = manager.find(Empleado.class, 1L);
//		Files.write(Paths.get("src/main/resources/img/goku.jpeg"), e2.getFoto());

		tx.commit();

		List<Cuenta> lista = manager.createQuery("from Cuenta", Cuenta.class).getResultList();
		for (Cuenta em : lista) {
			System.out.println(em);
		}

	}

}
