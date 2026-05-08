/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] squad = {0,1,0,3,12};
		System.out.println();
		for(int i = 0; i <= 1; i++){
		    for (int j = 0; j < squad.length - 1; j++){
		        if(squad[j] == 0 && squad[j+1] != 0){
		            int c = squad[j+1];
		            squad[j+1] = squad[j];
		            squad[j] = c;
		        }
		    }
		}
		for (int k : squad){
		        System.out.print(k);
		    }
	}
}