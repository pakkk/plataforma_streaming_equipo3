package clases;

import java.io.Serializable;

/**
 * This is the Actors class
 * @author Miguel
 */

public class Actor implements Comparable<Actor>, Serializable
{
    private String name;
    private String lastname;
    private String gender;
    private int age;
    private String nationality;
    
    /**
	 * Parameterized constructor
	 * @param name Actor's first name
	 * @param lastname Actor's last name
	 * @param gender Actor's gender
	 * @param age Actor's age
	 * @param nationality Actor's nationality
	 * */
    public Actor(String name, String lastname, String gender, int age, String nationality)
    {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }
    
    /**
	 * Returns the value of the Name attribute
	 * @return Object's first name
	 * */
    public String getName()
    {
        return name;
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
	 * Returns the value of the Lastname attribute
	 * @return Object's last name
	 * */
    public String getLastname()
    {
        return lastname;
    }
    
    /**
	 * Assigns a new value to the lastname attribute
	 * @param lastname New last name to be assigned
	 * */
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    
    /**
	 * Returns the value of the Gender attribute
	 * @return Object's gender
	 * */
    public String getGender()
    {
        return gender;
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
        return age;
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
        return nationality;
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
        return "Actors{" + "Name= " + name + ", Lastname= " + lastname + ", Gender= " + gender + ", Age= " + age + ", Nationality= " + nationality + '}';
    }
    
    /**
	 * Compares actors
	 * @param a Actors object to be compared
	 * */
    @Override
    public int compareTo(Actor a)
    {
        return this.name.compareTo(a.name);
    }
}