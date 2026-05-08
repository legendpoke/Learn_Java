class LaptopDetails{
    String model;
    int price;

    public String toString(){ // Method.
        // Return a readable string instead of the default hash code.
        return model + " : " + price;
    }

    // Check whether two objects are equal.
    public boolean equals(LaptopDetails that){
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
        }
        else{
            return false;
        }
    }
}



public class ObjectClassMethods{
    public static void main(String[]args){
        // Create two laptop objects with the same values.
        LaptopDetails obj1 = new LaptopDetails();
        obj1.model = "dell";
        obj1.price = 1000000;

        LaptopDetails obj2 = new LaptopDetails();
        obj2.model = "dell";
        obj2.price = 1000000;

        // Compare object values using the custom equals() method.
        boolean result = obj1.equals(obj2);
        System.out.println(result);
        System.out.println(obj1.toString());// Prints the result of toString().
    }
}
