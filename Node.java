public class Node{
	public int data;
	public Node head;
	public Node next;
	public Node(int data) {
		this.data=data;
	}
public  void addNode(Node node){
        
        Node temp =head;    
        while(temp.next != null){     
            temp = temp.next;         
        }
        temp.next = node;     
    }
public void printnode(){
        Node temp = head.next;
        while(temp != null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
    }
public static void main(String []args) {
	        int nums[]= {1,2,3,4,5,6,7,8};
	    	//int[] result=twoSums(nums,13);
	        System.out.println("Hello World test Node"); 
	        Node first=new Node(1);
	        Node second=new Node(2);
	        System.out.print(first.data);
	        System.out.print(first.head);
	        System.out.print(first.next);
	        //addNode(first);
	        //first.addNode(second.head);
	        //System.out.println(Arrays.asList(result));
	        //System.out.println(result.toString());
	        //System.out.println(Arrays.toString(result));
	        //for(int a:result)  
	       //     System.out.println(a+"\n");
	    }
}