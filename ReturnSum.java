/* WAP to return the sum of two Integer taking input form user
 * 1<=n<=1000
 */

import java.util.Scanner;

public class ReturnSum {

    public int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a=sc.nextInt();

        System.out.println("Enter Second number : ");
        int b=sc.nextInt();

        sc.close();

        ReturnSum rs=new ReturnSum();

        int sum=rs.sum(a,b);

        System.out.println("Sum is : " + sum);

    }
}