// The interface describes what every computer must be able to do.
interface Computer{
    void code();
}

// LaptopComputer gives its own implementation of code().
class LaptopComputer implements Computer{
    public void code(){
        System.out.println("compile ,run,code");

    }
}

// DesktopComputer implements the same interface with different behavior.
class DesktopComputer implements Computer{
    public void code(){
        System.out.println("compile,run: faster");
    }
}

// Developer depends on the Computer interface instead of a specific computer type.
class Developer{
    public void devapp(Computer computer){
        computer.code();
        System.out.println("develop app");
    }
}






public class NeedOfInterface {
    public static void main(String[]args){
        Developer obj = new Developer();

        Computer obj1 = new DesktopComputer();
        obj.devapp(obj1);

        Computer obj2 = new LaptopComputer();
        obj.devapp(obj2);

    }
}
