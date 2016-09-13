package Logica;

import java.awt.Container;
import java.awt.Point;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;

import GUI.G;
import Objetos.*;
import TDALista.*;

public class Mapa {

	private Point[][] m;
	private PowerUp[] pu;
	private PositionList<Obstaculo> o;
	
	public Mapa(FileReader f, G container){
		m=new Point[14][14];
		pu=new PowerUp[4];
		o=new ListaDoblementeEnlazada<Obstaculo>();
		
		
			try{BufferedReader file=new BufferedReader(f);
			String linea;
			
			
			for(int j=0; j<14; j++){
				linea= file.readLine();
				for(int i=0; i<14; i++){
					char crt= linea.charAt(i);
						switch(crt){
						
							case '0':
								ImageIcon img=new ImageIcon(this.getClass().getResource("/Images/vacio.png"));
								Point p=new Point(i*64,j*64);
								m[i][j]=p;
								JLabel obs=new JLabel(img);
								container.add(obs);
								obs.setLocation(p);
								obs.setSize(64,64);
								//o.addLast(new Vacio(m[j][i],img));
								break;
								
							case 'l':
								ImageIcon img2=new ImageIcon(this.getClass().getResource("/Images/Battle_City_bricks.png"));
								JLabel obs2=new JLabel(img2);
								container.add(obs2);
								obs2.setLocation(i*64,j*64);
								obs2.setSize(64,64);
								//o.addLast(new Ladrillo(m[j][i],img2));
								break;
								
							case 'p':
								ImageIcon img3=new ImageIcon(this.getClass().getResource("/Images/Battle_City_trees.png"));
								JLabel obs3=new JLabel(img3);
								container.add(obs3);
								obs3.setLocation(i*64,j*64);
								obs3.setSize(64,64);
								//o.addLast(new Pasto(m[j][i],img3));
								break;
								
							case 'b':
								ImageIcon img4=new ImageIcon(this.getClass().getResource("/Images/Battle_City_wall.png"));
								JLabel obs4=new JLabel(img4);
								container.add(obs4);
								obs4.setLocation(i*64,j*64);
								obs4.setSize(64,64);
								//o.addLast(new Bloque(m[j][i],img4));
								break;
								
							case 'a':
								ImageIcon img5=new ImageIcon(this.getClass().getResource("/Images/Battle_City_water.png"));
								JLabel obs5=new JLabel(img5);
								container.add(obs5);
								obs5.setLocation(i*64,j*64);
								obs5.setSize(64,64);
								//o.addLast(new Agua(m[j][i],img5));
								break;
						}
				}
			}
			file.close();
			}
			catch (IOException e){}

	}
	
	
}
