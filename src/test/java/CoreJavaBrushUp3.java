public class CoreJavaBrushUp3 {
    public static void main(String[] args) {


        //STRING is an object which represent the sequence of char
        //2 ways to define STRING:
        // 1 - String Literal
        String s = "Summer";
        String s1 = "Summer";     // New String not gona be created the original will be used
// 2 -  New. using new memory to allocate new operator to define String
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");   //New String will be created every time
        String w = "Ashley Furniture Tampa";
        String[] splittedString = w.split(" ");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);
        String[] splittedString1 = w.split("Furniture");
        System.out.println(splittedString1[0]);
        System.out.println(splittedString1[1]);
        System.out.println(splittedString1[1].trim());
        for(int i = 0; i<w.length(); i++)
        {
            System.out.println(w.charAt(i)); // printing all character one by one
        }
        System.out.println("================================");
        for (int r = w.length()-1; r>=0; r--)
        {
            System.out.println(w.charAt(r)); //reverse printing all character one by one
        }
    }
}