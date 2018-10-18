import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {
//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
    // Complete the isValid function below.
    static String isValid(String s) {
        int[] freq=new int[26];
        char[] s0=s.toCharArray();
        int n=s0.length;
        int count=0;
        for(char c:s0){freq[c-'a']++;}
        //int[] freqCount=new int[26];
        //for(int i=0;i<26;i++){
          //  if(freq[i]!=0)
            //{freqCount[freq[i]]++;}
        //}
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
            //System.out.println(freqCount[freq[i]]);
            ls.add(freq[i]);
        }
        Collections.sort(ls);
        String yn="YES";
        if (ls.size()<=1)return yn;
        int count1=0;
        int count2=0;
        int max0=-1;
        int min0=99999;
        for(int intg:ls){
            max0=Math.max(max0,intg);
            min0=Math.min(min0,intg);
        }
        for(int intg:ls){
            if(intg==max0){count1++;}
            if(intg==min0){count2++;}
        }
    if(max0-min0==0||(count1==ls.size()-1&&min0==1)||(count2==ls.size()-1&&max0-min0==1))
     {yn="YES";}
     else{ yn="NO";}

        
       
        
        
        
        return yn;




    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
