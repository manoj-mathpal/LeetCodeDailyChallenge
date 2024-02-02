package arcesium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivideArray {

    public int[][] divideArray(int[] nums, int k) {
            int[][] res = new int[nums.length/3][3];
            Arrays.sort(nums);
            int row=0;
            for (int i = 0; i < nums.length - 2; i = i + 3) {
                if (nums[i + 2] - nums[i + 1] > k || nums[i + 2] - nums[i] > k || nums[i + 1] - nums[i] >k) return new int[][]{};
                else res[row++]= new int[]{nums[i], nums[i + 1], nums[i + 2]};
            }
        return res;
        }

    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] res = new DivideArray().divideArray(nums, k);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print( res[i][j] + " ");
            }
            System.out.print(">>> ");
        }
    }
}