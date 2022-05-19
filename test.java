package tutorial;


import java.util.Scanner;
public class Example1{
	public static void main(String[]arga) {
		Scanner input=new Scanner(System.in);
		
		/*
		  System.out.println("Enter the intial state");
		 
		int input1 [][]=new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				input1[i][j]=input.nextInt();
			}
		}
		Node intial=new Node(input1);
		System.out.println("Enter which search method you want to use "
				+ "1)BFS   2)DFS");
		int method=input.nextInt();
		if(method==1) 
			BFS_code.BFS(intial);
	//	else if(method==2)
		//	DFScode.DFS(intial);
		 * */
		 
		int i,j;
	int input1 [][]=new int [3][3];
	for( i=0;i<3;i++) {
		for( j=0;j<3;j++) {
			input1[i][j]=input.nextInt();
		}
	}
	input1[i][j]=input1[i+1][j];
	input1[i+1][j]=0;	
	}
}