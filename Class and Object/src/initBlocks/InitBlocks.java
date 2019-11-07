package initBlocks;

public class InitBlocks {

	public InitBlocks() {
		System.out.println("Default Constructor");
	}

	{
		System.out.println("Init Block");
	}

	static {
		System.out.println("Static Init Block");
	}

}
