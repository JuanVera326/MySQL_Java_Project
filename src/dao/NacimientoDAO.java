package dao;

import java.sql.*;

import com.mysql.cj.xdevapi.Statement;

import bd.Conexion;
import clases.Coordinador;
import vo.NacimientoVO;

public class NacimientoDAO {

	private Coordinador miCoordinador;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	public Long resgistrarNacimiento(NacimientoVO nacimiento) {
		Long idNacimiento = null;
		Connection connection = null;
		Conexion miConexion = new Conexion();
		PreparedStatement preparedStatement = null;
		
		ResultSet resultSet = null;
		
		connection = miConexion.getConnection();
		String consulta = "INSERT INTO nacimiento(ciudad_nacimiento,departamento_nacimiento,fecha_nacimiento,pais_nacimiento)"+ "VALUES (?,?,?,?)";
		
		try {
			preparedStatement = connection.prepareStatement(consulta,java.sql.Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, nacimiento.getCiudadNacimiento());
			preparedStatement.setString(2, nacimiento.getDepartamentoNacimiento());
			preparedStatement.setString(3,
			nacimiento.getFechaNacimiento().toString());

			preparedStatement.setString(4, nacimiento.getPaisNacimiento());
			preparedStatement.execute();
				resultSet=preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
			idNacimiento=resultSet.getLong(1);
				}
			} catch (SQLException e) {
				System.out.println("No se pudo registrar los datos del nacimiento:"+ e.getMessage());

			e.printStackTrace();
				idNacimiento = null;
			} catch (Exception e) {
			System.out.println("No se pudo registrar los datos del nacimiento:"+ e.getMessage());

			e.printStackTrace();
				idNacimiento = null;
			}
			finally {
				miConexion.desconectar();
			}
			System.out.println("El ID del Nacimiento es:" +idNacimiento);
				return idNacimiento;
			}
}
