package clases;
/**
 * Class Category from an audioVisual
 * @author Juan Sutil
 * */
public class Category implements Comparable<Category>{
	
	/**
	 * Name of the category
	 * */
	private String name;
	
	/**
	 * Description of the category
	 * */
	private String description;
	
	/**
	 * Parametriced constructor
	 * @param name Name of the category
	 * @param description Descriptionde of the category
	 * */
	public Category(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	/**
	 * Asign the value of the new name
	 * @param name new name
	 * */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Return the value of the name
	 * @return the name
	 * */
	public String getName() {
		return name;
	}
	
	/**
	 * Asign the value of the description
	 * @param description new description
	 * */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Return the value of description
	 * @return Description of the object
	 * */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Return a representation of the object
	 * @return String
	 * */
	@Override
	public String toString() {
		return "[Name: " + name + " ; Description: " + description + "]";
	}
	
	/**
	 * Compare two categories
	 * @param o Category con la se quiere comprobar
	 * @return el valor 0 si las dos categorias son iguales; un valor menor a 0 si este nombre es menor que el nombre de o; y un valor superior a 0 si este nombre es mayor que el nombre de o.
	 * */
	@Override
	public int compareTo(Category o) {
		return this.name.compareTo(o.name);
	}	
	
	
}
