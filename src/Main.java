import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE;
        int closestSum = 0;
        int L = 0;
        int R = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            L = i+1;
            R = nums.length-1;
            while(L<R){
                int currSum = nums[i] + nums[L] + nums[R];
                int abDist = Math.abs(target - currSum);
                if(abDist < distance){
                    distance = abDist;
                    closestSum = currSum;
                }
                if(currSum < target){
                    L++;
                } else{
                    R--;
                }
            }
        }
        return closestSum;
    }
}

// for loop + 2 pointer approach