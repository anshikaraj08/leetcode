class Solution {
    public int[] plusOne(int[] digits) {
        int digit=0;
        
        
        for(int i=digits.length-1;i>=0;--i){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;//if it's 9 case
        }
        int[] arr=new int[digits.length+1];
        arr[0]=1;//for all 9 case [9,9,9]
        return arr;
    }
}