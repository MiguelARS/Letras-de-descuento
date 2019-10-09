package pe.edu.FinalFinache.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombres", length = 35, nullable = false)
	private String nombre;

	@Column(name = "apellidos", length = 40, nullable = false)
	private String apellido;
	
	@Column(name = "dni", length = 8, nullable = false)
	private String dni;

	@OneToMany(mappedBy = "usuario",fetch = FetchType.LAZY)
	private List<Letra> letras;
	
	public Usuario()
	{
		this.letras = new ArrayList<Letra>();
	}

	/*Getter y setters*/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Letra> getLetras() {
		return letras;
	}

	public void setLetras(List<Letra> letras) {
		this.letras = letras;
	}
	
	
}
