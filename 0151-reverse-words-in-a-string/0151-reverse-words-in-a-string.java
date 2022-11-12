class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s = s.trim().replaceAll("\\s+"," ");
        String[] str=s.split(" ");
        
        String arr="";
        for(int i=str.length-1;i>=1;i--){
            arr+=str[i];
            arr+=" ";
        }
       arr=arr+str[0];
        
        return arr;
    }
}