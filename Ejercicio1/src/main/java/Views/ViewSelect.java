package Views;

import javax.swing.*;

import Controllers.Controller;

public class ViewSelect extends JFrame {

	public JPanel contentPane;
	
	public JButton Buscar = new JButton ("Buscar");
	
	public JLabel id = new JLabel ("ID");
	public JLabel nombre = new JLabel ("Nombre");
	public JLabel apellido = new JLabel ("Apellido");
	public JLabel direccion = new JLabel ("Direccion");
	public JLabel dni = new JLabel ("DNI");
	public JLabel fecha = new JLabel ("Fecha");
	
	public JLabel id_buscar = new JLabel ("ID del Cliente que quiere buscar:");
	public static JTextField buscar_id = new JTextField();
	
	public static JLabel id_cliente = new JLabel ();
	public static JLabel nombre_cliente = new JLabel ();
	public static JLabel apellido_cliente = new JLabel ();
	public static JLabel direccion_cliente = new JLabel ();
	public static JLabel dni_cliente = new JLabel ();
	public static JLabel fecha_cliente = new JLabel ();
	
	
	public ViewSelect() {

		setVisible(true);
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Buscador");
		
		setBounds(400,20,459,271);
	
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		id.setHorizontalAlignment(SwingConstants.CENTER);
		
		id.setBounds(0, 11, 34, 30);
		contentPane.add(id);
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		nombre.setBounds(44, 11, 70, 30);
		contentPane.add(nombre);
		apellido.setHorizontalAlignment(SwingConstants.CENTER);
		
		apellido.setBounds(124, 11, 80, 30);
		contentPane.add(apellido);
		direccion.setHorizontalAlignment(SwingConstants.CENTER);
		
		direccion.setBounds(214, 11, 90, 30);
		contentPane.add(direccion);
		dni.setHorizontalAlignment(SwingConstants.CENTER);
		
		dni.setBounds(299, 11, 64, 30);
		contentPane.add(dni);
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		
		fecha.setBounds(373, 11, 70, 30);
		contentPane.add(fecha);
		id_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		id_cliente.setBounds(0, 52, 34, 30);
		contentPane.add(id_cliente);
		nombre_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		nombre_cliente.setBounds(44, 52, 70, 30);
		contentPane.add(nombre_cliente);
		apellido_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		apellido_cliente.setBounds(124, 52, 80, 30);
		contentPane.add(apellido_cliente);
		direccion_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		direccion_cliente.setBounds(214, 52, 91, 30);
		contentPane.add(direccion_cliente);
		dni_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		dni_cliente.setBounds(299, 52, 64, 30);
		contentPane.add(dni_cliente);
		fecha_cliente.setHorizontalAlignment(SwingConstants.CENTER);
		
		fecha_cliente.setBounds(373, 52, 70, 30);
		contentPane.add(fecha_cliente);
		
		id_buscar.setBounds(0, 157, 201, 30);
		contentPane.add(id_buscar);
		id_buscar.setHorizontalAlignment(SwingConstants.CENTER);
		
		buscar_id.setBounds(201, 160, 137, 25);
		contentPane.add(buscar_id);
		
		Buscar.setBounds(134, 191, 159, 30);
		contentPane.add(Buscar);
		
		Buscar.addActionListener(Controller.select);
		
	}

}
