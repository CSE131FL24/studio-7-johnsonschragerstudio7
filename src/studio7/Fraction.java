package studio7;

public class Fraction {

	private double x;
	private double y;
		
	public Fraction(double x, double y) {
		
		this.x = x;
		this.y = y;
			
	}
	
	
	public double getFrac() {
		
		return x/y;

	}
	
	public double getSum(Fraction f1) {
		
		return f1.getFrac()+this.getFrac();
	}

	public double getProduct(Fraction f1) {
		
		return f1.getFrac()*this.getFrac();
	}
    
	public double getRecipricoal() {
		
		return y/x;
	}
	public Fraction getSimplified() {
		
	}
	
}

