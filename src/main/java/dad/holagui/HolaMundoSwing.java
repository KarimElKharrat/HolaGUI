package dad.holagui;

//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundoSwing {

	public static void main(String[] args) {
		
		JLabel saludarLabel = new JLabel();
		saludarLabel.setText("Aqui saldra el saludo.");
		saludarLabel.setBounds(20, 20, 150, 50);
		
		JButton saludarButton= new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		
//		hacer un lambda con 1 argumento:
//		saludarButton.addActionListener(e -> saludarLabel.setText("hola mundo"));

//		hacer un lambda con mas de 1 argumento: 		
		saludarButton.addActionListener(e -> {
			System.out.println("hola");
			saludarLabel.setText("�Hola mundo!");
		});
		
		
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludarLabel);
		rootPanel.add(saludarButton);
		
		JFrame frame = new JFrame();
		frame.setTitle("Hola mundo Swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
