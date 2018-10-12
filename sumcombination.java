import java.util.ArrayList;
import java.util.List;

public class sumcombination {
    public static List<List<Integer>> combination(int n, int k) {
        List<List<Integer>> resList=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] arr=new int[]{6,7,8,9,10};
                  
        backtracking(arr,resList, list, 1, 0,n, k);
        return resList;
    }
     
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
    public static void main(String[] args) {
    	
    	List<List<Integer>> nlist=new ArrayList<>();
    	nlist=combination(5, 2);
    	System.out.println(nlist);
    	
    }
    
}
