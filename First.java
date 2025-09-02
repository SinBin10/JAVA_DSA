import java.util.ArrayList;
import java.util.List;

public class First{
    public static void main(String []args){
        System.out.println("Hello AI World");
        byte name = 127;
        long phone = 1112234223423444L;
        char c = 'w';
        double d = 46.77;
        float f = 167.56F;
        boolean isAdult = true;
        String person = "me";
        String friend = new String("friends");
        String name2 = "Binay";
        String name3 = name2.substring(0,2);
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name2.length());

        //fixed size array
        int[] arr = new int[4];
        arr[0] = 23;
        System.out.println(arr[0]);

        //dynamic size array, like vector in java
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(234);
        System.out.println(arr2);
    }
}