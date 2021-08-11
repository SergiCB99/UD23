package Views;

import javax.swing.*;

import Controllers.Controller;

public class ViewUpdate extends JFrame {

public JPanel contentPane;
	
	public JButton Actualizar = new JButton ("Actualizar");
	
	public JLabel nombre = new JLabel ("Nombre");
	public JLabel apellido = new JLabel ("Apellido");
	public JLabel direccion = new JLabel ("Direccion");
	public JLabel dni = new JLabel ("DNI");
	public JLabel fecha = new JLabel ("Fecha");
	
	public JLabel id_actualizar = new JLabel ("ID del Cliente que quiere actualizar:");
	public static JTextField actualizar_id = new JTextField();
	
	public static JTextField nombre_cliente = new JTextField ();
	public static JTextField apellido_cliente = new JTextField ();
	public static JTextField direccion_cliente = new JTextField ();
	public static JTextField dni_cliente = new JTextField ();
	public static JTextField fecha_cliente = new JTextField ();
	
	public ViewUpdate() {


		setVisible(true);
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Actualizar");
		
		setBounds(400,20,459,271);
	
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		nombre.setBounds(10, 11, 70, 30);
		contentPane.add(nombre);
		apellido.setHorizontalAlignment(SwingConstants.CENTER);
		
		apellido.setBounds(90, 11, 80, 30);
		contentPane.add(apellido);
		direccion.setHorizontalAlignment(SwingConstants.CENTER);
		
		direccion.setBounds(180, 11, 90, 30);
		contentPane.add(direccion);
		dni.setHorizontalAlignment(SwingConstants.CENTER);
		
		dni.setBounds(280, 11, 64, 30);
		contentPane.add(dni);
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		
		fecha.setBounds(363, 11, 70, 30);
		contentPane.add(fecha);

		
		nombre_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		nombre_cliente.setBounds(10, 52, 70, 30);
		contentPane.add(nombre_cliente);
		apellido_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		apellido_cliente.setBounds(90, 52, 80, 30);
		contentPane.add(apellido_cliente);
		direccion_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		direccion_cliente.setBounds(180, 52, 91, 30);
		contentPane.add(direccion_cliente);
		dni_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		dni_cliente.setBounds(280, 52, 64, 30);
		contentPane.add(dni_cliente);
		fecha_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		fecha_cliente.setBounds(363, 52, 70, 30);
		contentPane.add(fecha_cliente);
		
		id_actualizar.setBounds(0, 157, 201, 30);
		contentPane.add(id_actualizar);
		id_actualizar.setHorizontalAlignment(SwingConstants.CENTER);
		
		actualizar_id.setBounds(201, 160, 137, 25);
		contentPane.add(actualizar_id);
		
		Actualizar.setBounds(134, 191, 159, 30);
		contentPane.add(Actualizar);
		
		Actualizar.addActionListener(Controller.update);
		
	}

}
