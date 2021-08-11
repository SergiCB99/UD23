package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Models.Sentencias;
import Views.ViewDelete;
import Views.ViewInsert;
import Views.ViewSelect;
import Views.ViewUpdate;

public class Controller {

	public static ActionListener pulsarSelect = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ViewSelect app = new ViewSelect();
		}
	};
	
	public static ActionListener pulsarUpdate = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ViewUpdate app = new ViewUpdate();
		}
	};
	
	public static ActionListener pulsarDelete = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ViewDelete app = new ViewDelete();
		}
	};
	
	public static ActionListener pulsarInsert = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ViewInsert app = new ViewInsert();
		}
	};
	
	public static ActionListener eliminar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Sentencias.deleteCliente();
		}
	};
	
	public static ActionListener insertar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Sentencias.insertCliente();
		}
	};
	
	public static ActionListener select = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Sentencias.selectCliente();
		}
	};
	
	public static ActionListener update = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Sentencias.updateCliente();
		}
	};
	
	
}
