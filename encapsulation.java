// Encapsulation means keeping data private and controlling access through methods.
class human{
    // Instance variables should usually be private.
    //private int age = 18;// private means this variable is accessible only inside this class.
    //private String name = "dhruv";


    // Getter methods return private values.
    public int getage(){// Method.
        return age;
    }

    public String getname(){// Method.
        return name;
    }

    // Setter methods update private values.


    private String name;
    private int age;
    public void setage(int a){// Method.
        age = a;
    }

    public void setname(String n){// Method.
        name = n;
    }





}


public class encapsulation {
    public static void main(String[]args){
        human obj = new human();
        obj.setage(30);// Set the age.
        obj.setname("Dhruv");
        System.out.println(obj.getage() + " " + obj.getname());




    
    }
}
