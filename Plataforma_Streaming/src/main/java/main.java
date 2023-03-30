import java.io.IOException;
import java.util.Scanner;

import clases.*;
import menus.*;

public class main {

	public static void main(String[] args) {
		
		Audiovisual[] dataBase = null;
		MenuGeneralAudiovisuales mga=new MenuGeneralAudiovisuales(dataBase);
		Audiovisual devuelto=new Audiovisual();
		boolean seguir=true;
		int menu;
		
		
		while(seguir) {
		System.out.println("Hola bienvenid@ a nnuestra plataforma, ya sabes que estamos en PELIS PLUS.Dejanos ayudarte"
				+ "a mejorar tu esperiencia con nosotros. Te mostramos el menú principal");
		System.out.println("\r\n"
				+ "		System.out.println(\"----------------------------------------\");\r\n"
				+ "		System.out.println(\"----MENU GENERAL----\");\r\n"
				+ "		System.out.println(\"1.- Acciones en Referencia a Pelicula o serie\");\r\n"
				+ "		System.out.println(\"2.- Obtener datos estadisticos sobre nuestra filmoteca\");\r\n"
				+ "		System.out.println(\"3.- salir y apagar");
		
		
		
		menu=Integer.parseInt(MyScanner.scanner.nextLine());
		
		if((menu>0)&&(menu<4)&&(menu!=3)){
			if(menu==1) {
				
				System.out.println("Bien, que hacemos con esta pelicula?");
				System.out.println("\r\n"
						+ "		System.out.println(\"----------------------------------------\");\r\n"
						+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
						+ "		System.out.println(\"1.- Dar de alta Pelicula o serie\");\r\n"
						+ "		System.out.println(\"2.- Eliminar Pelicula o serie\");\r\n"
						+ "		System.out.println(\"3.- Buscar Pelicula o serie"
						+ "		System.out.println(\"4.- Modificar Pelicula o serie"
						+ "		System.out.println(\"5.- Salir");
				
				menu=Integer.parseInt(MyScanner.scanner.nextLine());
				if((menu>0)&&(menu<6)&&(menu!=5)){
					if(menu==1) 
						mga.addAudiovisual();
					if(menu==2)
						mga.deleteAudiovisual();
					if(menu==3) {
						devuelto=mga.findAudiovisual();
						System.out.println("Veo que tienes interes en este ejemplar, tienes habilitadas varias opciones"
								+ "te lo voy a mostrar toda su informacion"
								+ "-------------------------------------------------------------");
						devuelto.toString();
					}
					if(menu==4) {
						System.out.println("Un audiovisual se compone de lo siguiente, se puede hacer Acceso, Modificacion,Borrado y Consulta de cualquier coponente, pero primero, dime cual");
						System.out.println("\r\n"
								+ "		System.out.println(\"----------------------------------------\");\r\n"
								+ "		System.out.println(\"----MENU AUDIOVISUAl----\");\r\n"
								+ "		System.out.println(\"1.- Actores\");\r\n"
								+ "		System.out.println(\"2.- Categoria\");\r\n"
								+ "		System.out.println(\"3.- Directores\");\r\n"
								+ "		System.out.println(\"4.- Recomendaciones\");\r\n"
								+ "		System.out.println(\"5.- Subtitulos\");\r\n"
								+ "		System.out.println(\"6.- Salir");
						
						menu=Integer.parseInt(MyScanner.scanner.nextLine());
						System.out.println("Sobre que audiovisual quieres hacer esta modificacion");
							devuelto=mga.findAudiovisual();
						
						if((menu>0)&&(menu<7)&&(menu!=6)){
							if(menu==1) {
								MenuActores ma =new MenuActores(devuelto);
								ma.startMenu();
							}else if(menu==2) {
								MenuCategorias mc =new MenuCategorias(devuelto);
								mc.startMenu();
							}else if(menu==3) {
								MenuDirector md = new MenuDirector(devuelto);
								md.startMenu();	
							}else if(menu==4) {
								MenuRecomendaciones mrc = new MenuRecomendaciones(devuelto);
								mrc.startMenu();
							}else if(menu==5) {
								MenuSubtitulos ms =new MenuSubtitulos (devuelto);
								ms.starMenu();	
							}
							menu=-1;
						}
					}
				}
			}else if (menu==2) {
				
			}
		}

	}
		
	}
}


