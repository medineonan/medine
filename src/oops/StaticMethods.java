
package oops;

public class StaticMethods {
	int sumOfArrays(int [] array) {
		int sumOfArrays= array[0];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
	}
	return sumOfArrays;
}
	public static void main(String[] args) {
	StaticMethods obj=new StaticMethods();
		int[] array= {10,20,38,12};
		System.out.println(obj.sumOfArrays(array));
	}
}





