import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args){
        int[] A = {1,2,3,2,3};
        int res = solution(A);
        System.out.println("res "+res);
    }
    public static int solution(int[] A) {
            // write your code in Java SE 8
            if(A==null || A.length <1){
                return -1;
            }
            if(A.length == 1){
                return A[0];
            }
            if(A.length%2 ==0){
                return -1;
            }
            int unpairedELe = -1;


            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i = 0 ; i < A.length ; i++){
                if(map.containsKey(A[i])){
                    map.put(A[i],map.get(A[i])+1);
                }else{
                    map.put(A[i],1);
                }
            }

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int value = entry.getValue();
                if(value%2 != 0){
                    int temp = entry.getKey();
                    unpairedELe = temp;
                }
            }
            return unpairedELe;
        }
}
