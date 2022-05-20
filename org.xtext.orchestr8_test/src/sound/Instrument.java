package sound;

import java.util.HashMap;


public class Instrument implements Generator {
	Generator generator;
	
	private HashMap<String, Double> temperament;
	
	private double volume = 0.1;
	private double frequency = 440.0;
	
	public Instrument(Generator generator) {
		this.generator = generator;
		temperament = defaultTemperament;
	}
	
	public Instrument(String type) {
		switch (type) {
		case "SQUARE_WAVE":
			generator = new PulseWaveGenerator();
			break;
		default:
			System.out.println("Wave type \"" + type + "\" not valid.");
			generator = new PulseWaveGenerator();
			break;
		}
		temperament = defaultTemperament;
	}

	@Override
	public double generate(double fpos) {
		return generator.generate(fpos) * volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	public void setNote(String note) {
		Double frequency = temperament.get(note);
		if (frequency != null) {
			this.frequency = frequency.doubleValue();
		}
	}
	
	public double getFrequency () {
		return frequency;
	}

	public void setParameter(String parameter, double val) {
		switch(parameter) {
		case "volume":
			setVolume(val);
			break;
		default:
			generator.setParameter(parameter, val);
		}
		
	}
	
	@SuppressWarnings("serial")
	private static HashMap<String, Double> defaultTemperament = new HashMap<String, Double>() {
		{
			put("C0", 16.351598);
			put("Db0", 17.323914);
			put("D0", 18.354048);
			put("Eb0", 19.445436);
			put("E0", 20.601722);
			put("F0", 21.826764);
			put("Gb0", 23.124651);
			put("G0", 24.499715);
			put("Ab0", 25.956544);
			put("A0", 27.500000);
			put("Bb0", 29.135235);
			put("B0", 30.867706);
			put("C1", 32.703196);
			put("Db1", 34.647829);
			put("D1", 36.708096);
			put("Eb1", 38.890873);
			put("E1", 41.203445);
			put("F1", 43.653529);
			put("Gb1", 46.249303);
			put("G1", 48.999429);
			put("Ab1", 51.913087);
			put("A1", 55.000000);
			put("Bb1", 58.270470);
			put("B1", 61.735413);
			put("C2", 65.406391);
			put("Db2", 69.295658);
			put("D2", 73.416192);
			put("Eb2", 77.781746);
			put("E2", 82.406889);
			put("F2", 87.307058);
			put("Gb2", 92.498606);
			put("G2", 97.998859);
			put("Ab2", 103.826174);
			put("A2", 110.000000);
			put("Bb2", 116.540940);
			put("B2", 123.470825);
			put("C3", 130.812783);
			put("Db3", 138.591315);
			put("D3", 146.832384);
			put("Eb3", 155.563492);
			put("E3", 164.813778);
			put("F3", 174.614116);
			put("Gb3", 184.997211);
			put("G3", 195.997718);
			put("Ab3", 207.652349);
			put("A3", 220.000000);
			put("Bb3", 233.081881);
			put("B3", 246.941651);
			put("C4", 261.625565);
			put("Db4", 277.182631);
			put("D4", 293.664768);
			put("Eb4", 311.126984);
			put("E4", 329.627557);
			put("F4", 349.228231);
			put("Gb4", 369.994423);
			put("G4", 391.995436);
			put("Ab4", 415.304698);
			put("A4", 440.000000);
			put("Bb4", 466.163762);
			put("B4", 493.883301);
			put("C5", 523.251131);
			put("Db5", 554.365262);
			put("D5", 587.329536);
			put("Eb5", 622.253967);
			put("E5", 659.255114);
			put("F5", 698.456463);
			put("Gb5", 739.988845);
			put("G5", 783.990872);
			put("Ab5", 830.609395);
			put("A5", 880.000000);
			put("Bb5", 932.327523);
			put("B5", 987.766603);
			put("C6", 1046.502261);
			put("Db6", 1108.730524);
			put("D6", 1174.659072);
			put("Eb6", 1244.507935);
			put("E6", 1318.510228);
			put("F6", 1396.912926);
			put("Gb6", 1479.977691);
			put("G6", 1567.981744);
			put("Ab6", 1661.218790);
			put("A6", 1760.000000);
			put("Bb6", 1864.655046);
			put("B6", 1975.533205);
			put("C7", 2093.004522);
			put("Db7", 2217.461048);
			put("D7", 2349.318143);
			put("Eb7", 2489.015870);
			put("E7", 2637.020455);
			put("F7", 2793.825851);
			put("Gb7", 2959.955382);
			put("G7", 3135.963488);
			put("Ab7", 3322.437581);
			put("A7", 3520.000000);
			put("Bb7", 3729.310092);
			put("B7", 3951.066410);
			put("C8", 4186.009045);
			put("Db8", 4434.922096);
			put("D8", 4698.636287);
			put("Eb8", 4978.031740);
			put("E8", 5274.040911);
			put("F8", 5587.651703);
			put("Gb8", 5919.910763);
			put("G8", 6271.926976);
			put("Ab8", 6644.875161);
			put("A8", 7040.000000);
			put("Bb8", 7458.620184);
			put("B8", 7902.132820);
		}
	};
	
}
