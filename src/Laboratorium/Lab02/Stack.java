package Laboratorium.Lab02;

public class Stack {
	private int[] elements;
	private int topOfStack;

	public Stack(int size){
		elements = new int[size];
		topOfStack = -1;
	}

	public boolean isEmpty() {
		return topOfStack < 0;
	}

	public void push(int element){
		if (topOfStack == elements.length-1)
		{
			int[] newElements = new int[elements.length * 2];
			for (int i = 0; i < elements.length; i++)
				newElements[i] = elements[i];
			elements = newElements;
		}
		elements[++topOfStack] = element;
	}

	public int pop(){
		if (this.isEmpty())
			throw new IllegalArgumentException();
		return elements[topOfStack--];
	}

	public int peek()
	{
		if (this.isEmpty())
			throw new IllegalArgumentException();
		return elements[topOfStack];
	}
}
