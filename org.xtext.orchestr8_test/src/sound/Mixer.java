package sound;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Mixer {
	
	final int SAMPLING_RATE = 48000;
	
	//Score score;
	ArrayList<Score> scores;
	private double[] buffer = new double[1];
	private int bufferPointer;
	
	public Mixer () {
		bufferPointer = 0;
	}
	
	public Mixer (Score score) {
		bufferPointer = 0;
		scores = new ArrayList<>();
		scores.add(score);
	}
	
	public void writeNote (Instrument inst, double duration) {
		//System.out.println("writeNote " + duration);
		int nSamples = (int) (duration * SAMPLING_RATE);
		if (buffer.length < bufferPointer + nSamples) {
			increaseBuffer(bufferPointer + nSamples);
		}
		
		double fCycleInc = inst.getFrequency() / SAMPLING_RATE;
		double fCyclePosition = 0;
		for (int i = 0; i < nSamples; i++) {
			buffer[i + bufferPointer] = inst.generate(fCyclePosition);
			
			fCyclePosition += fCycleInc;
			if (fCyclePosition > 1)
				fCyclePosition -= 1;
		}
		System.out.println("writeNote: " + nSamples + " " + buffer.length + " " + duration);
	}
	
	void increaseBuffer (int newSize) {
		double[] newBuffer = new double[newSize];
		System.arraycopy(buffer, 0, newBuffer, 0, buffer.length);
		buffer = newBuffer;
	}
	
	public void positionPointer(int score_id, int measure, double beat) {
		Score score = scores.get(score_id);
		double timeStamp = (double)(measure - 1) * (4.0 * score.timeSignature[0] / score.timeSignature[1]) / score.getBPS(); // * ((double)score.timeSignature[0] / (double)score.timeSignature[1]);
		double other_half = (double)(beat - 1) / score.getBPS(); //  * (1.0 / (double)score.timeSignature[1]);
		timeStamp += other_half;
		bufferPointer = (int)(timeStamp * SAMPLING_RATE);
		System.out.println("positionPointer: " + score.getBPS() + " " + score.getBPM() + " " + timeStamp + " " + other_half + " " + bufferPointer);
	}
	
	public void positionPointer(int measure, double beat) {
		positionPointer(0, measure, beat);
	}
	
	public void mix(int score_id) {
		for (Command c : scores.get(score_id).setup) {
			c.run();
		}
		for (Integer i : scores.get(score_id).measures.keySet()) {
			HashMap<Double, ArrayList<Command>> measure = scores.get(score_id).measures.get(i);
			for (Double j : measure.keySet()) {
				ArrayList<Command> timestamp = measure.get(j);
				for (Command c : timestamp) {
					positionPointer(i, j);
					c.run();
				}
			}
		}
	}
	
	public void mix() {
		mix(0);
	}
	
	public void play() {
		final int SAMPLE_SIZE = 2;						// Audio sample size in bytes

		SourceDataLine line;
		double fFreq = 440;								 // Frequency of sine wave in hz

		//Position through the sine wave as a percentage (i.e. 0 to 1 is 0 to 2*PI)
		double fCyclePosition = 0;		  

		//Open up audio output, using 44100hz sampling rate, 16 bit samples, mono, and big 
		// endian byte ordering
		AudioFormat format = new AudioFormat(SAMPLING_RATE, 16, 1, true, true);
		DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

		if (!AudioSystem.isLineSupported(info)){
			System.out.println("Line matching " + info + " is not supported.");
			return;
		}

		try {
			line = (SourceDataLine)AudioSystem.getLine(info);
			line.open(format);
			line.start();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		

		// Make our buffer size match audio system's buffer
		ByteBuffer cBuf = ByteBuffer.allocate(line.getBufferSize());	

		//int ctSamplesTotal = SAMPLING_RATE*1;			// Output for roughly 5 seconds
		int ctSamplesTotal = buffer.length;			// Output for roughly 5 seconds
		
		int sampleid = 0;


		//On each pass main loop fills the available free space in the audio buffer
		//Main loop creates audio samples for sine wave, runs until we tell the thread to exit
		//Each sample is spaced 1/SAMPLING_RATE apart in time
		while (ctSamplesTotal>0) {
			double fCycleInc = fFreq/SAMPLING_RATE;  // Fraction of cycle between samples

			cBuf.clear();									 // Discard samples from previous pass

			  // Figure out how many samples we can add
			int ctSamplesThisPass = line.available()/SAMPLE_SIZE;	
			for (int i=0; i < ctSamplesThisPass; i++) {
				//cBuf.putShort((short)(Short.MAX_VALUE * Math.sin(2*Math.PI * fCyclePosition)));
				//cBuf.putShort((short)(Short.MAX_VALUE * pulseWaveGenerator(0.02, 0.0625, fCyclePosition)));
				//cBuf.putShort((short)(Short.MAX_VALUE * myInst.generate(fCyclePosition)));
				if (sampleid >= buffer.length) break;
				cBuf.putShort((short)(Short.MAX_VALUE * buffer[sampleid]));
				sampleid++;
				
				fCyclePosition += fCycleInc;
				if (fCyclePosition > 1)
					fCyclePosition -= 1;
			}

			//Write sine samples to the line buffer.  If the audio buffer is full, this will 
			// block until there is room (we never write more samples than buffer will hold)
			line.write(cBuf.array(), 0, cBuf.position());				
			ctSamplesTotal -= ctSamplesThisPass;	  // Update total number of samples written 

			//Wait until the buffer is at least half empty  before we add more
			while (line.getBufferSize()/2 < line.available())
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}															
		}


		//Done playing the whole waveform, now wait until the queued samples finish 
		//playing, then clean up and exit
		line.drain();													  
		line.close();
	}
	
	
}
