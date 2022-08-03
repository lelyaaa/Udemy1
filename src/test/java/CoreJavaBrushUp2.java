import java.util.ArrayList;
public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        //TODO if else
        int[] arr2 ={1,2,4,5,6,7,8,9,10,122};
        //Outcome should be displayed as all the number divided by 2
        // Check if array has multiple of 2
        for(int y=0; y<arr2.length; y++)
        {
            if (arr2[y] % 2 == 0)
            {
                System.out.println(arr2[y]);
                break; // if we achieved our goal the execution will stop if we're using BREAK
            }
            else
            {
                System.out.println(arr2[y] + " - is not multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList<String>();
        // dynamic ArrayList where we can dynamically change and increase the value
        // create object of the class - object.method (give the access to any method under that class)
        // class (ArrayList) Object (a) = operator (new) class (ArrayList())
        a.add("Leila");
        a.add("Kim");
        a.add("An");
//        a.remove(2);
//        a.get(4);
        System.out.println(a.get(2));
    }
}
