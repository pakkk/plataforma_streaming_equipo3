package es.iesjandula.plataforma_streaming.clases;

import java.io.Serializable;

/**
 * This is the class Director
 * @author Alvaro Lopez 
 */

public class Director  implements Comparable <Director>, Serializable
{
	//Name of Director
    private String name;
    //Last Name of Director
    private String lastName;
    //Gender of Director
    private String gender;
    //Age of Director
    private int age;
    //Nationality of Director
    private String nationality;

     /**
     * default constructor
     * */
    public Director() 
    {
    	this.name = "Without name";
        this.lastName = "Without last name";
        this.gender = "Woman";
        this.age = 50;
        this.nationality = "England";
    }
    
    /**
     * parameterized constructor
     * @param name Director name
     * @param lastName Last name of the director
     * @param gender Director's gender
     * @param age Director's age
     * @param nationality Nationality of the director
     * */
    public Director(String name, String lastName, String gender, int age, String nationality)
    {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
       
    }
        
    /**
     * Returns the value of the variable name
     * @return value attribute name
     * 
     * */
    public String getName() 
    {
        return this.name;
    }
    
    /**
     * Assigns the value of the variable name
     * @param name new name
     * @return 
     * 
     * */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Returns the value of the variable lastName
     * @return value Attribute lastName
     * 
     * */
    public String getLastName() 
    {
        return this.lastName;
    }
    
    /**
     * Assigns the value of the variable lastName
     * @param lastName new lastName
     * 
     * */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    /**
     * Returns the value of the gender variable
     * @return value gender attribute
     * 
     * */
    public String getGender() 
    {
        return this.gender;
    }
    
    /**
	 * Assigns the value of the variable gender
     * @param gender new gender
     * 
     * */
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    /**
     * 
	 * Returns the value of the variable Age
     * @return value Attribute Age
     * 
     * */
    public int getAge() 
    {
        return this.age;
    }
    /**
     * Assigns the value of the variable age
     * @param age new age
     * 
     * */
    public void setAge(int age) 
    {
        this.age = age;
    }

    /**
     * Returns the value of the Nationality variable
     * @return value Nationality attribute
     * 
     * */
    public String getNationality() 
    {
        return this.nationality;
    }
    
    /**
     * Assigns the value of the nationality variable
     * @param nationality new nationality
     * 
     * */
    public void setNationality(String nationality) 
    {
        this.nationality = nationality;
    }

    /**
     * Returns a string representation of the object.
     * @return a string representation of the object
     * 
     * */
    @Override
    public String toString() 
    {
        return "Director{" + "Name= " + this.name + ", last name= " + this.lastName + ", gender= " + this.gender + ", age= " + this.age + ", nationality= " + this.nationality + '}';
    }
    
    /**
	 * Compare between two Directors
	 * @param or Director with which you want to check
	 * @return if the value is 0 the two Directors are equal; a value less than 0 if this name is less than the name of o; and a value greater than 0 if this name is greater than the name of o.
	 * */
    @Override
    public int compareTo(Director o) 
    {
        int result = this.name.compareTo(o.getName());
        if(result == 0)
        {
        	result = this.lastName.compareTo(o.getLastName());
        }
        return result;
        
    }
}