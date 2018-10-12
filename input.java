import java.io.*;
import java.util.*;

public class input {
    
public static int S(int k){
        int s=0;
        if(k>=1&&k<=55){
            s=(100003-200003*k+300007*k*k*k)%1000000;
        }
        if(k>=56){
            s=(S(k-24)+S(k-55))%1000000;
        }
        return s;
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String s = scanner.nextLine();
        String[] num=s.split(" ");
        int NUMBER=Integer.parseInt(num[0]);
        int p=Integer.parseInt(num[1]);
        double result =p; //solve(s);
        //System.out.println("number:"+NUMBER);
        

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        

        bufferedWriter.close();

        scanner.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}