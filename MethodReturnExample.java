class MusicPlayer{
    // void means the method does not return a value.
    public void playmusic(){// Method.
        System.out.println("playing music..");
    }
    // The return type tells what kind of value the method returns.
    // For example, use int for integer values and String for text values.
    public String getmepen( int cost){
        if(cost >= 10){
            return "pen";
        }
        return "nothing" ;       
    }
}



public class MethodReturnExample {
    public static void main(String[]args){
        // Create an object to call void and return-value methods.
        MusicPlayer obj = new MusicPlayer();
        obj.playmusic();
        String str = obj.getmepen(100);
        System.out.println(str);
    }
}
