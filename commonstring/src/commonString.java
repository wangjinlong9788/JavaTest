import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class commonString {

    // Complete the commonChild function below.
    static int commonChilds(String s1, String s2) {
        int num=0;
        char[] Arr1 = s1.toCharArray(); 
        char [] Arr2 = s2.toCharArray(); 
        char[][] ARR={s1.toCharArray(),s2.toCharArray()};
        System.out.println(ARR[1][2]);
        System.out.println(Arr1);
        for(int i=0;i<Arr1.length;i++){
            return 1;
        }

        
        return num;
    }
    
    static int  commonChild(String s1, String s2) {
    	char[] s10 = s1.toCharArray(); 
        char [] s20 = s2.toCharArray();

    	// matrix c stores the char count of child string
    	//vector < vector<int> > c(s1.length()+1,vector<int>(s2.length()+1));
    	int[][] c = new int[s1.length()+1][s2.length()+1];
    	for (int i=1;i<=s1.length();i++) {
    	    for (int j=1;j<=s2.length();j++) {        
    	        if (s10[i-1]==s20[j-1]) c[i][j]=c[i-1][j-1]+1;
    	        else c[i][j]=Math.max(c[i][j-1], c[i-1][j]);
    	    }
    	} 

    	return c[s1.length()][s2.length()]; 


    	}

    //private static final Scanner scanner = new Scanner(System.in);

    

	public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = "qazwsxqwaszx";//scanner.nextLine();

        String s2 = "qwaszxcv";//scanner.nextLine();

        int result = commonChild(s1, s2);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
    }
}
