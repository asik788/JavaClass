package Arrays;

public class ArrayMethods {
public static void main(String[] args) {
	int[] score= {1,2,3,4,5,6};
	dispay(score);
	int[] revscore;
	revscore=reverseArray(score);
	System.out.println("Reversed Array elemts");
	dispay(revscore);	
}
public static void dispay(int[] input) {
	for (int i = 0; i < input.length; i++) {
		System.out.println(input[i]);
	}
}
public static int[] reverseArray(int[] input) {
int[] reverse = new	int[input.length];	
for (int i = 0,j=reverse.length-1; i < input.length; i++,j--) {
reverse[j]=input[i];
}
return reverse;
}
}
		 