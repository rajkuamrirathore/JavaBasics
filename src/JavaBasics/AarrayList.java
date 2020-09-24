package JavaBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;



public class AarrayList {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  HashSet<String> hs = new HashSet<String>(al);
	
	System.out.println(hs);
	
	}
		
		  
	}
