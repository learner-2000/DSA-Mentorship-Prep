/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
		    arr[i] = sc.nextInt();
		}
		int write = 0;
		for (int read = 0; read < size; read++){
		    if(arr[read] != 0){
		        int t = arr[write];
		        arr[write] = arr[read];
		        arr[read] = t;
		    }
		}
		for(int k : arr){
		    System.out.print(k + " ");
		}
	}
}