package menus;

import java.util.InputMismatchException;
import java.util.Scanner;
import clases.*;

public class MenuActores {

	Audiovisual audioVisual;

	public MenuActores(Audiovisual a) {
		this.audioVisual = a;
	}

	public void startMenu() {

		System.out.println("----------------------------------------");
		System.out.println("----MENU ACTORES----");
		System.out.println("1.- Añadir un nuevo actor");
		System.out.println("2.- Borrar un actor");
		System.out.println("3.- Modificar un actor");
		System.out.println("4.- Buscar un actor");
		
		int menu;
		try (Scanner scanner = new Scanner(System.in)) {
			menu = scanner.nextInt();
		} catch (InputMismatchException ex) {
			menu = 0;
		}
		
		switch (menu) {
		case 1: {
			boolean b = addActor();
			if(b) {
				System.out.println("Actor introducido correctamente");
			}else {
				System.out.println("Actor no introducido");
			}
			break;
		}
		case 2: {
			boolean b = deleteActor();
			if(b) {
				System.out.println("Actor borrado correctamente");
			}else {
				System.out.println("El actor no pudo ser borrado");
			}
			break;
		}case 3: {
			
			boolean b = modifyActor();
			if(b) {
				System.out.println("Actor modificado correctamente");
			}else {
				System.out.println("El actor no pudo ser modificado");
			}
			break;
		}
		case 4: {
			int b = findActor();
			if(b == 0) {
				System.out.println("No existen actores que cumplan su condicion");
			}
			break;
		}
		default:{
			System.out.println("Opcion invalida");
		}
		}
		
		
	}

	private boolean addActor() {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("--------------------");
			System.out.print("Introduzca el nombre: ");
			String name = sc.nextLine();
			System.out.print("Introduzca los apellidos: ");
			String lastname = sc.nextLine();
			System.out.print("Introduzca el genero: ");
			String gender = sc.nextLine();
			System.out.print("Introduzca la edad: ");
			int age = Integer.valueOf(sc.nextLine());
			System.out.print("Introduzca la nacionalidad: ");
<<<<<<< HEAD
			String nationality= sc.nextLine();
			Actor actor = new Actor(name, lastname, gender, age, nationality);
			a.addsupportingActores(actor);
=======
			String nationality = sc.nextLine();
			Actor actor = new Actor(name, lastname, gender, age, nationality);
			this.audioVisual.addsupportingActores(actor);
>>>>>>> 98f169df0c63e43f0a0bc15cc4893fed5aca6f69
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
<<<<<<< HEAD
	
	static void displayActores(Audiovisual a) {
		
		Actor actores[] = a.getsupportingActores();
		
=======

	private void displayActores() {

		Actor actores[] = this.audioVisual.getsupportingActores();

>>>>>>> 98f169df0c63e43f0a0bc15cc4893fed5aca6f69
		System.out.println("--------------------");
		System.out.println("Lista de actores: ");

		for (int i = 0; i < actores.length; i++) {
			System.out.println(i + ".- " + actores[i].getName() + " " + actores[i].getLastname());
		}

	}
<<<<<<< HEAD
	
	static Actor selectActor(Audiovisual a) {
		
		displayActores(a);
		
		System.out.println("--------------------");
		System.out.print("Introduzca el actor (su numero) que quiera eliminar: ");
		int opcion;
		try (Scanner sc = new Scanner(System.in)){
			opcion = sc.nextInt();
			return a.getsupportingActores()[opcion];
=======

	private int selectActor() {

		displayActores();

		System.out.println("--------------------");
		System.out.print("Introduzca el actor (su numero): ");
		int option;
		try (Scanner sc = new Scanner(System.in)) {
			option = sc.nextInt();
			if ((option > 0) && (option < this.audioVisual.getdirectors().length))
				return option - 1;
			else
				return -1;
>>>>>>> 98f169df0c63e43f0a0bc15cc4893fed5aca6f69
		} catch (InputMismatchException e) {
			return -1;
		}
	}
<<<<<<< HEAD
	
	
=======

	public boolean deleteActor() {
		int posicion = selectActor();
		if(posicion != -1){
			this.audioVisual.deletesupportingActores(posicion);
			return true;
		}else {
			return false;
		}
		
	}
>>>>>>> 98f169df0c63e43f0a0bc15cc4893fed5aca6f69
	
	private boolean modifyActor() {
		int pos = selectActor();
		if(pos != -1) {
			Actor a = this.audioVisual.getsupportingActores()[pos]; System.out.println("--------------------");
			System.out.println(" Campos a modificar: \n" + "1.- name\n" + "2.- lastname\n" + "3.- gender\n" + "4.- age\n"
					+ "5.- nationality\\n");

			int menu;

			try (Scanner scanner = new Scanner(System.in)) {
				menu = scanner.nextInt();
			} catch (InputMismatchException ex) {
				return false;
			}

			switch (menu) {
			case 1: {
				System.out.print("Introduzca el nuevo nombre: ");
				try (Scanner scanner = new Scanner(System.in)) {
					String nombre = scanner.nextLine();
					a.setName(nombre);
				} catch (InputMismatchException e) {
					return false;
				}
				break;
			}
			case 2: {
				System.out.print("Introduzca los nuevos apellidos: ");
				try (Scanner scanner = new Scanner(System.in)) {
					String apellidos = scanner.nextLine();
					a.setLastname(apellidos);
				} catch (InputMismatchException e) {
					return false;
				}
				break;
			}
			case 3: {
				System.out.print("Introduzca el nuevo genero: ");
				try (Scanner scanner = new Scanner(System.in)) {
					String gender = scanner.nextLine();
					a.setGender(gender);
				} catch (InputMismatchException e) {
					return false;
				}
				break;
			}
			case 4: {
				System.out.print("Introduzca la nueva edad: ");
				try (Scanner scanner = new Scanner(System.in)) {
					int edad = scanner.nextInt();
					a.setAge(edad);
				} catch (InputMismatchException e) {
					return false;
				}
				break;
			}
			case 5: {
				System.out.print("Introduzca la nueva nacionalidad: ");
				try (Scanner scanner = new Scanner(System.in)) {
					String nombre = scanner.nextLine();
					a.setName(nombre);
				} catch (InputMismatchException e) {
					return false;
				}
				break;
			}
			default: {
				return false;
			}
			}
			return true;
		}else {
			return false;
		}
		
		
		
	}

	public int findActor() {
		System.out.println("Campos para buscar: \n" + "1.- name\n" + "2.- lastname\n" + "3.- gender\n" + "4.- age\n"
				+ "5.- nationality\n");

		int atributo, cant = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			atributo = scanner.nextInt();
		} catch (InputMismatchException ex) {
			return -1;
		}
		
		switch (atributo) {
			case 1: {
				System.out.println("dime nombre");
				String newText="";
				try (Scanner scanner = new Scanner(System.in)) {
					newText = scanner.nextLine();
				} catch (InputMismatchException ex) {
					return -1;
				}
				for (Actor d : audioVisual.getsupportingActores()) {
					if (d.getName().equals(newText)) {
						System.out.println(d.toString());
						cant++;
					}
				}
				break;
			}
			case 2: {
				System.out.println("dime apellido");
				String newText="";
				try (Scanner scanner = new Scanner(System.in)) {
					newText = scanner.nextLine();
				} catch (InputMismatchException ex) {
					return -1;
				}
				for (Actor d : audioVisual.getsupportingActores()) {
					if (d.getLastname().equals(newText)) {
						System.out.println(d.toString());
						cant++;
					}
				}
				break;
			}
			case 3: {
				System.out.println("dime genero");
				String newText="";
				try (Scanner scanner = new Scanner(System.in)) {
					newText = scanner.nextLine();
				} catch (InputMismatchException ex) {
					return -1;
				}
				for (Actor d : audioVisual.getsupportingActores()) {
					if (d.getGender().equals(newText)) {
						System.out.println(d.toString());
						cant++;
					}
				}
			}
			case 4: {
				System.out.println("dime edad");
				int newAge;
				try (Scanner scanner = new Scanner(System.in)) {
					newAge = scanner.nextInt();
				} catch (InputMismatchException ex) {
					return -1;
				}
				for (Actor d : audioVisual.getsupportingActores()) {
					if (d.getAge() == (newAge)) {
						System.out.println(d.toString());
						cant++;
					}
				}
				break;
			}
			case 5: {
				System.out.println("dime nacionalidad");
				String newText="";
				try (Scanner scanner = new Scanner(System.in)) {
					newText = scanner.nextLine();
				} catch (InputMismatchException ex) {
					return -1;
				}
				for (Actor d : audioVisual.getsupportingActores()) {
					if (d.getNationality().equals(newText)) {
						System.out.println(d.toString());
						cant++;
					}
				}
			}
			default:{
				return -1;
			}
		}
		return cant;
	}

}
