import java.util.Scanner;



public class Finally {

    public static void divisionDemo(int dividend, int divisor) throws ArithmeticException{
        System.out.println("The result is : " + dividend / divisor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Throw exception Example
//        int age = sc.nextInt();

//        if(age < 18){
//            throw new RuntimeException("You are not eligible for this year");
//        }else {
//            System.out.println("You are eligible to vote!");
//        }

//        Throws Exception Example

        divisionDemo(10, 0);


    }
}
