import java.util.Scanner;


public class inputDemo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    //    int n ;
    //    n = input.nextInt();
    //    System.out.println("your entered value is : "+n);

    int age;
    String name;
    char fav;

    System.out.println("Enter your name : ");
    name = input.nextLine();
    
    System.out.print("Enter your age :");
    age = input.nextInt();


    System.out.println("Enter your fav char : ");
    fav = input.next().charAt(0);



    // System.out.println(name);
    System.out.println("your name is : "+name +" and your age is : "+age +" and your fav char are : "+fav);

       input.close();
    }
}