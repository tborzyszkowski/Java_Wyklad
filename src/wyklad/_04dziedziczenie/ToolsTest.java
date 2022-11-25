package wyklad._04dziedziczenie;

import java.util.Random;

abstract class Tool{
	String myCapabilities(){
		return  "Can cut  : " + canCut() + "\n"+
				"Can drill: " + canDrill() + "\n"+
				"Can sweep: " + canSweep();
	}
	abstract boolean canCut();
	abstract boolean canDrill();
	abstract boolean canSweep();
}

class Knife extends Tool{
	boolean canCut()   { return true;}
	boolean canDrill() { return false;}
	boolean canSweep() { return false;}	
}

class Driller extends Tool{
	boolean canCut()   { return false;}
	boolean canDrill() { return true;}
	boolean canSweep() { return false;}	
}

class Broom extends Tool{
	boolean canCut()   { return false;}
	boolean canDrill() { return false;}
	boolean canSweep() { return true;}
}

public class ToolsTest {
	public static void main(String[] args) {
		Tool tool;
		tool = new Knife();
		System.out.println("Knife:\n" + tool.myCapabilities() + "\n");

		tool = new Driller();
		System.out.println("Driller:\n" + tool.myCapabilities() + "\n");

		tool = new Broom();
		System.out.println("Broom:\n" + tool.myCapabilities() + "\n");

		Random rnd = new Random();
		boolean isBroom = rnd.nextBoolean();
		if(isBroom){
			tool = new Broom();
		}
		else{
			tool = new Driller();
		}
		System.out.println("Tool:\n" + tool.myCapabilities() + "\n" + tool.getClass());
	}
}
