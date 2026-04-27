
import java.util.*;
public class TwoSumDeployment {
	
	public static int[] twoSum(int[] numbers, int target) {
		//O(n) time complexity two-pointers approach
		int left = 0;
		int right = numbers.length - 1;
		int sum = 0;
		while(left < right) {
			sum = numbers[left] + numbers[right];
			if (sum == target) {
				return new int[] {left + 1, right + 1};
			}
			else if (sum < target) {
				left++;
			}
			else {
				right--;
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for(int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}

}
