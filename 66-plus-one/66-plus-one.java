class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i]<9){
                carry=0;
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            carry=1;
        }
        if (carry!=0){
            int[] newArr= new int[digits.length+1];
            newArr[0]=carry;
            for (int i = 0; i <digits.length ; i++) {
                newArr[i+1]=digits[i];
            }
            return newArr;
        }
        return digits;
    }
}