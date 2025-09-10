package stack;
import java.util.Scanner;

 class Stack {
	 private int arr[];
	 private int top;
	 private int capacity;
	 Stack(int size){
capacity=size;
top=-1;
arr=new int[capacity];
}
Stack(int[]inputArr) {
	capacity=inputArr.length;
	arr=new int[capacity];
	top=-1;
	for(int val:inputArr) {
		arr[++top]=val;
	}
	}
void push(int x) {
	if(top==capacity-1) {
		System.out.println("Stack overflow!!"+x);
	}
	else {
	
		arr[++top]=x;
		System.out.println("+pushed");
	}
	}
void push(int x,int y) {
	push(x);
	push(y);
}
int pop() {
	if(top==-1) {
		System.out.println("Stack underflow!!");
		return -1;
	}else {
		return arr[top--];
	}
}
void pop(int n) {
	for(int i=0;i<n;i++) {
		int popped=pop();
		if(popped==-1)
			break;
		System.out.println("popped:"+popped);
		}
}
void display() {
	if(top==-1) {
		System.out.println("Stack is empty");
		return;
		}
	System.out.println("Stack(top->bottom)");
	for(int i=top;i>=0;i--) {
		System.out.println(arr[i]+"");
	}
	System.out.println();
}
void display(int n) {
	if(top==-1) {
		System.out.println("Stack is empty");
		return;
	}
	if(n>top+1) {
		n=top+1;
	}
	System.out.print("top"+n+"elements");
	for(int i=top;i>top-n;i--) {
		System.out.println(arr[i]+"");
	}
	System.out.println();
}
	}
