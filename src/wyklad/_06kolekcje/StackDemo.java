package wyklad._06kolekcje;
import java.util.*;
import java.util.Stack;

public class StackDemo {
	static void showPush(Stack<Integer> st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showPop(Stack<Integer> st) {
		System.out.print("pop --> ");
		System.out.println(st.pop());
		System.out.println("stack: " + st);
	}

	public static void main(String args[]) {
		Stack<Integer> st = new Stack<Integer>();

		System.out.println("stack: " + st);
		showPush(st, 42);
		showPush(st, 55);
		showPush(st, 99);
		showPop(st);
		showPop(st);
		showPop(st);
		try {
			showPop(st);
		} catch (EmptyStackException e) {
			System.out.println("stos pusty");
		}
		showPop(st);
	}
}
