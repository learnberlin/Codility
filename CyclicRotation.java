public class CyclicRotation {
    public static void main(String[] args){
        int[] a = new int[2];
        System.out.println("res "+a[0]);
        int[] res = solution(a,1);

       // System.out.println("res "+res.length);
    }

        public static  int[] solution(int[] A, int K) {
            // write your code in Java SE 8
            if(K==0 || A== null || K == A.length){
                return A;
            }
            if (A.length == 0) {
                return new int[]{};
            }
            int len = A.length;
            int[] resultArr = new int[len];


            //Approach - Rotate the array k times
            //How to apporach rotation
            //3, 8, 9, 7, 6
            //6  3   8   9   7
            //0, 1, 2, 3, 4
            //arr[i] = temp;
            //arr[i] = arr[i-1] //
            //
            for(int j = 0 ; j<K ; j++ ){
                int lastEle = A[len-1];
                int i = len-1;
                for(i = len-1 ; i >0 ; i --){
                    A[i] = A[i-1]; //
                }
                A[i] =lastEle;
            }

            return A;
        }
}
