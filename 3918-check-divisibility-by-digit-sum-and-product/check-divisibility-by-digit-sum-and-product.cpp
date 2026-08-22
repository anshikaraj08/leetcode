class Solution {
public:
    bool checkDivisibility(int n) {
        int sum=0,product=1;
        int temp=n;
        while(n>0){
            int ld=n%10;
            sum=sum+ld;
            product=product*ld;
            n/=10;
        }
        int r=sum+product;
        // if(temp%sum==0 && temp%product==0){
        //     return true;
        // }
        // return false;
        return temp%r==0;
    }
};