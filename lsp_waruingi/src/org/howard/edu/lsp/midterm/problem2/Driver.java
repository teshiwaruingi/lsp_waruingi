package org.howard.edu.lsp.midterm.problem2;

public class Driver {

	public static void main(String[] args) {
		//different name and age, same ssn
		Person p1 = new Person("name1", "111-11-1111", 25);
        Person p2 = new Person("name2", "111-11-1111", 56);
        System.out.println(p1);  
        System.out.println(p2);
        if (p1.equals(p2)) {
        
            System.out.println("These are the same!"); // in this case, they would be the same
        
        } else {
        
            System.out.println("Not the same!");
        

	}
        
      p1.clear();
      p2.clear();
      // same name and age, different ssn
      p1 = new Person("foo", "111-00-1111", 25);
      p2 = new Person("foo", "111-22-1111", 25);
      System.out.println(p1);
      System.out.println(p2);
      if (p1.equals(p2)) {
          
          System.out.println("These are the same!"); // in this case, they would be the same
      
      } else {
      
          System.out.println("Not the same!");
      p1.clear();
      p2.clear();
      // same name and age, different ssn
      p1 = new Person("bar", "111-34-1111", 7);
      p2 = new Person("bar", "111-33-1111",7);

      System.out.println(p1);
      System.out.println(p2);
      if (p1.equals(p2)) {
          
          System.out.println("These are the same!"); // in this case, they would be the same
      
      } else {
      
          System.out.println("Not the same!");
      

	}
}
}
}
