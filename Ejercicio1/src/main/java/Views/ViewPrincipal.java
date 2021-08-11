package Views;

import javax.swing.*;

import Controllers.Controller;

public class ViewPrincipal extends JFrame {

	public JPanel contentPane;
	
	public JButton Select = new JButton ("Select");
	public JButton Delete = new JButton ("Delete");
	public JButton Update = new JButton ("Update");
	public JButton Insert = new JButton ("Insert");
	
	public JLabel accion = new JLabel ("Que quieres hacer?");
	
	public ViewPrincipal() {

		setVisible(true);
		
		//Al cerrar la principal se cerraran todas
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Principal");
		
		setBounds(400,20,459,271);
	
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Select.setBounds(10, 103, 120, 30);
		contentPane.add(Select);
		
		Delete.setBounds(166, 103, 120, 30);
		contentPane.add(Delete);
		
		Update.setBounds(313, 103, 120, 30);
		contentPane.add(Update);
		
		Insert.setBounds(166, 161, 120, 30);
		contentPane.add(Insert);
		
		accion.setBounds(76, 11, 286, 30);
		contentPane.add(accion);
		accion.setHorizontalAlignment(SwingConstants.CENTER);
	
		Select.addActionListener(Controller.pulsarSelect);
		Delete.addActionListener(Controller.pulsarDelete);
		Update.addActionListener(Controller.pulsarUpdate);
		Insert.addActionListener(Controller.pulsarInsert);
		
	}

}
