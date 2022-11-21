public class FrogJump {
    public static void main(String[] args){
        int res = solution(10,85,30);
        System.out.println("res "+res);
    }
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int minJumps = -1;
        if(X==Y){
            return 0;
        }
        if(X>Y){
            return -1;
        }

        if(D==0){
            return 0;
        }

        //Approach
        //75/30 = 2.5
        //(int) Math.ceil((double)divident / divisor);
        int DiffBtwXY = Y-X;
        minJumps = (int) Math.ceil((double)DiffBtwXY/D);
        return minJumps;
    }
}
