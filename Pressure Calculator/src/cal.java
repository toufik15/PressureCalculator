import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.Color;


public class cal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnRadianToGradian;
	private JButton btnGradianToDegree;
	private JButton btnGradianToRadian;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_3;
	private JLabel lblAngleCalculator;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(205, 92, 92));
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		frame.setBounds(100, 100, 329, 703);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(255, 250, 205));
		textField.setBounds(10, 45, 293, 32);
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBackground(new Color(250, 250, 210));
		textField_1.setBounds(10, 123, 293, 32);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Atmospheres To Bars");
		btnNewButton.setBackground(new Color(245, 245, 245));
		btnNewButton.setBounds(10, 214, 293, 32);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d*1.01325;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("Atmospheres");
				textField_3.setText("Bars");
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Millimeter of mercury To kilopascals");
		btnNewButton_1.setBackground(new Color(245, 245, 245));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 431, 293, 32);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d/7.50062;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("millimeter of murcury");
				textField_3.setText("kilopascals");
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Bars To Atmospheres");
		btnNewButton_2.setBackground(new Color(245, 245, 245));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d/1.01325;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("Bars");
				textField_3.setText("Atmospheres");
			}
		});
		btnNewButton_2.setBounds(10, 257, 293, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		btnRadianToGradian = new JButton("kilopascals To Millimeter of mercury");
		btnRadianToGradian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d*7.50062;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("kilopascals");
				textField_3.setText("millimeter of mercury");
			}
		});
		btnRadianToGradian.setBackground(new Color(245, 245, 245));
		btnRadianToGradian.setFont(new Font("Arial", Font.BOLD, 12));
		btnRadianToGradian.setBounds(10, 388, 293, 32);
		frame.getContentPane().add(btnRadianToGradian);
		
		btnGradianToDegree = new JButton("Pascal To Atomospheres");
		btnGradianToDegree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d/101325;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("Pascals");
				textField_3.setText("Atmospheres");
			}
		});
		btnGradianToDegree.setBackground(new Color(245, 245, 245));
		btnGradianToDegree.setFont(new Font("Arial", Font.BOLD, 12));
		btnGradianToDegree.setBounds(10, 300, 293, 38);
		frame.getContentPane().add(btnGradianToDegree);
		
		btnGradianToRadian = new JButton("Atmospheres To Pascal");
		btnGradianToRadian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d*101325;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("Atmospheres");
				textField_3.setText("Pascals");
			}
		});
		btnGradianToRadian.setBackground(new Color(245, 245, 245));
		btnGradianToRadian.setFont(new Font("Arial", Font.BOLD, 12));
		btnGradianToRadian.setBounds(10, 349, 293, 32);
		frame.getContentPane().add(btnGradianToRadian);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBackground(new Color(165, 42, 42));
		lblFrom.setFont(new Font("Arial", Font.BOLD, 15));
		lblFrom.setBounds(10, 98, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Arial", Font.BOLD, 15));
		lblTo.setBounds(10, 179, 46, 14);
		frame.getContentPane().add(lblTo);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(205, 92, 92));
		textField_2.setFont(new Font("Arial", Font.BOLD, 15));
		textField_2.setBounds(50, 93, 179, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(205, 92, 92));
		textField_3.setFont(new Font("Arial", Font.BOLD, 15));
		textField_3.setBounds(35, 174, 194, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton_3 = new JButton("CE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		btnNewButton_3.setBackground(new Color(255, 165, 0));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3.setBounds(236, 175, 68, 28);
		frame.getContentPane().add(btnNewButton_3);
		
		lblAngleCalculator = new JLabel("Pressure Calculator");
		lblAngleCalculator.setForeground(new Color(0, 0, 0));
		lblAngleCalculator.setFont(new Font("Calibri Light", Font.BOLD, 17));
		lblAngleCalculator.setBounds(89, 11, 197, 23);
		frame.getContentPane().add(lblAngleCalculator);
		
		btnNewButton_4 = new JButton("Bars to kilopascals");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d*100;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("Bars");
				textField_3.setText("kilopascals");
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_4.setBackground(new Color(245, 245, 245));
		btnNewButton_4.setBounds(10, 474, 293, 38);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("kilopascals To Bars");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d/100;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("kilopascals");
				textField_3.setText("Bars");
			}
		});
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_5.setBackground(new Color(245, 245, 245));
		btnNewButton_5.setBounds(10, 523, 293, 38);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Atmospheres To kilopascals");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d*101.325;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("Atmospheres");
				textField_3.setText("kilopascals");
			}
		});
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_6.setBackground(new Color(245, 245, 245));
		btnNewButton_6.setBounds(10, 572, 293, 32);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("kilopascals To Atmospheres");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d/101.325;
				String cal = String.format("%.5f",result);
				textField_1.setText(cal);
				textField_2.setText("kilopascals");
				textField_3.setText("Atmospheres");
			}
		});
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_7.setBackground(new Color(245, 245, 245));
		btnNewButton_7.setBounds(10, 615, 293, 35);
		frame.getContentPane().add(btnNewButton_7);
	}
}
