package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Views.ViewDelete;
import Views.ViewInsert;
import Views.ViewSelect;
import Views.ViewUpdate;

public class Sentencias {

	public static Connection conexion;
	
	//METODO QUE ABRE LA CONEXION CON SERVER MYSQL
		public static void openConnection() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion=DriverManager.getConnection("jdbc:mysql://192.168.28.201:3306?useTimezone=true&serverTimezone=UTC","remote","TsysteMS*2021");//credenciales temporales
				System.out.println("Server Connected");
				
			}catch(SQLException | ClassNotFoundException ex  ){
				System.out.println("No se ha podido conectar con mi base de datos");
				System.out.println(ex.getMessage());
				
			}
			
		}
			
		//METODO QUE CIERRA LA CONEXION CON SERVER MYSQL
		public static void closeConnection() {
			try {
		
				conexion.close();
				System.out.println("Server Disconnected");
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error cerrando conexion");
			}
		}
	
		public static void selectCliente () {
			
			openConnection();
			
			try {
				String Querydb = "USE Clientes;";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "SELECT * FROM clientes WHERE id="+ViewSelect.buscar_id.getText()+";";
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);
				
				while (resultSet.next()) {
					ViewSelect.id_cliente.setText(resultSet.getString("id"));
					ViewSelect.nombre_cliente.setText(resultSet.getString("nombre"));
					ViewSelect.apellido_cliente.setText(resultSet.getString("apellido"));
					ViewSelect.direccion_cliente.setText(resultSet.getString("direccion"));
					ViewSelect.dni_cliente.setText(resultSet.getString("dni"));
					ViewSelect.fecha_cliente.setText(resultSet.getString("fecha"));
				}
				
			}catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error en la adquisicion de datos");
			}
			
			closeConnection();
			
		}
		
		public static void deleteCliente() {
			
			openConnection();
			
			try {
				String Querydb = "USE Clientes;";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "DELETE FROM clientes WHERE id = "+ ViewDelete.eliminar_id.getText()+";" ;
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Registro eliminado con exito!");
							
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error borrando el registro especificado");
			}
			
			closeConnection();
			
		}
		
		public static void insertCliente() {
			
			openConnection();
			
			try {
				String Querydb = "USE Clientes;";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) VALUE(" 
						+ "\"" + ViewInsert.nombre_cliente.getText() + "\", "
						+ "\"" + ViewInsert.apellido_cliente.getText() + "\", "
						+ "\"" + ViewInsert.direccion_cliente.getText() + "\", "
						+ "\"" + ViewInsert.dni_cliente.getText() + "\", "
						+ "\"" + ViewInsert.fecha_cliente.getText() + "\"); ";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");;
				
			} catch (SQLException ex ) {
				System.out.println(ex.getMessage());
				System.out.println("Error en el almacenamiento");
			}
			
			closeConnection();
			
		}
		
		public static void updateCliente() {
			
			openConnection();
			
			try {
				String Querydb = "USE Clientes;";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "UPDATE clientes SET "
						+ "nombre="+ "\"" +ViewUpdate.nombre_cliente.getText()+ "\"" +
						",apellido="+ "\"" +ViewUpdate.apellido_cliente.getText()+ "\"" +
						",direccion="+ "\"" +ViewUpdate.direccion_cliente.getText()+ "\"" +
						",dni="+ "\"" +ViewUpdate.dni_cliente.getText()+ "\"" +
						",fecha="+ "\"" +ViewUpdate.fecha_cliente.getText()+ "\"" +
						" WHERE id="+ "\"" +ViewUpdate.actualizar_id.getText()+ "\"" +";" ;
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos actualizados correctamente");;
				
			} catch (SQLException ex ) {
				System.out.println(ex.getMessage());
				System.out.println("Error en el almacenamiento");
			}
			
			closeConnection();
		}
	
}
