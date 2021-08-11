package Views;

import javax.swing.*;

import Controllers.Controller;

public class ViewDelete extends JFrame {

	public JPanel contentPane;
	
	public JButton Eliminar = new JButton ("Eliminar");
	
	public JLabel estado = new JLabel ();
	
	public JLabel id_eliminar = new JLabel ("ID del Cliente que quiere eliminar:");
	public static JTextField eliminar_id = new JTextField();
	
	public ViewDelete() {

		setVisible(true);
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Eliminar");
		
		setBounds(400,20,459,271);
	
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		estado.setBounds(0, 157, 201, 30);
		contentPane.add(estado);
		estado.setHorizontalAlignment(SwingConstants.CENTER);
		
		id_eliminar.setBounds(0, 157, 201, 30);
		contentPane.add(id_eliminar);
		id_eliminar.setHorizontalAlignment(SwingConstants.CENTER);
		
		eliminar_id.setBounds(220, 160, 137, 25);
		contentPane.add(eliminar_id);
		
		Eliminar.setBounds(134, 191, 159, 30);
		contentPane.add(Eliminar);
		
		Eliminar.addActionListener(Controller.eliminar);
		
	}

}
