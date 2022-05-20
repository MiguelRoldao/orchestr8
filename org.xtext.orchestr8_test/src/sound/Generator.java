package sound;

public interface Generator {
	public double generate(double fpos);

	public void setParameter(String parameter, double val);
}
