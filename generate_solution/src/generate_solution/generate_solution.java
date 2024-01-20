package generate_solution;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class generate_solution {

	public static void main(String[] args) {
		if(args.length != 2) {
			String message = "problem!";
			System.out.println(message);
			System.exit(1);
		}
		
		System.out.println(Arrays.toString(args));
		
		String fn = args[0];
		int number = Integer.parseInt(args[1]);
		int lower = Integer.parseInt(args[2]);
		int upper = Integer.parseInt(args[3]);
		
		
		System.out.println("--> opening (for writing): " + fn);
		System.out.println("--> writing " + number + " ints into file.");
		System.out.println("--> Using UNIF[" + lower + "," + upper + "] distribution");	

		FileWriter file = null;
		
		try {
			file = new FileWriter(fn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			file.write("cool");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<number; i++) {
			
		}
		
		try {
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
