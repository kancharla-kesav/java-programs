 public class Student 
 {
    int pin;
    String name;
    Student(int p,String n)    //class constructor
    {
        pin=p;
        name=n;
    }
    void display()
    {
        System.out.println("pin:"+pin);
       System.out.println("name:"+name);        //method
    }
    public static void main(String[]args)
    {
        Student s= new Student(51,"kancharala kesav");
        s.display();
    }
}

