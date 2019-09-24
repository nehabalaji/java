import java.util.Scanner;

public class stud {

	public void display(String a, int b, int c) {
		System.out.println("student name: \t"+a+"\n roll no. :\t"+b+"\n class:\t"+c);
	}
	
	
	public static void main(String[] args) {
		String n;
		int r, c;
		Scanner sc= new Scanner(System.in);
		stud b= new stud();
		n=sc.next();
		r=sc.nextInt();
		c=sc.nextInt();
		
		b.display(n, r, c);
		
		
	}
}
