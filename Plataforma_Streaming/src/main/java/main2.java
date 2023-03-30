import java.io.IOException;
import java.util.Scanner;

import clases.Audiovisual;
import menus.*;
import menus.MenuGeneralAudiovisuales;

public class main2 {
    public static void main(String[] args) {
        Audiovisual actor1 = new Audiovisual("El duende malvado",  "Spain", 2008,  1000);
        MenuActores m1 = new MenuActores(actor1);
        m1.startMenu();
        
    }

//	public static void main(String[] args) {
//		
//		Audiovisual[] dataBase = null;
//		boolean seguir=true;
//		
//		MenuGeneralAudiovisuales a=new MenuGeneralAudiovisuales(dataBase);
//		Object comun;
//		
//		while(seguir) {
//		System.out.println("Hola bienvenid@ a nnuestra plataforma, ya sabes que estamos en PELIS PLUS.Dejanos ayudarte"
//				+ "a mejorar tu esperiencia con nosotros. Te mostramos el menú principal");
//		System.out.println("\r\n"
//				+ "		System.out.println(\"----------------------------------------\");\r\n"
//				+ "		System.out.println(\"----MENU GENERAL----\");\r\n"
//				+ "		System.out.println(\"1.- Acciones en Referencia a Pelicula o serie\");\r\n"
//				+ "		System.out.println(\"2.- Obtener datos estadisticos sobre nuestra filmoteca\");\r\n"
//				+ "		System.out.println(\"3.- salir y apagar");
//		
//		Scanner scanner=new Scanner (System.in);
//		int menu;
//		menu=scanner.nextInt();
//		
//		if((menu>0)&&(menu<4)&&(menu!=3)){
//			if(menu==1) {
//				
//				System.out.println("Bien, que hacemos con esta pelicula?");
//				System.out.println("\r\n"
//						+ "		System.out.println(\"----------------------------------------\");\r\n"
//						+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
//						+ "		System.out.println(\"1.- Dar de alta Pelicula o serie\");\r\n"
//						+ "		System.out.println(\"2.- Eliminar Pelicula o serie\");\r\n"
//						+ "		System.out.println(\"3.- Buscar Pelicula o serie"
//						+ "		System.out.println(\"4.- Modificar Pelicula o serie"
//						+ "		System.out.println(\"5.- Salir");
//				
//				menu=scanner.nextInt();
//				if((menu>0)&&(menu<6)&&(menu!=5)){
//					if(menu==1) 
//						a.addAudiovisual();
//					if(menu==2)
//						a.deleteAudiovisual();
//					if(menu==3) {
//						Audiovisual devuelto=a.findAudiovisual();
//						System.out.println("Veo que tienes interes en este ejemplar, tienes habilitadas varias opciones");
//						System.out.println("\r\n"
//								+ "		System.out.println(\"----------------------------------------\");\r\n"
//								+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
//								+ "		System.out.println(\"1.- Te puedo mostrar toda su informacion\");\r\n"
//								+ "		System.out.println(\"2.- Podemos modificar o ampliar cualquiera de sus componentes\");\r\n"
//								+ "		System.out.println(\"3.- Salir");
//						
//						menu=scanner.nextInt();
//						if((menu>0)&&(menu<4)&&(menu!=3)){
//							if(menu==1) 
//								devuelto.toString();
//							if(menu==2) {
//								System.out.println("Un audiovisual se compone de lo siguiente, se puede hacer Acceso, Modificacion,Borrado y Consulta de cualquier coponente, pero primero, dime cual");
//								System.out.println("\r\n"
//										+ "		System.out.println(\"----------------------------------------\");\r\n"
//										+ "		System.out.println(\"----MENU AUDIOVISUAl----\");\r\n"
//										+ "		System.out.println(\"1.- Actores\");\r\n"
//										+ "		System.out.println(\"2.- Categoria\");\r\n"
//										+ "		System.out.println(\"3.- Directores\");\r\n"
//										+ "		System.out.println(\"4.- Recomendaciones\");\r\n"
//										+ "		System.out.println(\"5.- Subtitulos\");\r\n"
//										+ "		System.out.println(\"6.- Salir");
//								
//								menu=scanner.nextInt();
//								
//								if((menu>0)&&(menu<7)&&(menu!=6)){
//									if(menu==1) {
//										System.out.println("Bien, que hacemos con Actor?");
//										System.out.println("\r\n"
//												+ "		System.out.println(\"----------------------------------------\");\r\n"
//												+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
//												+ "		System.out.println(\"1.- Dar de alta v\");\r\n"
//												+ "		System.out.println(\"2.- Eliminar \");\r\n"
//												+ "		System.out.println(\"3.- Buscar "
//												+ "		System.out.println(\"4.- Modificar "
//												+ "		System.out.println(\"5.- Salir");
//										menu=scanner.nextInt();
//										if(menu==1) {
//											
//										}else if(menu==2) {
//											
//										}else if(menu==3) {
//											
//										}else if(menu==4) {
//											
//										}else {
//											
//										}
//										
//									}else if(menu==2) {
//										System.out.println("Bien, que hacemos con Categoria?");
//										System.out.println("\r\n"
//												+ "		System.out.println(\"----------------------------------------\");\r\n"
//												+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
//												+ "		System.out.println(\"1.- Dar de alta \");\r\n"
//												+ "		System.out.println(\"2.- Eliminar  \");\r\n"
//												+ "		System.out.println(\"3.- Buscar  "
//												+ "		System.out.println(\"4.- Modificar"
//												+ "		System.out.println(\"5.- Salir");
//										menu=scanner.nextInt();
//										MenuCategorias category=new MenuCategorias();
//										
//										if(menu==1) {
//											category.addCategorias(devuelto);
//											
//										}else if(menu==2) {
//											category.deleteCategories(devuelto);
//										}else if(menu==3) {
//											category.findCategories(devuelto);
//										}else if(menu==4) {
//											category.findCategories(devuelto);
///*ojooo!! esto da error*/					category.modifyCategories(menu, devuelto);
//										}else {
//											
//										}
//										
//									}else if(menu==3) {
//										System.out.println("Bien, que hacemos con Directores?");
//										System.out.println("\r\n"
//												+ "		System.out.println(\"----------------------------------------\");\r\n"
//												+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
//												+ "		System.out.println(\"1.- Dar de alta \");\r\n"
//												+ "		System.out.println(\"2.- Eliminar  \");\r\n"
//												+ "		System.out.println(\"3.- Buscar  "
//												+ "		System.out.println(\"4.- Modificar"
//												+ "		System.out.println(\"5.- Salir");
//										
//									}else if(menu==4) {
//										System.out.println("Bien, que hacemos con Recomendaciones?");
//										System.out.println("\r\n"
//												+ "		System.out.println(\"----------------------------------------\");\r\n"
//												+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
//												+ "		System.out.println(\"1.- Dar de alta \");\r\n"
//												+ "		System.out.println(\"2.- Eliminar  \");\r\n"
//												+ "		System.out.println(\"3.- Buscar  "
//												+ "		System.out.println(\"4.- Modificar"
//												+ "		System.out.println(\"5.- Salir");
//									}else if(menu==5) {
//										System.out.println("Bien, que hacemos con Subtitulos?");
//										System.out.println("\r\n"
//												+ "		System.out.println(\"----------------------------------------\");\r\n"
//												+ "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
//												+ "		System.out.println(\"1.- Dar de alta \");\r\n"
//												+ "		System.out.println(\"2.- Eliminar  \");\r\n"
//												+ "		System.out.println(\"3.- Buscar  "
//												+ "		System.out.println(\"4.- Modificar"
//												+ "		System.out.println(\"5.- Salir");
//									}
//								}
//							}
//								
//						}
//					}
//				}
//			}
//			
//		}
//		}
//			
//		
//
	//}

}
