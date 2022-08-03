public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
    //TODO Auto-generated method stub
    // VARIABLES & DATA TYPES IN JAVA
    // "data type (int, string ....)"  name variable (it could be any name)  =  data
    int myNum = 5;
    String website = "AloYoga";
    char letter = 'r';
    double dec = 5.99;// decibels is "float" or "double"
    boolean myCard = true;
    System.out.println(myNum + " the value stored in the myNum variable");
    System.out.println("My favorite brand is " + website);
//TODO ARRAYS
    //1rst way ti create array list
    int[] arr = new int [5];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 10;
    arr[3] = 7;
    arr[4] = 9;
    System.out.println(arr[4]);
    //2nd way ti create array list
    int[] arr2 = {1,2,10,7,9,5,8,11};
    System.out.println(arr2[2]);
// TODO for loop
    for(int l =0; l<arr.length; l++ ) //defining syntax of loop //arr.length = 5
    {
        System.out.println(arr[l]);
    }

    for (int l=0; l<arr2.length; l++)
    {
        System.out.println(arr2[l]);
    }
    String[] name = {"Kim", "An", "Li"};
    for (int l = 0; l< name.length; l++)
    {
        System.out.println(name[l]);
    }
    for (String s: name){
        System.out.println(s);
    }
}
}
