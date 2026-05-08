class car{
    // Instance variables are usually assigned through constructors or methods.
    private String name;
    private int model;

    // A constructor looks like a method, but it has no return type.
    // Its name is always the same as the class name.
    // Constructors are used to initialize objects.
    public car(){   // default constructor
        System.out.println("the constructor");
        model = 2021;
        name = "gt60";
    }

    public car(int m , String n){// Parameterized constructor.
        model = m;
        name = n;

    }

    public String getname(){
        return name;
    }

    public int getmodel(){
        return model;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setmodel(int model){
        this.model = model;
    }



}


public class constructors {
    public static void main(String[]args){
        car obj = new car();
        //car obj1 = new car(2025, "thar");
        // Every time an object is created, its constructor runs first.
        System.out.println(obj.getname() + " " + obj.getmodel());
        //System.out.println(obj1.getname() + " " + obj1.getmodel());
        //obj.setname("lamborghini huracan STO");
        //obj.setmodel(2020);
        //System.out.println(obj.getname() + " " + obj.getmodel());

    }
}
