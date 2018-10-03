import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Korisnik extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Korisnik frame = new Korisnik();
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
	public Korisnik() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		contentPane.add(panel, "name_77265873478107");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PBZ Bankomat");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 538, 56);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Izaberite sljede\u0107u radnju");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 118, 357, 46);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 216, 89, 46);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(459, 216, 89, 46);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(459, 299, 89, 46);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("<- Uplata");
		lblNewLabel_2.setForeground(new Color(240, 255, 240));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(109, 232, 140, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Isplata ->");
		lblNewLabel_3.setForeground(new Color(240, 255, 240));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(335, 232, 114, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Stanje ->");
		lblNewLabel_4.setForeground(new Color(240, 255, 240));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(133, 315, 316, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(10, 299, 89, 46);
		panel.add(btnNewButton_3);
		
		JLabel label = new JLabel("<- Izlaz");
		label.setForeground(new Color(240, 255, 240));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(109, 316, 168, 14);
		panel.add(label);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(10, 380, 89, 46);
		panel.add(btnNewButton_4);
		
		JLabel label_1 = new JLabel("<- Promjena PIN-a");
		label_1.setForeground(new Color(240, 255, 240));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(109, 396, 278, 14);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_1, "name_77282090313277");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("U\u010Ditavanje...");
		lblNewLabel_6.setForeground(new Color(240, 255, 240));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_6.setBounds(10, 249, 538, 46);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("PBZ Bankomat");
		lblNewLabel_5.setBounds(10, 11, 538, 55);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_2, "name_77360938834776");
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("PBZ Bankomat");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_2.setBounds(10, 11, 538, 55);
		panel_2.add(label_2);
		
		JLabel lblNewLabel_7 = new JLabel("Izaberite iznos za isplatu");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 137, 538, 48);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(10, 238, 89, 48);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(459, 238, 89, 48);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(10, 311, 89, 48);
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBounds(459, 311, 89, 48);
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBounds(10, 388, 89, 48);
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBounds(459, 388, 89, 48);
		panel_2.add(btnNewButton_10);
		
		JLabel lblNewLabel_8 = new JLabel("<- 100");
		lblNewLabel_8.setForeground(new Color(240, 255, 240));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setBounds(109, 255, 64, 14);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("<- 300");
		lblNewLabel_9.setForeground(new Color(240, 255, 240));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setBounds(109, 328, 64, 14);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("<- 1000");
		lblNewLabel_10.setForeground(new Color(240, 255, 240));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setBounds(109, 405, 81, 14);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("200 ->");
		lblNewLabel_11.setForeground(new Color(240, 255, 240));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setBounds(374, 255, 75, 14);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("500 ->");
		lblNewLabel_12.setForeground(new Color(240, 255, 240));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setBounds(374, 328, 75, 14);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Drugi iznos ->");
		lblNewLabel_13.setForeground(new Color(240, 255, 240));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_13.setBounds(336, 405, 113, 14);
		panel_2.add(lblNewLabel_13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_3, "name_78694083782099");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Isplata tra\u017Eenog novca...");
		lblNewLabel_14.setForeground(new Color(240, 255, 240));
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(10, 257, 538, 38);
		panel_3.add(lblNewLabel_14);
		
		JLabel label_4 = new JLabel("PBZ Bankomat");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_4.setBounds(10, 11, 538, 55);
		panel_3.add(label_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_4, "name_79250247122469");
		panel_4.setLayout(null);
		
		JLabel label_3 = new JLabel("PBZ Bankomat");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_3.setBounds(10, 11, 538, 55);
		panel_4.add(label_3);
		
		JLabel lblNewLabel_15 = new JLabel("Trenutno stanje na va\u0161em ra\u010Dunu:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_15.setBounds(10, 147, 538, 42);
		panel_4.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_16.setForeground(new Color(240, 255, 240));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setBounds(10, 265, 538, 55);
		panel_4.add(lblNewLabel_16);
		
		JButton btnNewButton_11 = new JButton("Nazad");
		btnNewButton_11.setBounds(199, 482, 165, 55);
		panel_4.add(btnNewButton_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_5, "name_84251168612702");
		panel_5.setLayout(null);
		
		JLabel label_5 = new JLabel("PBZ Bankomat");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_5.setBounds(10, 11, 538, 55);
		panel_5.add(label_5);
		
		JLabel lblNewLabel_17 = new JLabel("Unesite iznos koji \u017Eelite isplatit");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_17.setBounds(25, 121, 298, 41);
		panel_5.add(lblNewLabel_17);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(173, 200, 214, 41);
		panel_5.add(textPane);
		
		JButton button = new JButton("1");
		button.setBounds(23, 272, 76, 57);
		panel_5.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(109, 272, 76, 57);
		panel_5.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(195, 272, 76, 57);
		panel_5.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(23, 340,76, 57);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(109, 340, 76, 57);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(195, 340, 76, 57);
		panel_5.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(23, 412, 76, 57);
		panel_5.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(109, 412, 76, 57);
		panel_5.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(195, 412, 76, 57);
		panel_5.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(23, 480, 76, 57);
		panel_5.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setBounds(109, 480, 76, 57);
		panel_5.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(195, 480, 76, 57);
		panel_5.add(button_11);
		
		JButton button_12 = new JButton("Prekid");
		button_12.setBounds(394, 272, 125, 57);
		panel_5.add(button_12);
		
		JButton button_13 = new JButton("Izbri\u0161i");
		button_13.setBounds(394, 340, 125, 57);
		panel_5.add(button_13);
		
		JButton button_14 = new JButton("Potvrdi");
		button_14.setBounds(394, 412, 125, 57);
		panel_5.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(394, 480, 125, 57);
		panel_5.add(button_15);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_6, "name_84661041876621");
		panel_6.setLayout(null);
		
		JLabel label_6 = new JLabel("PBZ Bankomat");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_6.setBounds(10, 11, 538, 56);
		panel_6.add(label_6);
		
		JLabel lblNewLabel_18 = new JLabel("Upi\u0161ite novi PIN");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_18.setBounds(10, 135, 538, 39);
		panel_6.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Novi PIN:");
		lblNewLabel_19.setForeground(new Color(240, 255, 240));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_19.setBounds(136, 211, 76, 39);
		panel_6.add(lblNewLabel_19);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(221, 211, 195, 39);
		panel_6.add(textPane_1);
		
		JButton b1 = new JButton("1");
		b1.setBounds(23, 272, 76, 57);
		panel_6.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setBounds(109, 272, 76, 57);
		panel_6.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setBounds(195, 272, 76, 57);
		panel_6.add(b3);
		
		JButton b4 = new JButton("4");
		b4.setBounds(23, 340,76, 57);
		panel_6.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setBounds(109, 340, 76, 57);
		panel_6.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setBounds(195, 340, 76, 57);
		panel_6.add(b6);
		
		JButton b7 = new JButton("7");
		b7.setBounds(23, 412, 76, 57);
		panel_6.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setBounds(109, 412, 76, 57);
		panel_6.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setBounds(195, 412, 76, 57);
		panel_6.add(b9);
		
		JButton b10 = new JButton("");
		b10.setBounds(23, 480, 76, 57);
		panel_6.add(b10);
		
		JButton b11 = new JButton("0");
		b11.setBounds(109, 480, 76, 57);
		panel_6.add(b11);
		
		JButton b12 = new JButton("");
		b12.setBounds(195, 480, 76, 57);
		panel_6.add(b12);
		
		JButton b13 = new JButton("Prekid");
		b13.setBounds(394, 272, 125, 57);
		panel_6.add(b13);
		
		JButton b14 = new JButton("Izbri\u0161i");
		b14.setBounds(394, 340, 125, 57);
		panel_6.add(b14);
		
		JButton b15 = new JButton("Potvrdi");
		b15.setBounds(394, 412, 125, 57);
		panel_6.add(b15);
		
		JButton b16 = new JButton("");
		b16.setBounds(394, 480, 125, 57);
		panel_6.add(b16);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(30, 144, 255));
		panel_7.setForeground(new Color(240, 255, 240));
		contentPane.add(panel_7, "name_85886152429528");
		panel_7.setLayout(null);
		
		JLabel label_7 = new JLabel("PBZ Bankomat");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_7.setBounds(10, 11, 538, 55);
		panel_7.add(label_7);
		
		JLabel lblNewLabel_20 = new JLabel("Upi\u0161ite iznos koji \u017Eelite uplatit");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_20.setBounds(10, 152, 538, 42);
		panel_7.add(lblNewLabel_20);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(152, 205, 211, 34);
		panel_7.add(textPane_2);
		
		JButton b110 = new JButton("1");
		b110.setBounds(23, 272, 76, 57);
		panel_7.add(b110);
		
		JButton b22 = new JButton("2");
		b22.setBounds(109, 272, 76, 57);
		panel_7.add(b22);
		
		JButton b33 = new JButton("3");
		b33.setBounds(195, 272, 76, 57);
		panel_7.add(b33);
		
		JButton b44 = new JButton("4");
		b44.setBounds(23, 340,76, 57);
		panel_7.add(b44);
		
		JButton b55 = new JButton("5");
		b55.setBounds(109, 340, 76, 57);
		panel_7.add(b55);
		
		JButton b66 = new JButton("6");
		b66.setBounds(195, 340, 76, 57);
		panel_7.add(b66);
		
		JButton b77 = new JButton("7");
		b77.setBounds(23, 412, 76, 57);
		panel_7.add(b77);
		
		JButton b88 = new JButton("8");
		b88.setBounds(109, 412, 76, 57);
		panel_7.add(b88);
		
		JButton b99 = new JButton("9");
		b99.setBounds(195, 412, 76, 57);
		panel_7.add(b99);
		
		JButton b100 = new JButton("");
		b100.setBounds(23, 480, 76, 57);
		panel_7.add(b100);
		
		JButton b111 = new JButton("0");
		b111.setBounds(109, 480, 76, 57);
		panel_7.add(b111);
		
		JButton b122 = new JButton("");
		b122.setBounds(195, 480, 76, 57);
		panel_7.add(b122);
		
		JButton b133 = new JButton("Prekid");
		b133.setBounds(394, 272, 125, 57);
		panel_7.add(b133);
		
		JButton b144 = new JButton("Izbri\u0161i");
		b144.setBounds(394, 340, 125, 57);
		panel_7.add(b144);
		
		JButton b155 = new JButton("Potvrdi");
		b155.setBounds(394, 412, 125, 57);
		panel_7.add(b155);
		
		JButton b166 = new JButton("");
		b166.setBounds(394, 480, 125, 57);
		panel_7.add(b166);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(30, 144, 255));
		contentPane.add(panel_8, "name_86387734190775");
		panel_8.setLayout(null);
		
		JLabel label_8 = new JLabel("PBZ Bankomat");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_8.setBounds(10, 11, 538, 55);
		panel_8.add(label_8);
		
		JLabel lblNewLabel_21 = new JLabel("Uplata novca na ra\u010Dun...");
		lblNewLabel_21.setForeground(new Color(240, 255, 240));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_21.setBounds(10, 240, 538, 54);
		panel_8.add(lblNewLabel_21);
	}
}
