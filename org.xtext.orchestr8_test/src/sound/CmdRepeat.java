package sound;

public class CmdRepeat implements Command {
	
	private Command cmd;
	private int iterations;
	private int currentIteration;
	
	public CmdRepeat (Command cmd, int iterations) {
		this.iterations = iterations;
		currentIteration = iterations;
		this.cmd = cmd;
	}

	@Override
	public void run() {
		currentIteration--;
		if (currentIteration >= 0) {
			currentIteration = iterations;
			cmd.run();
		}
		
	}
	

}
