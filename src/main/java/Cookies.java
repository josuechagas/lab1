import java.util.Scanner;
public class Cookies 
    { public static void main (String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the number of cookies consumed = ");
        double caloriespcookie=300*10/40;
        double totalcalories=user_input.nextDouble()*caloriespcookie;
        System.out.println("Total calories consumed = "+totalcalories);
    }
}
