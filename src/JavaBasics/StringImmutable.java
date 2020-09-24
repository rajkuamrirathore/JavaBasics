package JavaBasics;

public class StringImmutable {

	public static void main(String[] args) {
	 String s1 = "rajkumari";
	 String s3="comeintomyeyes";
	s1.concat("rathore");
	System.out.println(s1);
	// to print rajkumarirathore
	s1 = s1.concat("ratore");
	System.out.println(s1);
	System.out.println(s1+s3);
	s3=s3+"hellobby";
	System.out.println(s3);
	String s5="raj";
	String s6=s5.concat("50");
	System.out.println(s6);
	}

}
