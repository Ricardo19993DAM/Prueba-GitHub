package prueba;

import java.time.LocalDate;

public class Persona {
	protected String nombre;
	protected String dni;
	protected LocalDate fechaNac;
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Persona(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
}
