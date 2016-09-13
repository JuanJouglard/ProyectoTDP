package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.General;

import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class G extends JFrame {

	
	private General juego;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					G frame = new G();
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
	public G() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 975);
		juego=new General();
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		juego.crearMapa(this);
		JLabel j=new JLabel(juego.getImagenJugador()[1]);
		j.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent k) {
				//if (k=VK
			}
		});
		j.setSize(64,64);
		j.setLocation(0,0);
		this.getContentPane().add(j);
		this.getContentPane().setComponentZOrder(j,0);
		//j.setComponentZOrder(this,0);
		
		
		
		//getContentPane().setLayout(new FlowLayout());
	}
}
