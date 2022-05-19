package tutorial;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
public class BFS_code {
public  static void BFS(Node intial){
	
	
	 
  Queue<Node>frontier=new LinkedList<>();
  ArrayList <Node> explored=new  ArrayList <Node>();
  
  boolean solved=false;
    long startTime,endTime,duration;
	
	startTime=System.currentTimeMillis();
		
  frontier.add(intial);
  
  while(!frontier.isEmpty()) {
	  Node state=new Node(frontier.poll().data);
	  explored.add(state);
	  
	  if(game_methods.goaltest(state)) {
		  System.out.println("success");
		  System.out.println(Arrays.deepToString(state.data));
		  solved=true;
			 break;
	  }
	 else{
		 boolean exist=false;
		game_methods.swaping(state);
		if(state.next1!=null) {
			//System.out.println(Arrays.deepToString(state.next1.data));
			for(int i=0;i<explored.size();i++) {
				if(state.next1==explored.get(i))
					exist=true;
			}
			if(exist==false) {
				if(frontier.contains(state.next1)!=true)
				frontier.add(state.next1);
			}
			
		}
		exist=false;
		if(state.next2!=null) {
			//System.out.println(Arrays.deepToString(state.next2.data));
			for(int i=0;i<explored.size();i++) {
				if(state.next2==explored.get(i))
					exist=true;
			}
			if(exist==false) {
				if(frontier.contains(state.next2)!=true)
					frontier.add(state.next2);
			}
			
		}
		exist=false;
		if(state.next3!=null) {
			//System.out.println(Arrays.deepToString(state.next3.data));
			for(int i=0;i<explored.size();i++) {
				if(state.next3==explored.get(i))
					exist=true;
			}
			if(exist==false) {
				if(frontier.contains(state.next3)!=true)
					frontier.add(state.next3);
			}
			
		}
		exist=false;
		if(state.next4!=null) {
			//System.out.println(Arrays.deepToString(state.next4.data));
			for(int i=0;i<explored.size();i++) {
				if(state.next4==explored.get(i))
					exist=true;
			}
			if(exist==false) {
				if(frontier.contains(state.next4)!=true)
					frontier.add(state.next4);
			}
			
		}
			
	
		    
	 }
	  
  }
  endTime=System.currentTimeMillis();
   duration=endTime-startTime; 
  // System.out.println(duration+" milliseconds");
   if (solved==false) {
	   System.out.println("Failure");
   }
}
	
}
