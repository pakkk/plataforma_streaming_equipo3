//This is the class Director

/**
 *
 * @author Alvaro Lopez 
 */

public class Director  implements Comparable <Director>{
    private String name;
    private String lastname;
    private String sex;
    private int age;
    private String nationality;

    
    
    /**
     * Constructor por defecto
     * */
    public Director() {
    }
    
    /**
     * Constructor parametrizado
     * @param name Nombre del director
     * @param lastname Apellidos del director
     * @param sex Sexo del director
     * @param age Edad del director
     * @param nationality Nacionalidad del director
     * */
    public Director(String name, String lastname, String sex, int age, String nationality) {
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
       
    }
    //Getter's and Setter's
    
    /**
     * Returns the value of the variable name
     * @return value attribute name
     * 
     * */
    public String getName() {
        return name;
    }
    
    /**
     * Assigns the value of the variable name
     * @param name new name
     * 
     * */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns the value of the variable Lastname
     * @return value Attribute Lastname
     * 
     * */
    public String getLastname() {
        return lastname;
    }
    
    /**
     * Assigns the value of the variable lastname
     * @param lastname new lastname
     * 
     * */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the value of the sex variable
     * @return value sex attribute
     * 
     * */
    public String getSex() {
        return sex;
    }
    
    /**
	 * Assigns the value of the variable Sex
     * @param sex new sex
     * 
     * */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 
	 * Returns the value of the variable Age
     * @return value Attribute Age
     * 
     * */
    public int getAge() {
        return age;
    }
    /**
     * Assigns the value of the variable age
     * @param age new age
     * 
     * */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the value of the Nationality variable
     * @return value Nationality attribute
     * 
     * */
    public String getNationality() {
        return nationality;
    }
    
    /**
     * Assigns the value of the nationality variable
     * @param nationality new nationality
     * 
     * */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //This is the metod toString with Override
    @Override
    public String toString() {
        return "Actores{" + "Nombre= " + name + ", apellido= " + lastname + ", sexo= " + sex + ", edad= " + age + ", nacionalidad= " + nationality + '}';
    }
    //This is the Override of compareTo.
    @Override
    public int compareTo(Director o) {
        return 0;
        }
    }