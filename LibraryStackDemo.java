package stack;
import java.util.Scanner;

public class LibraryStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack st=null;
		System.out.println("choose the way to initialize");
		System.out.println("1.empty stack with size");
		System.out.println("2.stack initialized with array");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter size of stack");
			int size=sc.nextInt();
			st=new Stack(size);
		}
		else if(choice==2) {
			System.out.println("enter the number of elements");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("enter elements");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			st=new Stack(arr);
			}
		int option;
		do {
			System.out.println("\n---stack menu---");
			System.out.println("1.push one elements");
			System.out.println("2.push two elements");
			System.out.println("3.pop one elements");
			System.out.println("4.pop multiple elements");
			System.out.println("5.display full stack");
			System.out.println("6.display top n elements");
			System.out.println("7.exit");
			System.out.println("enter your choice");
			option=sc.nextInt();
			switch(option) {		
			case 1:
				System.out.println("enter elements");
				int val=sc.nextInt();
				st.push(val);
				break;
			case 2:
				System.out.println("enter two elements");
				int v1=sc.nextInt();
				int v2=sc.nextInt();
				st.push(v1,v2);
				break;
			case 3:
				int popped=st.pop();
				System.out.println("popped:"+popped);
				break;
			case 4:
				System.out.println("enter number of elements to top");
				int n=sc.nextInt();
				st.pop(n);
				break;
			case 5:
				st.display();
				break;
			case 6:
				System.out.println("enter number of top elements");
				int topN=sc.nextInt();
				st.display(topN);
				break;
			case 7:
				System.out.println("exiting");
				default:
					System.out.println("invalid choice");
			}
		}
		while(option!=7);
		sc.close();
		

	}

}
