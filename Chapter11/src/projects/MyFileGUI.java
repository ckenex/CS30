package projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MyFileGUI {
	
	private JFrame frame;
	File myFile = new File("C:\\zzz.txt");
	JButton delete = new JButton("DELETE");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFileGUI window = new MyFileGUI();
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
	public MyFileGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel prompt = new JLabel("");
		prompt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		prompt.setHorizontalAlignment(SwingConstants.CENTER);
		prompt.setBounds(10, 38, 414, 28);
		frame.getContentPane().add(prompt);
		
		JLabel prompt2 = new JLabel("");
		prompt2.setHorizontalAlignment(SwingConstants.CENTER);
		prompt2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		prompt2.setBounds(10, 66, 414, 28);
		frame.getContentPane().add(prompt2);
		
		JButton keep = new JButton("KEEP");
		keep.setFont(new Font("Tahoma", Font.BOLD, 15));
		keep.setVisible(false);
		keep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prompt.setText("");
				
				prompt2.setText("file has been kept");
				delete.setVisible(false);
				keep.setVisible(false);
			}
		});
		keep.setBounds(152, 99, 128, 40);
		frame.getContentPane().add(keep);
		
		
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prompt.setText("");
				myFile.delete();
				prompt2.setText("file has been deleted");
				delete.setVisible(false);
				keep.setVisible(false);
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 15));
		delete.setBounds(152, 139, 128, 40);
		delete.setVisible(false);
		frame.getContentPane().add(delete);
		
		JButton btnNewButton = new JButton("RUN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try //attempting to create files so long as conditions are met
				{
					myFile.createNewFile();
					prompt.setText("myFile has been created");
				} catch (IOException ex) //catching error and displaying error to user
				{
					prompt.setText("file could not be created.");
					System.err.println("IOException: " + ex.getMessage());
				}
				prompt2.setText("Would you like to keep or delete the file?");
				keep.setVisible(true);
				delete.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(152, 4, 128, 33);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}
