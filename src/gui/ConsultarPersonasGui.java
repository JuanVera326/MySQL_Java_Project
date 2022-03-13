package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultarPersonasGui extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JTextField textField;
	private JTextField textProfesion;
	private JTextField textTipo;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAño;
	private JTextField textCiudad;
	private JTextField textField_1;
	private JTextField textField_2;
	private Coordinador miCoordinador;
	/**
	 * Create the frame.
	 */
	public ConsultarPersonasGui() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 90, 775, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label2 = new JLabel("Documento:");
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2.setBounds(395, 26, 96, 28);
		panel.add(label2);
		
		JLabel label3 = new JLabel("Nombre:");
		label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label3.setBounds(36, 104, 96, 28);
		panel.add(label3);
		
		JLabel label4 = new JLabel("Telefono:");
		label4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label4.setBounds(36, 157, 96, 28);
		panel.add(label4);
		
		JLabel label5 = new JLabel("Profesion:");
		label5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label5.setBounds(259, 157, 96, 28);
		panel.add(label5);
		
		JLabel label6 = new JLabel("Tipo:");
		label6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label6.setBounds(533, 157, 49, 28);
		panel.add(label6);
		
		JLabel laebl7 = new JLabel("Datos de Nacimiento:");
		laebl7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		laebl7.setBounds(36, 239, 214, 28);
		panel.add(laebl7);
		
		JLabel label8 = new JLabel("Fecha (dd/mm/aaaa):");
		label8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label8.setBounds(36, 278, 214, 28);
		panel.add(label8);
		
		JLabel label10 = new JLabel("Ciudad:");
		label10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label10.setBounds(36, 338, 96, 28);
		panel.add(label10);
		
		JLabel label9 = new JLabel("Departamento:");
		label9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label9.setBounds(282, 338, 128, 28);
		panel.add(label9);
		
		JLabel label11 = new JLabel("Pais:");
		label11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label11.setBounds(552, 338, 74, 28);
		panel.add(label11);
		
		textNombre = new JTextField();
		textNombre.setBounds(104, 110, 616, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(485, 32, 147, 20);
		panel.add(textDocumento);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(104, 163, 128, 20);
		panel.add(textField);
		
		textProfesion = new JTextField();
		textProfesion.setColumns(10);
		textProfesion.setBounds(334, 163, 168, 20);
		panel.add(textProfesion);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(578, 163, 142, 20);
		panel.add(textTipo);
		
		textDia = new JTextField();
		textDia.setColumns(10);
		textDia.setBounds(196, 284, 25, 20);
		panel.add(textDia);
		
		textMes = new JTextField();
		textMes.setColumns(10);
		textMes.setBounds(231, 284, 25, 20);
		panel.add(textMes);
		
		textAño = new JTextField();
		textAño.setColumns(10);
		textAño.setBounds(269, 284, 49, 20);
		panel.add(textAño);
		
		JLabel lblNewLabel = new JLabel("/");
		lblNewLabel.setBounds(225, 287, 25, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setBounds(259, 287, 25, 14);
		panel.add(lblNewLabel_1);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(104, 344, 168, 20);
		panel.add(textCiudad);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(395, 344, 142, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(597, 344, 128, 20);
		panel.add(textField_2);
		
		JLabel label1 = new JLabel("CONSULTAR PERSONAS");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setBounds(301, 22, 222, 44);
		contentPane.add(label1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
