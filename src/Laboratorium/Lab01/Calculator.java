package Laboratorium.Lab01;

public class Calculator {
	private int state = 0;
	private boolean errorState = false;

	public int getState() {
		return state;
	}

	public boolean isErrorState() {
		return errorState;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setErrorState(boolean errorState) {
		this.errorState = errorState;
	}

	public void add(int value){
		if (Integer.MAX_VALUE - value < state){
			errorState = true;
			return;
		}
		if (!errorState){
			state += value;
		}
	}

	public void mult(int value){
		state *= value;
	}

}
