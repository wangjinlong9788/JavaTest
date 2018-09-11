public class Solution {
// Find the smallest prime palindrome greater than or equal to N,
//The answer is guaranteed to exist and be less than 2 * 10^8.
    public int primePalindrome(int N) {
        int Min;
        Min=N;
        boolean Isprime=IsPrime(Min);
        if(Isprime)
        {return N;}
        while(Min<=20000000)
        {            
            Min++;
            
            if(Min==reverse(Min)&&IsPrime(Min))
            {
             //System.out.print(30);
             break;
            }
            //System.out.print(Min+"\n");
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
    public int reverse(int N) {
        int ans = 0;
        while (N > 0) {
            ans = 10 * ans + (N % 10);
            System.out.print(N+"\n");
            N /= 10;
            
        }
        return ans;
    }
    public static void main(String []args) {
    Solution IsOrNot = new Solution();
    //int p=IsOrNot.reverse(9867);
    int p=IsOrNot.primePalindrome(986);
	System.out.print(p);
	//System.out.print(3);
}  
}