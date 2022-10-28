package org.howard.edu.lsp.midterm.problem2;

public class Person {

	private String name;
    
    private int age;
    
    private String socialSecurityNumber;
    
    //Write an appropriate constructor for class Person.
    public Person(){
        this.name = "";
        this.socialSecurityNumber = "";
        this.age = 0;
    }
    
    public Person(String name, String socialSecurityNumber, int age) {
    
        // initialize private variables
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.age = age;
    }


    //In class Person, override the default implementation of the toString() method and 
    //return the person’s name, age and social security number. (5 pts.)
    
    public String toString(){
        String str = "Name : " + name + "\tSocial Security Number : " + socialSecurityNumber + "\tAge : " + age + "\n";
        return str;
    }
    
    
    //In class Person, override the default implementation of the equals(Object) method. 
    //Two Person instances are equal if their social security numbers are the same. (10 pts.)
    
    public boolean equals(Person other)
    {
        if(this.socialSecurityNumber.equals(other.socialSecurityNumber))
            return true;
        else
            return false;
    }

    public void clear() {name =""; socialSecurityNumber = ""; age = 0;};

}
