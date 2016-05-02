package homework7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework7 {
	public static void main(String[] args) throws FileNotFoundException {

//		System.setIn(new FileInputStream("HW7/input.in"));
//		System.setIn(new FileInputStream("HW7/equal7.in"));
		System.setIn(new FileInputStream("HW7/different7.in"));
		Scanner in = new Scanner(System.in);
		System.setOut(new PrintStream("HW7/output.out"));
		String state = in.nextLine();
		in.close();
		int pos = state.indexOf('=');
		Expression a = (new Parser(state.substring(0, pos))).parse();
		Expression b = (new Parser(state.substring(pos + 1, state.length()))).parse();
		System.err.println(state);
//		System.err.println(a.printExp() + " = " + b.printExp());
		System.err.println(a.evaluate().printExp() + " = " + b.evaluate().printExp());
		if (a.compare(b) == 0) {
			System.out.println("EQUAL");
			System.err.println("EQUAL");
		} else {
			System.out.println("DIFFERENT");
			System.err.println("DIFFERENT");
		}
	}
}