package de.tisan.mcoref.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import de.tisan.mcoref.events.properties.BukkitListener;

public class Test implements BukkitListener{

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		Scanner sc = new Scanner(new File("D:\\blocks.txt"));
		String line = null;
		while(sc.hasNextLine()){
			line = sc.nextLine();
			String tmp = line.substring(line.indexOf("Item"));
			String[] tmp2 = tmp.split(" ");
			String name = tmp2[1];
			
			System.out.println(name.toUpperCase() + "(Items." + name + ")," );
		}
	
	}
	
}
