package clases;


import dao.MascotaDAO;
import dao.NacimientoDAO;
import dao.PersonaDAO;
import dao.PersonaProductoDAO;
import dao.ProductoDAO;
import gui.ConsultarPersonasGui;
import gui.RegistrarPersonasGui;
import gui.RegistrarProductosGui;
import gui.VentanaPrincipal;
import vo.PersonaVO;

public class Coordinador {

	private VentanaPrincipal miVentanaPrincipal;
	private RegistrarPersonasGui miRegistrarPersonas;
	private RegistrarProductosGui miRegistrarProductosGui;
	private PersonaDAO miPersonaDao;
	private NacimientoDAO miNacimientoDao;
	private MascotaDAO miMascotaDao;
	private ProductoDAO miProductoDao;
	private PersonaProductoDAO miPersonaProductoDao;
	private ConsultarPersonasGui miConsultarPersonasGui;

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public void setRegistrarPersonas(RegistrarPersonasGui miRegistrarPersonasGui) {
		this.miRegistrarPersonas = miRegistrarPersonasGui;
	}

	public void setRegistrarProductos(RegistrarProductosGui miRegistrarProductosGui) {
		this.miRegistrarProductosGui=miRegistrarProductosGui;
	}

	public void setMiPersonaDao(PersonaDAO miPersonaDao) {
		this.miPersonaDao = miPersonaDao;
	}

	public void setNacimientoDao(NacimientoDAO miNacimientoDao) {
		this.miNacimientoDao = miNacimientoDao;
	}

	public void setMiMascotaDao(MascotaDAO miMascotaDao) {
		this.miMascotaDao = miMascotaDao;
	}

	public void setMiProductoDao(ProductoDAO miProductoDao) {
		this.miProductoDao = miProductoDao;
	}

	public void setPersonaProducto(PersonaProductoDAO miPersonaProductoDao) {
		this.miPersonaProductoDao = miPersonaProductoDao;
	}

	public void setConsultarPersona(ConsultarPersonasGui miConsultarPersonasGui) {
		this.miConsultarPersonasGui = miConsultarPersonasGui;
		
	}
//////////////////////////////////////////////////////////////////////////
	public void registrarPersonas(PersonaVO miPersonaVO) {
		
		
		
	}

	public Long registrarNacimiento(PersonaVO miPersonaVO) {
		miNacimientoDao.resgistrarNacimiento(miPersonaVO.getNacimiento());
		return null;
	}
	
}
