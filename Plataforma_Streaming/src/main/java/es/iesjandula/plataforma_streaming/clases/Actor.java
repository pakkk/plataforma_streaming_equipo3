package es.iesjandula.plataforma_streaming.clases;
import java.io.Serializable;

/**
 * This is the Actors class
 * @author Miguel
 */

public class Actor implements Comparable<Actor>, Serializable
{
	//Name of actor
    private String name;
    //Last Name of Actor
    private String lastName;
    //Gender of Actor
    private String gender;
    //Age of Actor
    private int age;
    //Nationality of actor
    private String nationality;
    
    /**
	 * Parameterized constructor
	 * @param name Actor's first name
	 * @param lastName Actor's last name
	 * @param gender Actor's gender
	 * @param age Actor's age
	 * @param nationality Actor's nationality
	 * */
    public Actor(String name, String lastName, String gender, int age, String nationality)
    {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }
    /**
     * Default constructor
     */
    public Actor() 
    {
    	this.name ="Without name";
        this.lastName = "Without lastName";
        this.gender = "MEN";
        this.age = 20;
        this.nationality = "Spain";
    }
    /**
	 * Returns the value of the Name attribute
	 * @return Object's first name
	 * */
    public String getName()
    {
        return this.name;
    }
    
    /**
	 * Assigns a new value to the name attribute
	 * @param name New first name to be assigned
	 * */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
	 * Returns the value of the lastName attribute
	 * @return Object's last name
	 * */
    public String getlastName()
    {
        return this.lastName;
    }
    
    /**
	 * Assigns a new value to the lastName attribute
	 * @param lastName New last name to be assigned
	 * */
    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    /**
	 * Returns the value of the Gender attribute
	 * @return Object's gender
	 * */
    public String getGender()
    {
        return this.gender;
    }
    
    /**
	 * Assigns a new value to the gender attribute
	 * @param gender New gender to be assigned
	 * */
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    /**
	 * Returns the value of the Age attribute
	 * @return Object's age
	 * */
    public int getAge()
    {
        return this.age;
    }
    
    /**
	 * Assigns a new value to the age attribute
	 * @param age New age to be assigned
	 * */
    public void setAge(int age)
    {
        this.age = age;
    }
    
    /**
	 * Returns the value of the Nationality attribute
	 * @return Object's nationality
	 * */
    public String getNationality()
    {
        return this.nationality;
    }
    
    /**
	 * Assigns a new value to the nationality attribute
	 * @param nationality New nationality to be assigned
	 * */
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    
    /**
	 * Returns a string representation of the object
	 * @return String representing the Actors object
	 * */
    @Override
    public String toString()
    {
        return "Actors{" + "Name= " + this.name + ", lastName= " + this.lastName + ", Gender= " + this.gender + ", Age= " + this.age + ", Nationality= " + this.nationality + '}';
    }
    
    /**
	 * Compares actors
	 * @param a Actors object to be compared
	 * */
    @Override
    public int compareTo(Actor a)
    {
    	int result = this.name.compareTo(a.getName());
        if(result == 0)
        {
        	result = this.lastName.compareTo(a.getlastName());
        }
        return age;
    }
}