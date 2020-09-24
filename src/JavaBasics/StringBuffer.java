package JavaBasics;

import java.util.StringTokenizer;

public class StringBuffer {

public static void main(String[] args) {
	
	StringTokenizer st = new StringTokenizer("my name is raj");
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	System.out.println(st.nextToken());
}
}