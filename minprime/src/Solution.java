class Solution {
    public int primePalindrome(int N) {
        int Min;
        Min=N;
        boolean Isprime=IsPrime(Min);
        if(Isprime)
        {return N;}
        while(Min<=200000000)
        {            
            Min++;
            if(IsPalindrome(Min)&&IsPrime(Min))
            {
             
             break;
            }
        } 
        return Min;
        }
    public boolean IsPrime(int N){
        boolean a=true;
        for(int i=2;i<N;i++){
           if(N%i==0){
               a=false;
               break;
           } 
        }
        return a;
    }  
    
    public boolean IsPalindrome(int N){
        boolean b=true;
        int length=0;
        while(N%10!=0){
            length++;
       }
        int[] arrint=new int[length];
        int i=0;
        while(N%10!=0){
             arrint[i]=N%10;
        }
        for(int j=0;j<arrint.length;j++){
            if(arrint[j]!=arrint[arrint.length-j-1])
            {   b=false;
                break;
            }
        }
        return b;
    }
    public void main(String []args) {
    	System.out.print(3);
    }
    
}