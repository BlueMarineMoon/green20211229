package test1;


public class Km2Mile extends Converter {
	private double ratio;
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
	
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마을은 1.6Km
		toMile.run();
	}

}
