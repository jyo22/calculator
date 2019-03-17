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
        Calculator cal = new Calculator();
        Integer A = cal.add(x,y);
        System.out.println("Addition of two integers"+x+ "and"+y+ "= " + A);
        Integer S = cal.sub(x,y);
        System.out.println("subtraction of two integers"+x+ "and"+y+ "= " + S);
        Integer M = cal.mul(x,y);
      	System.out.println("multiplication of two integers"+x+ "and"+y+ "= " + M);
      	Float D = cal.div(x,y);
        System.out.println("division of two integers"+x+ "and"+y+ "= " + D);
	}
}