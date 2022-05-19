package new1;
	import java.util.Arrays;
	import java.util.LinkedList;
	import java.util.Stack;
	import java.util.ArrayList;
	import java.util.Arrays;
	public class DFScode {
	public  static void DFS(Node intial){
		
		 Stack<Node> frontier = new Stack<>();
	  ArrayList <Node> explored=new  ArrayList <Node>();
	  
	  boolean solved=false;
	    long startTime;
	    long endTime;
		long duration;
		
			startTime=System.currentTimeMillis();
	  
	  frontier.push(intial);
	   
	  
	  while(!frontier.isEmpty()) {
		  Node state=frontier.pop();
		  explored.add(state);
		  
		  if(game_methods.goaltest(state)==true) {
			  System.out.println(Arrays.deepToString(state.data));
			   solved=true;
				 break;
		  }
		 else{
			 boolean exist=false;
			game_methods.swaping(state);
			if(state.next1!=null) {
				for(int i=0;i<explored.size();i++) {
					if(state.next1==explored.get(i))
						exist=true;
				}
				if(exist==false) {
					if(frontier.contains(state.next2)!=true)
						frontier.push(state.next1);	
				}
				
			}
			exist=false;
			if(state.next2!=null) {
				for(int i=0;i<explored.size();i++) {
					if(state.next2==explored.get(i))
						exist=true;
				}
				if(exist==false) {
					if(frontier.contains(state.next2)!=true)
						frontier.push(state.next2);
				}
				
			}
			exist=false;
			if(state.next3!=null) {
				for(int i=0;i<explored.size();i++) {
					if(state.next3==explored.get(i))
						exist=true;
				}
				if(exist==false) {
					if(frontier.contains(state.next3)!=true)
						frontier.push(state.next3);
				}
			
			}
			exist=false;
			if(state.next4!=null) {
				for(int i=0;i<explored.size();i++) {
					if(state.next4==explored.get(i))
						exist=true;
				}
				if(exist==false) {
					if(frontier.contains(state.next4)!=true)
				frontier.push(state.next4);
			}
				
			
			    
		 }
		  
	  }
	  
	}
	  endTime=System.currentTimeMillis();
	   duration=endTime-startTime; 
	   System.out.println(duration+" milliseconds");	
	   if (solved==false) {
		   System.out.println("Failure");
	   }
	}
	}

