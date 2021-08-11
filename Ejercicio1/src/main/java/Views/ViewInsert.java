package Views;

import javax.swing.*;

import Controllers.Controller;

public class ViewInsert extends JFrame {

	public JPanel contentPane;
	
	public JButton Insertar = new JButton ("Insertar");
	
	public JLabel nombre = new JLabel ("Nombre");
	public JLabel apellido = new JLabel ("Apellido");
	public JLabel direccion = new JLabel ("Direccion");
	public JLabel dni = new JLabel ("DNI");
	public JLabel fecha = new JLabel ("Fecha");

	public static JTextField nombre_cliente = new JTextField ();
	public static JTextField apellido_cliente = new JTextField ();
	public static JTextField direccion_cliente = new JTextField ();
	public static JTextField dni_cliente = new JTextField ();
	public static JTextField fecha_cliente = new JTextField ();

	
	public ViewInsert() {

		setVisible(true);
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Insertador");
		
		setBounds(400,20,459,271);
	
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		nombre.setBounds(21, 11, 70, 30);
		contentPane.add(nombre);
		apellido.setHorizontalAlignment(SwingConstants.CENTER);
		
		apellido.setBounds(111, 11, 80, 30);
		contentPane.add(apellido);
		direccion.setHorizontalAlignment(SwingConstants.CENTER);
		
		direccion.setBounds(203, 11, 90, 30);
		contentPane.add(direccion);
		dni.setHorizontalAlignment(SwingConstants.CENTER);
		
		dni.setBounds(303, 11, 64, 30);
		contentPane.add(dni);
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		
		fecha.setBounds(373, 11, 70, 30);
		contentPane.add(fecha);
		
		nombre_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		nombre_cliente.setBounds(31, 52, 70, 30);
		contentPane.add(nombre_cliente);
		apellido_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		apellido_cliente.setBounds(111, 52, 80, 30);
		contentPane.add(apellido_cliente);
		direccion_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		direccion_cliente.setBounds(203, 52, 91, 30);
		contentPane.add(direccion_cliente);
		dni_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		dni_cliente.setBounds(303, 52, 64, 30);
		contentPane.add(dni_cliente);
		fecha_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		fecha_cliente.setBounds(373, 52, 70, 30);
		contentPane.add(fecha_cliente);
		
		Insertar.setBounds(134, 191, 159, 30);
		contentPane.add(Insertar);
		
		Insertar.addActionListener(Controller.insertar);
		
	}

}
