import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileApp frame = new FileApp();
					frame.setLocationRelativeTo(null);
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
	public FileApp() {
		setTitle("File Organiser");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 230);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterDirectoryName = new JLabel("Enter Directory Name:");
		lblEnterDirectoryName.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblEnterDirectoryName.setBounds(24, 23, 202, 28);
		contentPane.add(lblEnterDirectoryName);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField.setBorder(null);
		textField.setBounds(24, 64, 434, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 91, 434, 5);
		contentPane.add(separator);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(24, 134, 150, 25);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Organize");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoveApp mp = new MoveApp(textField.getText());
				setVisible(true);
				textField_1.setText("Done");
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(343, 136, 115, 33);
		contentPane.add(btnNewButton);
	}
}
