package vo;

import java.util.ArrayList;

public class PersonaVO {
	private Long idPersona;
	private String nombre;
	private String telefono;
	private String profesion;
	private int tipo;
	private NacimientoVO nacimiento;
	private ArrayList<MascotaVO> listaMascotas;
	
	public PersonaVO() {
		
	}
	
	public PersonaVO (Long idPersona, String nombre, String telefono,
			String profesion, int tipo, NacimientoVO nacimiento) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.telefono = telefono;
		this.profesion = profesion;
		this.tipo = tipo;
		this.nacimiento = nacimiento;
		this.listaMascotas=new ArrayList<MascotaVO>();
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public NacimientoVO getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(NacimientoVO nacimiento) {
		this.nacimiento = nacimiento;
	}

	public ArrayList<MascotaVO> getListaMascotas() {
		return listaMascotas;
	}

	public void setListaMascotas(ArrayList<MascotaVO> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}

	@Override
	public String toString() {
		return "PersonaVO [idPersona=" + idPersona + ", nombre=" + nombre + ", telefono=" + telefono + ", profesion="
				+ profesion + ", tipo=" + tipo + ", listaMascotas=" + listaMascotas + "]";
	}
}
