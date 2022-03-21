import java.util.*;

public class PairwTargetSum {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,6};
        Integer target = 6;

        // List<Integer> result = new ArrayList<>();
        Integer[] result = new Integer[2];
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){

                if(input[i] + input [j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
                
            }
        }
        System.out.print("[");
        for(Integer r: result){
            System.out.print(r + ",");
        }
        System.out.print("]");
        
    }
}
