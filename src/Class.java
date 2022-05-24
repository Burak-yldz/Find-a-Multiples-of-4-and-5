import java.util.Scanner;

public class Class {
    public static void main(String[] args) {

        int k;

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a top number : ");
        k = input.nextInt();

        System.out.println("Multiples of i : ");

        for ( int i=1; i <= k; i*=4 ) {
            System.out.println(i);
        }
        System.out.println("Multiples of j : ");
        for ( int j=1; j <= k; j*=5 ) {
            System.out.println(j);
        }
    }
}
