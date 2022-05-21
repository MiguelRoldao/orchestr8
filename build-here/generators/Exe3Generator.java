package generators;
import orchestr8.sound.Generator;

public class Exe3Generator implements Generator {

	@Override
	public double generate(double fpos) {
		return Math.sin(2*Math.PI*fpos);
	}

	@Override
	public void setParameter(String parameter, double val) {
		System.out.println("Generator doesn't have parameter: " + parameter);
	}

}
