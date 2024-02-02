package arcesium;

import java.util.Arrays;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] temperatures) {


        int[] res = new int[temperatures.length];
        Arrays.fill(res,0);
        int i = 0;
        int j = 1;
        int count = 0;
        while (i<temperatures.length-1 && j<temperatures.length) {
            if(temperatures[j]>temperatures[i]){
                res[i]=j-i;
                i++;
                j=i+1;
                continue;
            }
            else{
                if(j==temperatures.length-1){
                    i++;
                    j=i+1;
                }
                else{
                    j++;
                }
                continue;
            }
        }
        return res;
    }

    public static void main(String[] args) {
int[] arr={77,77,77,77,77,41,77,41,41,77};  //[0,0,0,0,0,1,0,2,1,0]

        arr=new DailyTemperature().dailyTemperatures(arr);
for(int x :arr )
        System.out.print(x + " ");
    }

}
