import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JProgressBar;

public class Project extends JFrame {

	private JPanel contentPane;
	Timer timer;
	int sekunde = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel menupanel = new JPanel();
		menupanel.setBackground(new Color(30, 144, 255));
		contentPane.add(menupanel, "name_75420240565319");
		menupanel.setLayout(null);
		
		JPanel ucitavanjepanel = new JPanel();
		ucitavanjepanel.setBackground(new Color(30, 144, 255));
		contentPane.add(ucitavanjepanel, "name_75422014483125");
		ucitavanjepanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		contentPane.add(panel, "name_82685174182592");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PBZ Bankomat");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 538, 49);
		menupanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Upi\u0161ite broj kartice za pristup ra\u010Dunu");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 130, 329, 49);
		menupanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Broj kartice:");
		lblNewLabel_2.setForeground(new Color(240, 255, 240));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(109, 208, 111, 38);
		menupanel.add(lblNewLabel_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 27));
		textPane.setBounds(195, 208, 274, 38);
		menupanel.add(textPane);
		 
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton.getText();
				textPane.setText(unos);
			}
		});
		btnNewButton.setBounds(23, 272, 76, 57);
		menupanel.add(btnNewButton);
		
		JButton btnN = new JButton("2");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnN.getText();
				textPane.setText(unos);			}
		});
		btnN.setBounds(109, 272, 76, 57);
		menupanel.add(btnN);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_2.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_2.setBounds(195, 272, 76, 57);
		menupanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_3.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_3.setBounds(23, 340,76, 57);
		menupanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_4.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_4.setBounds(109, 340, 76, 57);
		menupanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_5.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_5.setBounds(195, 340, 76, 57);
		menupanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_6.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_6.setBounds(23, 412, 76, 57);
		menupanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_7.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_7.setBounds(109, 412, 76, 57);
		menupanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_8.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_8.setBounds(195, 412, 76, 57);
		menupanel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBounds(23, 480, 76, 57);
		menupanel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane.getText() + btnNewButton_10.getText();
				textPane.setText(unos);			}
		});
		btnNewButton_10.setBounds(109, 480, 76, 57);
		menupanel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBounds(195, 480, 76, 57);
		menupanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Prekid");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
			}
		});
		btnNewButton_12.setBounds(394, 272, 125, 57);
		menupanel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Izbri\u0161i");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			StringBuilder unos = new StringBuilder(textPane.getText());
			unos.deleteCharAt(textPane.getText().length() - 1);
			String izbr = unos.toString();
			textPane.setText(izbr);
			}
		});
		btnNewButton_13.setBounds(394, 340, 125, 57);
		menupanel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Potvrdi");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menupanel.setVisible(false);
				ucitavanjepanel.setVisible(true);
				timer.start();
				ucitavanjepanel.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnNewButton_14.setBounds(394, 412, 125, 57);
		menupanel.add(btnNewButton_14);
		
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBounds(394, 480, 125, 57);
		menupanel.add(btnNewButton_15);
		
		JLabel lblNewLabel_3 = new JLabel("Provjera podataka...");
		lblNewLabel_3.setForeground(new Color(240, 255, 240));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_3.setBounds(10, 236, 538, 76);
		ucitavanjepanel.add(lblNewLabel_3);

		JLabel label = new JLabel("PBZ Bankomat");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setBounds(10, 21, 538, 49);
		panel.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("Upi\u0161ite svoj PIN");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(10, 148, 538, 51);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PIN:");
		lblNewLabel_5.setForeground(new Color(240, 255, 240));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(147, 210, 67, 35);
		panel.add(lblNewLabel_5);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEnabled(false);
		textPane_1.setBounds(196, 210, 200, 35);
		panel.add(textPane_1);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unos = textPane_1.getText() + button.getText();
				textPane_1.setText(unos);
			}
		});
		button.setBounds(23, 272, 76, 57);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_1.getText();
				textPane_1.setText(unos);
			}
		});
		button_1.setBounds(109, 272, 76, 57);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_2.getText();
				textPane_1.setText(unos);
			}
		});
		button_2.setBounds(195, 272, 76, 57);
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_3.getText();
				textPane_1.setText(unos);
			}
		});
		button_3.setBounds(23, 340,76, 57);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_4.getText();
				textPane_1.setText(unos);
			}
		});
		button_4.setBounds(109, 340, 76, 57);
		panel.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_5.getText();
				textPane_1.setText(unos);
			}
		});
		button_5.setBounds(195, 340, 76, 57);
		panel.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_6.getText();
				textPane_1.setText(unos);
			}
		});
		button_6.setBounds(23, 412, 76, 57);
		panel.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_7.getText();
				textPane_1.setText(unos);
			}
		});
		button_7.setBounds(109, 412, 76, 57);
		panel.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_8.getText();
				textPane_1.setText(unos);
			}
		});
		button_8.setBounds(195, 412, 76, 57);
		panel.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(23, 480, 76, 57);
		panel.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unos = textPane_1.getText() + button_10.getText();
				textPane_1.setText(unos);
			}
		});
		button_10.setBounds(109, 480, 76, 57);
		panel.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(195, 480, 76, 57);
		panel.add(button_11);
		
		JButton button_12 = new JButton("Prekid");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_1.setText("");
				panel.setVisible(false);
				menupanel.setVisible(true);
			}
		});
		button_12.setBounds(394, 272, 125, 57);
		panel.add(button_12);
		
		JButton button_13 = new JButton("Izbri\u0161i");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder izbr = new StringBuilder(textPane_1.getText());
				izbr.deleteCharAt(textPane_1.getText().length() - 1);
				String PIN = izbr.toString();
				textPane_1.setText(PIN);
			}
		});
		button_13.setBounds(394, 340, 125, 57);
		panel.add(button_13);
		
		JButton button_14 = new JButton("Potvrdi");
		button_14.setBounds(394, 412, 125, 57);
		panel.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Korisnik k = new Korisnik();
				k.setVisible(true);
			}
		});
		button_15.setBounds(394, 480, 125, 57);
		panel.add(button_15);
		
		timer = new Timer(50,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sekunde++;
				
				
				
			}
			
		});
	}
}
