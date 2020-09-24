package BasicsPrograms;

public class Sum {
	

public static void main(String[] args) {
	
int arr[]= {8,5,7,3};
int n= 3;
int s1,s2,i;
s1=0;
s2=0;
for( i=0;i<n;i++)
{
	if(arr[i]>arr[i+1])
	{  s2=s1;
		s1=arr[i+1];
		
	}
}
System.out.println("the smallest number is" + s1);
System.out.println("the smallest number is" + s2);



	}

}
