package praktika5;
public class Zadanie1 {
	 static double calculateFactorial(double n){
			double result = 1;
			for (int i = 1; i <=n; i ++){
				result = result*i;
			}
			return result;
		}	
	 public static double exponent() {
		 double b = 1;
			for( double i=1;i<1000;i++) {
				b+=1./calculateFactorial(i);
			}  
		 return b;
		 }
	 static double otvet;
	public static void main(String[] args) {
		otvet = exponent();
		System.out.println(otvet);

	}

}
