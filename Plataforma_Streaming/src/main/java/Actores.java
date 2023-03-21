//This is the class Actores

/**
 *
 * @author Miguel
 */

public class Actores implements Comparable {
    private String name;
    private String lastname;
    private String sex;
    private int age;
    private String nationality;
    private double height;
    private double weight;
    
    //This is the default constructor of the class
    public Actores() {
    }
    
    //This is the constructor of the class
    public Actores(String name, String lastname, String sex, int age, String nationality, double height, double weight) {
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }
    //Getter's and Setter's
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    //This is the metod toString with Override
    @Override
    public String toString() {
        return "Actores{" + "Nombre= " + name + ", apellido= " + lastname + ", sexo= " + sex + ", edad= " + age + ", nacionalidad= " + nationality + ", altura= " + height + ", peso= " + weight + '}';
    }
    //This is the Override of compareTo.
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}