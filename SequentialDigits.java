package arcesium;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String str = String.valueOf(low);
        char start=str.charAt(0);
        String sequenceNum="0";
        int baseAsciiValue=48;
        int ptr=0;
        int end=str.length();
        while(ptr<end && Integer.valueOf(sequenceNum)<high) {
            sequenceNum=sequenceNum.replaceAll("^0+", "");
            sequenceNum += String.valueOf(start - baseAsciiValue+ptr);
            ptr++;
            if(ptr==end && sequenceNum.length()<=end){
                res.add(Integer.valueOf(sequenceNum));
                if(sequenceNum.length()==String.valueOf(high).length()) break;
                start = (char) (start + 1);
                    if(start==String.valueOf(high).charAt(0)){
                        break;
                    }
                    ptr = 0;
                    sequenceNum = "0";
                }
            if(start=='7'){
                int s= (Character.getNumericValue(start) + 4);
                String t =String.valueOf(s);
                start=t.charAt(0);
                ptr=0;
                sequenceNum = "0";
                end=String.valueOf(high).length();
            }
            }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = new SequentialDigits().sequentialDigits(100,300);
        for(int i : res){
            System.out.println(i);
        }

    }


}
