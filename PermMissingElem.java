import java.util.HashSet;
import  java.util.Set;

public class PermMissingElem {

    public static void main(String[] args){
        int[] A = {1,2,3,2,3};
        int res = solution(A);
        System.out.println("res "+res);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int missEle =-1;
        int max = A.length + 1;
        Set<Integer> incompleteSet = new HashSet<Integer>();
        for(int i=0; i<A.length; i++) {
            incompleteSet.add(A[i]);
        }

        for(int i=1; i<max+1; i++) {
            if(!incompleteSet.contains(i)) {
                missEle =  i;
            }
        }
        return missEle;
    }
}
