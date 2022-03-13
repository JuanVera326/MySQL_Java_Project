package clases;
import dao.*;
import gui.*;

public class Relaciones {
	VentanaPrincipal miVentanaPrincipal;
	RegistrarPersonasGui miRegistrarPersonasGui;
	RegistrarMascotasGui miRegistrarMascotasGui;
	RegistrarProductosGui miRegistrarProductosGui;
	ConsultarPersonasGui miConsultarPersonasGui;
	Coordinador miCoordinador;
	PersonaDAO miPersonaDao;
	NacimientoDAO miNacimientoDao;
	MascotaDAO miMascotaDao;
	ProductoDAO miProductoDao;
	PersonaProductoDAO miPersonaProductoDao;

	public void iniciar() {
		miVentanaPrincipal = new VentanaPrincipal();
		miRegistrarPersonasGui = new RegistrarPersonasGui(miVentanaPrincipal, true);
		miRegistrarMascotasGui = new RegistrarMascotasGui(miVentanaPrincipal, true, "");
		miRegistrarProductosGui = new RegistrarProductosGui(miVentanaPrincipal, true);
		miConsultarPersonasGui = new ConsultarPersonasGui();
		
		
		miCoordinador = new Coordinador();
		miPersonaDao = new PersonaDAO();
		miNacimientoDao = new NacimientoDAO();
		miMascotaDao = new MascotaDAO();
		miProductoDao = new ProductoDAO();
		miPersonaProductoDao = new PersonaProductoDAO();
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miRegistrarPersonasGui.setCoordinador(miCoordinador);
		miRegistrarMascotasGui.setCoordinador(miCoordinador);
		miRegistrarProductosGui.setCoordinador(miCoordinador);
		miPersonaDao.setCoordinador(miCoordinador);
		miNacimientoDao.setCoordinador(miCoordinador);
		miMascotaDao.setCoordinador(miCoordinador);
		miProductoDao.setCoordinador(miCoordinador);
		miPersonaProductoDao.setCoordinador(miCoordinador);
		miConsultarPersonasGui.setCoordinador(miCoordinador);
		
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setRegistrarPersonas(miRegistrarPersonasGui);
		miCoordinador.setRegistrarProductos(miRegistrarProductosGui);
		miCoordinador.setMiPersonaDao(miPersonaDao);
		miCoordinador.setNacimientoDao(miNacimientoDao);
		miCoordinador.setMiMascotaDao(miMascotaDao);
		miCoordinador.setMiProductoDao(miProductoDao);
		miCoordinador.setPersonaProducto(miPersonaProductoDao);
		miCoordinador.setConsultarPersona(miConsultarPersonasGui);
		
		miVentanaPrincipal.setVisible(true);
	}
}	
