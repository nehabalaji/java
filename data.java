import java.util.Scanner;

public class data {
public void display(String a, int b, String c) {
	System.out.println("name:\t"+a+"\n age:\t"+b+"\n profession:\t"+c);
}
public static void main(String[] args) {
	String x, y;
	int z;
	Scanner sc=new Scanner(System.in);
	data d=new data();
	System.out.println("Enter the name:");
	x=sc.next();
	System.out.println("Enter the age:");
	z=sc.nextInt();
	System.out.println("Enter the profession:");
	y=sc.next();
	d.display(x, z, y);
	
}
}
 