
import java.util.*;
public class twoSum
{
	public static void main(String[] args) {
		
		int nums[]={2,7,10};
		int target=9;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}
	  static int[] twoSum(int[] nums, int target) {
        
        int arr[]=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=nums[i];
                    arr[1]=nums[j];
                }
            }
        }
        return arr;
    }
}


