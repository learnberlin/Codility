public class BinaryGap {

    public static void main(String[] args){
        int res = solution(100);
        System.out.println("res "+res);
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int quotient = N;
        int reminder = Integer.MAX_VALUE;
        //int[] binaryArr = new int[N/2+1]; //8 = 4
        int i =0;
        String binaryArrStr = "";
        while(quotient > 0){
            reminder = quotient % 2;
            binaryArrStr = binaryArrStr+reminder;
            i++;
            quotient = quotient / 2;
        }
        //1010001
        boolean firstFlag = false;
        boolean secondFlag = false;
        int counter=0;
        int maxCounter = 0;
        char[] binaryArr = binaryArrStr.toCharArray(); //8 = 4
        //101001000
        //0000100101
       System.out.println("binaryArrStr of "+ binaryArrStr);
        System.out.println("binaryArrStr len of "+ binaryArrStr.length());
        //000100101
        for(int j = binaryArr.length-1 ; j >=0 ; j--){
           System.out.println("value of "+ binaryArr[j]);
            if(binaryArr[j] == '1'){
                if(maxCounter < counter ){//0 1, 1 2
                     maxCounter = counter;
                }
                counter = 0;
            }else  if (binaryArr[j] == '0'){
                counter++;
            }


        }

        return maxCounter;
    }
}
