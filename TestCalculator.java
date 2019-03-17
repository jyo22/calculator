        import code.Calculator;
        import java.io.*;
        import java.util.Scanner;
        
        public class TestCalculator {
	    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st integer : ");
        Integer x = in.nextInt();
        System.out.println("enter 2nd integer : ");
        Integer y = in.nextInt();
        Main m=new Main();
        Integer A = m.add(x,y);
        System.out.println("Addition of two integers"+x+ "and"+y+ "= " + A);
        Integer S = m.sub(x,y);
        System.out.println("subtraction of two integers"+x+ "and"+y+ "= " + S);
        Integer M = m.mul(x,y);
      	System.out.println("multiplication of two integers"+x+ "and"+y+ "= " + M);
      	Float D = m.div(x,y);
        System.out.println("division of two integers"+x+ "and"+y+ "= " + D);
	}
}