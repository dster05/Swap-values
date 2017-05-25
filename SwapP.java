import java.util.*;
public class SwapP{
/*********************************************************************
Daniel J. Gallegos
class implements swap individual values and array elements
**********************************************************************/

public static void main(String[] args){
int[] x = new int[] {5,2,4};
int a, b;
a = 4;
b = 5;
System.out.println("The value for a: "+a+"The value for b: "+b+"before being passed as arguments");
swap(a,b);

System.out.println("The value for a: "+a+"The value for b: "+b+" after the call to swap ");
int c;
	for(c =0; c<3; c++){
		System.out.println("The are the values for the array x before call to swap: "+x[c]);
	}
swapArrayV(x,1,2);
int k;
	for(k =0; k<3; k++){
		System.out.println("The are the values for the array x after call to swap: "+x[k]);
	}
}

public static void swap(int x, int y){
	int temp;
	temp = y;
	y = x;
	x = temp;
	System.out.println("The value of a: "+x+"The value of b: "+y+"during the call of the method swap");
	
}
public static void swapArrayV(int[] list, int i, int j){
	int temp = list[i];
	list[i] = list[j];
	list[j] = temp;
}


}