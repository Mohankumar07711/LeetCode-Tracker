class Solution {
    public String longestCommonPrefix(String[] strs) {
        String finalVal=strs[0];
        String initialVal=strs[0];
        for (int i=0;i<strs.length-1;i++){
            int b=i+1;
            int c=0;
            if(initialVal.equals("")||strs[b].equals("")){
                 finalVal="";
                break;
            }
            while(initialVal.length()!=c&&
            strs[b].length()!=c){
             if(initialVal.charAt(0)!=strs[b].charAt(0)){
                finalVal="";
                break;
             }
             if(initialVal.charAt(c)==strs[b].charAt(c)){
                finalVal=initialVal.substring(0,c+1);
                c++;
             }
             else{
                break;
             }
            }
            initialVal=finalVal;
            
        }
        return finalVal;
    }
}
class main{
    public static void main(String args[]){
        Solution obj = new Solution();
        obj.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(obj);
    }
}