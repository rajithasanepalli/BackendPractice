import java.util.Scanner;

public class Compoundintrest {
public static void main(String[]args) {
float p,r,n,t,ci;
System.out.println("enter principle,rate of intrest,number of times that intrest is compounded per unit time,and timeperiod");
Scanner scan=new Scanner(System.in);
System.out.println("enter the value of principle");
p=scan.nextFloat();
System.out.println("enter the value of rate of intrest");
r=scan.nextFloat();
System.out.println("no of times that intrest is compounded per unit time");
n=scan.nextFloat();
System.out.println("enter the value of time");
t=scan.nextFloat();
ci=(p*(1+r/n)*(n*t)-p);
System.out.println("compound intrest "+ci);
}
}
