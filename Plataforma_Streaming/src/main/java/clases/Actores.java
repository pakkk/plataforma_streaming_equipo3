package clases;
/**
 * This is class of Actores
 * @author Miguel
 */

public class Actores implements Comparable<Actores> {
    private String name;
    private String lastname;
    private String gender;
    private int age;
    private String nationality;
    
    //This is the default constructor of the class
    public Actores() {
    }
    
    /**
	 * Constructor parametrizado
	 * @param name Nombre del Actor
	 * @param lastname Apellido del Actor
	 * @param sex Sexo del Actor
	 * @param age Edad del Actor
	 * @param nationality Nacionalidad del Actor
	 * */
    public Actores(String name, String lastname, String gender, int age, String nationality) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }
    
    /**
	 * Devuelve el valor del atributo Name
	 * @return Nombre del objeto
	 * */
    public String getName() {
        return name;
    }
    
    /**
	 * Asigna el valor del atributo name
	 * @param name Nuevo nombre que se quiere asignar
	 * */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
	 * Devuelve el valor del atributo Lastname
	 * @return Apellido del objeto
	 * */
    public String getLastname() {
        return lastname;
    }
    
    /**
	 * Asigna el valor del atributo lastname
	 * @param lastname Nuevo apellido que se quiere asignar
	 * */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    /**
	 * Devuelve el valor del atributo Sex
	 * @return Sexo del objeto
	 * */
    public String getGender() {
        return gender;
    }
    
    /**
	 * Asigna el valor del atributo sex
	 * @param sex Nuevo Sexo que se quiere asignar
	 * */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
	 * Devuelve el valor del atributo Age
	 * @return Anio del objeto
	 * */
    public int getAge() {
        return age;
    }
    
    /**
	 * Asigna el valor del atributo Age
	 * @param age Nuevo anio que se quiere asignar
	 * */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
	 * Devuelve el valor del atributo Nationality
	 * @return Nacionalidad del objeto
	 * */
    public String getNationality() {
        return nationality;
    }
    
    /**
	 * Asigna el valor del atributo nationality
	 * @param nationality Nueva Nacionalidad que se quiere asignar
	 * */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    /**
	 * Devuelve un string como representacion del objeto
	 * @return String que representa al objeto Actores
	 * */
    @Override
    public String toString() {
        return "Actores{" + "Nombre= " + name + ", apellido= " + lastname + ", genero= " + gender + ", edad= " + age + ", nacionalidad= " + nationality + '}';
    }
    
    /**
	 * Ordena los Actores
	 * @param a Actores con la se quiere comprobar
	 * */
    @Override
    public int compareTo(Actores a) {
        return this.name.compareTo(a.name);
    }
}