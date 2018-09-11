import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
       int notice=0; //oat median=0.0;
        
        for(int i=d;i<expenditure.length;i++)
        {
            if(median( d, expenditure,  i)*2<=expenditure[i])
        {
            notice=notice+1;
        }
            
        }
        System.out.print(notice);
        
        
     return notice;
    }
    static float median(int d, int[] expenditure,int i)
    {   float sum=0;
        for(int j=i-1;j>=i-d;j--)
        { sum=expenditure[j]+sum;
        }
     return (sum/d);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.print(9);
    	//FileWriter out = new FileWriter("notice.txt");
    	FileReader out = new FileReader("notice1.txt");
    	//the right is 1026
    	//System.out.print(out);
    	//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	//BufferedWriter bufferedWriter = new BufferedWriter(out);
    	BufferedReader bufferedReader = new BufferedReader(out);
    	
        //String[] nd = scanner.nextLine().split(" ");
    	//String[] nd = bufferedReader.readLine().split(" ");
        int n = 200000;//Integer.parseInt(nd[0]);
        System.out.print(92);
        int d = 10122;//Integer.parseInt(nd[1]);
        System.out.print(d);

        int[] expenditure = new int[n];

        //String[] expenditureItems = scanner.nextLine().split(" ");
        String[] expenditureItems = bufferedReader.readLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int ex = Integer.parseInt(expenditureItems[1]);
        System.out.println("989");
        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
            //System.out.print(expenditure[i]);
        }

        int result = activityNotifications(expenditure, d);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();
        bufferedReader.close();
        //System.out.print(90);
        //scanner.close();
    }
}
