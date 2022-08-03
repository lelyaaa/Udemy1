 public class MethodsDemo {
     public static void main(String[] args) {
         MethodsDemo d = new MethodsDemo();
         String name = d.getData();
         System.out.println(name);
         MethodsDemo2 d1 = new MethodsDemo2();
         d1.getUserData();
         getData2();
     }

     public String getData() {
         System.out.println("Hello World!");
         return "Lululemon the best!";
     }

     public static String getData2()   //STATIC make this method as a Class level (no need to use object (d) to call the class)
     {
         System.out.println("Hello World!");
         return "Lululemon the best!";
     }

 }

