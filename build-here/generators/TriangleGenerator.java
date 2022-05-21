package generators;
import orchestr8.sound.Generator;

public class TriangleGenerator implements Generator {

	@Override
	public double generate(double fpos) {
		if (fpos < 0.5) {
			return (fpos * 4.0) - 1.0;
		} else {
			return (((fpos - 0.5) * 4.0) - 1.0) * -1.0;
		}
	}

	@Override
	public void setParameter(String parameter, double val) {
		System.out.println("Generator doesn't have parameter: " + parameter);
	}

}