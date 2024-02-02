package arcesium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ThreeSumVariation {

    public int[] findTriplet(int[] nums){
        Arrays.sort(nums);
        int[] res = new int[3];
        int end=nums.length;
        int start=0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            int[] searchArray= Arrays.copyOfRange(nums,i+1,end);
            List<Integer> listToSearch = Arrays.asList(Arrays.stream(searchArray).boxed().toArray(Integer[]::new));
            int target=nums[start]+nums[i];
            if(listToSearch.contains(target)){
                res[0]=nums[start];
                res[1]=nums[i];
                res[2]=res[0]+res[1];
            }
            if(i==end-1){
                ++start;
                i=start;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        int[] nums={5, 32, 1, 7, 10, 50, 19, 21, 2};
        int[] res = new ThreeSumVariation().findTriplet(nums);
        for (int x : res) System.out.println(x);
    }
}
