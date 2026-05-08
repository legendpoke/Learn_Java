class InstanceVariableCalculator{
    int num = 8;// Instance variable.
    public int add(int n1, int n2){// n1 and n2 are local variables.
        return n1+n2;
    }
}


public class InstanceVariableExample {
    public static void main(String[]args){
        //InstanceVariableCalculator calculator = new InstanceVariableCalculator();
        //int result = calculator.add(2,3);
        //System.out.println(result);
        InstanceVariableCalculator obj = new InstanceVariableCalculator();
        obj.num = 9;// This changes the instance variable for this object.
        System.out.println(obj.num);
        InstanceVariableCalculator obj1 = new InstanceVariableCalculator();
        System.out.println(obj1.num);
    }
}
