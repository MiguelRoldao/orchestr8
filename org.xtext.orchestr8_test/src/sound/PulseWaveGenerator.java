package sound;


public class PulseWaveGenerator implements Generator {
	
	private double pwm;
	
	@Override
	public double generate(double fpos) {
		double sample = 0.0;
		sample = fpos < pwm ? 1.0 : -1.0;
		return sample;
	}
	
	public PulseWaveGenerator(double pwm) {
		super();
		this.pwm = pwm;
	}
	
	PulseWaveGenerator() {
		this(0.5);
	}
	
	public double getPwm() {
		return pwm;
	}
	
	public void setPwm(double pwm) {
		this.pwm = pwm;
		System.out.println("Setting pwm to: " + pwm);
	}
	/*
	public double getParameter(String parameter) throws NoSuchFieldException, SecurityException {
		Field f = getClass().getField(parameter);
		double val = 0.0;
		try {
			val = f.getDouble(f);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
	}
	
	public void setParameter(String parameter, float value) throws NoSuchFieldException, SecurityException {
		Field f = getClass().getField(parameter);
		value.getClass();
		
	}*/

	@Override
	public void setParameter(String parameter, double val) {
		switch (parameter) {
		case "pwm":
			setPwm(val);
			break;
		default:
			System.out.println("Generator doesn't have parameter: " + parameter);
		}
	}
	
	

}
