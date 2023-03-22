/**
 * This is class of Actores
 * @author Miguel
 */

public class Actores implements Comparable<Actores> {
    private String name;
    private String lastname;
    private String sex;
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
    public Actores(String name, String lastname, String sex, int age, String nationality) {
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
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
    public String getSex() {
        return sex;
    }
    
    /**
	 * Asigna el valor del atributo sex
	 * @param sex Nuevo Sexo que se quiere asignar
	 * */
    public void setSex(String sex) {
        this.sex = sex;
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
        return "Actores{" + "Nombre= " + name + ", apellido= " + lastname + ", sexo= " + sex + ", edad= " + age + ", nacionalidad= " + nationality + '}';
    }
    
    /**
	 * Compara entre dos Actores
	 * @param a Actores con la se quiere comprobar
	 * @return el valor 0 si los Actores son iguales; un valor menor a 0 si este nombre es menor que el nombre de o; y un valor superior a 0 si este nombre es mayor que el nombre de o.
	 * */
    @Override
    public int compareTo(Actores a) {
        return 0;
    }
}