package hieu.hueic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		
		BufferedReader hieu = new BufferedReader(new InputStreamReader(System.in));
		String a = hieu.readLine();
		String b = hieu.readLine();
		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);
		System.out.println(c+d);
	}

}
