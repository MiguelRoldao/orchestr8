package sound;

import java.util.ArrayList;
import java.util.HashMap;

public class Score {
	public Mixer mixer;
	public Instrument instrument;
	public ArrayList<Command> setup;
	public ArrayList<Command> end;
	public HashMap<Integer, HashMap<Double, ArrayList<Command>>> measures;
	
	double bpm = 120;
	int[] timeSignature = new int[] {4, 4};
	
	public Score() {
		super();
		setup = new ArrayList<Command>();
		end = new ArrayList<Command>();
		measures = new HashMap<Integer, HashMap<Double, ArrayList<Command>>>();
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public void playNote(String note, double length) {
		//System.out.println (note + ", " + length);
		if (instrument != null) {
			instrument.setNote(note);
		}
		if (mixer != null) {
			mixer.writeNote(instrument, length / getBPS());			
		}
	}
	
	public void setBPM(double bpm) {
		this.bpm = bpm;
		//System.out.println("bpm: " + bpm);
	}
	
	public double getBPM() {
		return bpm;
	}
	
	public double getBPS() {
		return bpm / 60.0;
	}
	
	public void setTimeSignature(String timeSignature) {
		String[] parts = timeSignature.split("/");
		try{
			this.timeSignature[0] = Integer.parseInt(parts[0]);
			this.timeSignature[1] = Integer.parseInt(parts[1]);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Invalid Time Signature: " + timeSignature);
        }
		//System.out.println("timeSignature: " + timeSignature);
	}
	
	public int getMeasures() {
		int n = measures.size();
		return n;
	}
	
	public static void main (String[] args) {
		Instrument myInst = new Instrument(new PulseWaveGenerator(0.5));
		myInst.setVolume(0.2);
		
		Score score = new Score();
		score.setup.add(new Command() {
			public void run() { score.setInstrument(myInst); }
		});
		
		ArrayList<Command> m1_1_commands = new ArrayList<Command> ();
		m1_1_commands.add(new Command() {
			public void run() { score.playNote("b3", 1); }
		});/*
		m1_1_commands.add(new Command() {
			public void run() { ((PulseWaveGenerator) score.instrument.generator).setPwm(0.5); }
		});*/
		
		ArrayList<Command> m1_2_commands = new ArrayList<Command> ();
		m1_2_commands.add(new Command() {
			public void run() { score.playNote("e3", 3); }
		});/*
		m1_2_commands.add(new Command() {
			public void run() { ((PulseWaveGenerator) score.instrument.generator).setPwm(0.1); }
		});*/
		
		/*ArrayList<Command> m1_end_commands = new ArrayList<Command> ();
		m1_end_commands.add(new Command() {
			public void run() { score.playNote("e3", 3); }
		});*/
		
		
		//score.measures.put(1, new HashMap<Integer, ArrayList<Command>> ())
	}
	
}
