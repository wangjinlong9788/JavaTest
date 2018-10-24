class Solution {
    //https://leetcode.com/problems/license-key-formatting/
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder s=new  StringBuilder();
        int count=0;
        int n=S.length();
        String emp="";
        if(n==1&&S.charAt(0)!='-') return S.toUpperCase();
        if(n==1&&S.charAt(0)=='-') return emp;
        for(int i=0;i<n;i++){
            if(Character.isDigit(S.charAt(i)) || Character.isLetter(S.charAt(i))){
                count++;
                s.append(S.charAt(i));
                
            }
        }
        StringBuilder snew=new  StringBuilder();
        if(count%K==0){
            for(int i=0;i<s.length();i++){
                snew.append(s.charAt(i));
                if((i+1)%K==0&&i!=s.length()-1){
                    snew.append("-");
                }
            }
        }
        else{
            int offset=count%K;
            for(int i=0;i<offset;i++){
                snew.append(s.charAt(i));
                
            }
             snew.append("-");
             for(int i=offset;i<s.length()&&(offset+1)<s.length();i++){
                snew.append(s.charAt(i));
                if((i+1-offset)%K==0&&i!=s.length()-1){
                    snew.append("-");
                }
            }
            
        }
        
        return new String(snew).toUpperCase();
    }
}