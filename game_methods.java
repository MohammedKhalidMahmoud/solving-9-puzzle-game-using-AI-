package tutorial;
import java.util.Arrays;
import java.util.Queue;

public class game_methods{
	
	public static void swaping(Node x) {
		int zero[]=new int [2];
		whereisthezero(x,zero);
		int i=zero[0];
		int j=zero[1];
		
		if(i==1&&j==1) {   // create 4 new nodes (next1,next2,next3,next4)
		   x.next1=swapup(i,j,x);
		   x.next2=swapdown(i,j,x);
		   x.next3=swapright(i,j,x);
		   x.next4=swapleft(i,j,x);   
	      }
		
		else if(i==0&&j==1) {  // create 3 new nodes (next2,next3,next4)
		  
		   x.next2=swapdown(i,j,x);
		   x.next3=swapright(i,j,x);
		   x.next4=swapleft(i,j,x); 
		    }
		
	    else if(i==1&&j==0) {  // create 3 new nodes (next1,next2,next3)
	       x.next1=swapup(i,j,x);
	       x.next2=swapdown(i,j,x);
	       x.next3=swapright(i,j,x);
	    }
		
	   else if (i==1&&j==2) {  // create 3 new nodes (next1,next2,next4)
		   x.next1=swapup(i,j,x);
		   x.next2=swapdown(i,j,x);
		   x.next4=swapleft(i,j,x);  
	   }
		
	   else if (i==2&&j==1) {  // create 3 new nodes (next1,next3,next4)
		   x.next1=swapup(i,j,x); 
		   x.next3=swapright(i,j,x);
		   x.next4=swapleft(i,j,x);
	    }
		
	   else if (i==0&&j==2) {  // create 2 new nodes (next2,next4)
		 
		   x.next2=swapdown(i,j,x);
		   x.next4=swapleft(i,j,x);
	    
	   }
	  else if (i==0&&j==0) {   // create 2 new nodes (next2,next3)
		
		  x.next2= swapdown(i,j,x);
		  x.next3=swapright(i,j,x); 
	   }
		
	  else if (i==2&&j==0) {   // create 2 new nodes (next1,next3)
		  x.next1=swapup(i,j,x);
		  x.next3=swapright(i,j,x);
	   }
		 
	  else if (i==2&&j==2) {   // create 2 new nodes (next1,next4)
		  x.next1=swapup(i,j,x);
		  x.next4=swapleft(i,j,x);  
	   }
		
	}
	
	
	public static Node swapup(int i,int j,Node x){
		System.out.println(Arrays.deepToString(x.data));
		Node new_node=new Node(x.data);
		new_node.data[i][j]=new_node.data[i-1][j];
		new_node.data[i-1][j]=0;
		 return new_node;
		
	}
	
	public static Node swapdown(int i,int j,Node x){
		System.out.println(Arrays.deepToString(x.data));
		Node new_node=new Node(x.data);
		new_node.data[i][j]=new_node.data[i+1][j];
		new_node.data[i+1][j]=0;	
		 return new_node;
		 
		 
	}
	
	public static Node swapright(int i,int j,Node x){
		System.out.println(Arrays.deepToString(x.data));
		Node new_node=new Node(x.data);
		new_node.data[i][j]=new_node.data[i][j+1];
		new_node.data[i][j+1]=0;
		   return new_node;
		
	}
	
	public static Node swapleft(int i,int j,Node x){
		System.out.println(Arrays.deepToString(x.data));
		Node new_node=new Node(x.data);
		new_node.data[i][j]=new_node.data[i][j-1];
		new_node.data[i][j-1]=0;	
	        return new_node;
		 
	}
	
	 public static boolean goaltest(Node x) {
		  int counter=0; 
		  int w=0;
		Lbl: for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 if(x.data[i][j]==i+j+w) 
					 counter++; 
				 else 
					 break Lbl;
			 }
			 w+=2;
		 }
		 if(counter==9)
			  return true;
		  else
			  return false;
	  }
	  
	  public static void whereisthezero(Node x,int zero []) {
		 
	 Lbl:  for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(x.data[i][j]==0) {
					zero[0]=i;
				    zero[1]=j;
				 break Lbl;
				}
			}
		}
		 
}

}