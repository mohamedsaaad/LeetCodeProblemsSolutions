class Solution {
    public int reverse(int x) {
        long result=0;
        int size=(x>0)?String.valueOf(x).length():String.valueOf(x).length()-1;
        while(x!=0){
            int digit=x%10;
            result+=digit*Math.pow(10,size-1);
            x/=10;
            size --;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int) result;        
    }
}