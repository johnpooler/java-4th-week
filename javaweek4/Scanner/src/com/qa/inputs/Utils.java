package com.qa.inputs;

import java.util.Scanner;

public class Utils {
	
		public static String input(){
			
			Scanner scanner = new Scanner(System.in);
			
			String value=scanner.nextLine();
//			scanner.close();
			return value;

}
}
