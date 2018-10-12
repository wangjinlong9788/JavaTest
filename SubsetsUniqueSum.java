import java.io.*;
import java.util.*;
//See the problem on https://www.hackerrank.com/contests/projecteuler/challenges/euler201/copy-from/87634602
public class Solution {

    public static void backtracking(int[] arr,List<List<Integer>> resList,List<Integer> list,int t,int start,int n, int k) {
        if(t>k){
            resList.add(new ArrayList<>(list));
        }else{
            for(int i=start;i<n;i++){
                list.add(arr[i]);
                backtracking(arr,resList, list, t+1,i+1, n, k);
                list.remove(list.size()-1);
            }
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String s = scanner.nextLine();
        String[] num=s.split(" ");
        int N=Integer.parseInt(num[0]);
        int m=Integer.parseInt(num[1]);
        
        String s1 = scanner.nextLine();
        String[] s1num=s1.split(" ");
        int[] nums=new int[s1num.length];
        for(int i=0;i<s1num.length;i++){
            nums[i]=Integer.parseInt(s1num[i]);
        }
        List<List<Integer>> resList=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        //HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap();
        int k=m;
        //int n=N;
        backtracking(nums,resList, list, 1, 0,N, k);
        System.out.println(resList);
        System.out.println(resList.size());
        int sizeList=resList.size();
        int sum0=0;
        int count=0;
        for(int i=0;i<resList.size();i++){
             
            for(Integer ints : resList.get(i)){
                sum0+=ints;    
            }
            if(!map.containsKey(sum0)){
                map.put(sum0, 1);
                //count++;
            }else{
                map.put(sum0, map.get(sum0)+1);
            }

            //map.put(sum0,map.getOrDefault(sum0,0)++);
            //if(!set.contains(sum0)){set.add(sum0);}
            sum0=0;
        }
        int result=0;
        for (Integer key : map.keySet()) {  
            System.out.println("Key = " + key);  
            Integer value = map.get(key);
            if(value<2)
            {result+=key;}
            
        } 
        
       // Iterator it = set.iterator();
        //while (it.hasNext()) {
          //  Object next = it.next();
            //Integer next = it.next();
            //System.out.println(next.toString());
            
            //result+=Integer.parseInt(next.toString());
        //}

         //System.out.println(resList.get(0));
        //int sum0=Math.sum(resList.get(0));
        //System.out.println(sum0);
        
        //System.out.println(nums[2]);
        //System.out.println(nums[3]);
        
        //double result =9.0; //solve(s);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        

        bufferedWriter.close();

        scanner.close();
    }
}

/*
import itertools
x = map(int,input().split())
n,m = x
y = set(map(int,input().split()))
z = []
z1 = set([])
combination_y = list(itertools.combinations(y,m))
if 1<=n<=100 and 1<=m<=n and len(y) == n:
    for i in combination_y:
        z.append(sum(i))
    for j in z:
        if z.count(j)>1:
            continue
        else:
            z1.add(j)
    print(sum(z1))
else:
    raise Exception(ValueError)
*/