package gridlayout;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

	public Ventana(){
		super("Ventana de Ejemplo");
		setLayout(new GridLayout(3,3));

		b1 = new JButton("Bot�n 1");
		add(b1);
		b2 = new JButton("Bot�n 2");
		add(b2);
		b3 = new JButton("Bot�n 3");
		add(b3);
		b4 = new JButton("Bot�n 4");
		add(b4);
		b5 = new JButton("Bot�n 5");
		add(b5);
		b6 = new JButton("Bot�n 6");
		add(b6);
		b7 = new JButton("Bot�n 7");
		add(b7);
		b8 = new JButton("Bot�n 8");
		add(b8);
		b9 = new JButton("Bot�n 9");
		add(b9);
		
		setSize(400, 300);
		setVisible(true);	
	}

	public static void main(String args[]){
		Ventana v = new Ventana();	
	}
}