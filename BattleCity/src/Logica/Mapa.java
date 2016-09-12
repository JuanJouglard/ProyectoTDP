package Logica;

import java.io.*;
import java.util.Scanner;

import javax.swing.*;

import Objetos.*;

public class Mapa {

	private Punto[][] m;
	private PowerUp[] pu;
	private Obstaculo[] o;
	
	public Mapa(File f, JPanel p){
		try{
			Scanner file = new Scanner(f);
			String linea;
			for(int j=0; j<14; j++){
				linea= file.nextLine();
				for(int i=0; i<14; i++){
					char crt= linea.charAt(i);
						switch(crt){
							case '0':
								p.add(new JLabel("vacio.png"));
								break;
							case 'l':
								p.add(new JLabel("ladrillo.png"));
								break;
							case 'p':
								p.add(new JLabel("pasto.png"));
								break;
							case 'b':
								p.add(new JLabel("bloque.png"));
								break;
							case 'a':
								p.add(new JLabel("agua.png"));
								break;
						}
				}
			}
			file.close();
			}catch(FileNotFoundException e){}
	}
	
	
}
