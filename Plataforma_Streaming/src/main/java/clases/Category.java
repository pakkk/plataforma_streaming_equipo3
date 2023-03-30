package clases;
/**
 * Clase que representa la categoria a la que pertenece un objeto audiovisual
 * @author Juan Sutil
 * */
public class Category implements Comparable<Category>{
	
	/**
	 * Nombre de la categoria
	 * */
	private String name;
	
	/**
	 * Descripcion de la categoria
	 * */
	private String description;
	
	/**
	 * Constructor parametrizado
	 * @param name Nombre de la categoria
	 * @param description Descripcion de la categoria
	 * */
	public Category(String name, String descripction) {
		this.name = name;
		this.description = descripction;
	}
	
	/**
	 * Asigna el valor del atributo name
	 * @param name Nuevo nombre que se quiere asignar
	 * */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Devuelve el valor del atributo Name
	 * @return Nombre del objeto
	 * */
	public String getName() {
		return name;
	}
	
	/**
	 * Asigna el valor del atributo description
	 * @param description Nueva descripcion que se quiere asignar
	 * */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Devuelve el valor del atributo description
	 * @return Descripcion del objeto
	 * */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Devuelve un string como representacion del objeto
	 * @return String que representa al objeto
	 * */
	@Override
	public String toString() {
		return "[Name: " + name + " ; Description: " + description + "]";
	}
	
	/**
	 * Compara entre dos categorias
	 * @param o Category con la se quiere comprobar
	 * @return el valor 0 si las dos categorias son iguales; un valor menor a 0 si este nombre es menor que el nombre de o; y un valor superior a 0 si este nombre es mayor que el nombre de o.
	 * */
	@Override
	public int compareTo(Category o) {
		return this.name.compareTo(o.name);
	}	
	
	
}
