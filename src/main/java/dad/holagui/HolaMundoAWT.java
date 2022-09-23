package dad.holagui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundoAWT {

	public static void main(String[] args) {
		
		Label saludarLabel = new Label();
		saludarLabel.setText("Aqui saldra el saludo.");
		saludarLabel.setBounds(20, 20, 120, 50);
		
		Button saludarButton= new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		
//		hacer un lambda con 1 argumento:
//		saludarButton.addActionListener(e -> saludarLabel.setText("hola mundo"));

//		hacer un lambda con mas de 1 argumento: 		
		saludarButton.addActionListener(e -> {
			System.out.println("hola");
			saludarLabel.setText("¡Hola mundo!");
		});
		
		
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludarLabel);
		rootPanel.add(saludarButton);
		
		Frame frame = new Frame();
		frame.setTitle("Hola mundo AWT");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			 public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
	}

}
