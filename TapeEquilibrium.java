public class TapeEquilibrium {

    public static void main(String[] args){
        int[] A = {1,2,3,2,3};
        int res = solution(A);
        System.out.println("res "+res);
    }

    public static int solution(int[] A) {
        if(A==null || A.length <=0){
            return -1;
        }
        if(A.length==1){
            return A[0];
        }
        long sumAllElements = 0;
        for(int i=0; i<A.length; i++) {
            sumAllElements += A[i];
        }

        int minDiff = Integer.MAX_VALUE;
        int currentDiff = Integer.MAX_VALUE;
        long sumFirstPart = 0;
        long sumSecondPart = 0;

        for(int j=0; j<A.length-1; j++) {
            sumFirstPart += A[j];
            sumSecondPart = sumAllElements - sumFirstPart;
            currentDiff = (int) Math.abs(sumFirstPart - sumSecondPart);
            minDiff = Math.min(currentDiff, minDiff);
        }
        return minDiff;
    }
}
