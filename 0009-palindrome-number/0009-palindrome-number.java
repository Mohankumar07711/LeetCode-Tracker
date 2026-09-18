class Solution {
    public static  boolean isPalindrome(int x) {
        int temp=x;
        int number=0;
        while (temp>0){
            int value=temp%10;
            number=number*10+value;
            temp=temp/10;
        }
        if(number==x){
            return true;
        }
        else{
            return false;
        }
        }
}
class main{
    public static void main(String args[]){
       if(Solution.isPalindrome(110)) {
        System.out.println("true");
       }
       else{
        System.out.println("false");
       }
    }
    }
