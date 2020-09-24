package JavaBasics;

public class JaggedArray {

	public static void main(String[] args) {
		
		int arr[][]= new int[3][];// here you are declaring that the no of rows is 3
		arr[0]=new int[3];// here you are saying that first row will have 3 columns
		arr[1]=new int[4];//here you are saying that first row will have 4 columns
		arr[2]=new int[5];//here you are saying that first row will have53 columns
		
		//If we are creating odd number of columns in a 2D array, it is known as a jagged array. 
		//In other words, it is an array of arrays with different number of columns.
		
		//initiatin the jagged array
		int count= 0;
		for(int i =0;i<arr.length;i++)
		for(int j=0;j<arr[i].length;j++)
			arr[i][j]=count++;
		
		//printing the jagged array
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}

		
		
		//class name of array creating proxy class
		
		Class c =arr.getClass();
		String name = c.getName();
		System.out.println(name);}
}