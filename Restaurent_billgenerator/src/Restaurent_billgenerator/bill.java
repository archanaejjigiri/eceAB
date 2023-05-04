package Restaurent_billgenerator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 615, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTRO BILL");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(123, 29, 168, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(56, 107, 88, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QNTY");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(56, 177, 70, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "COFFEE-RS.22", "ICECREAM-RS.200"}));
		c1.setBounds(174, 107, 81, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(174, 177, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("COFFEE-RS.22"))
				{
					bill=q*22;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("ICECREAM-RS.200"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
					
				
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(97, 235, 139, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
