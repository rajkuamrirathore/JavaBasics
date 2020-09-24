package JavaBasics;

public class Stringcompare2 {

	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		System.out.println(s1==s2);//true (because both refer to same instance)  
		System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
	}

}
