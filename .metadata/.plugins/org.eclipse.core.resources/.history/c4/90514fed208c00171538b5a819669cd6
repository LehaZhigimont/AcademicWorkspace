package maniacSqrt;


public class ExeManiacSqrt {

	public static void main(String[] args) {
		int number = 20990;
		/*
		 * float mySqrt=0; float i=0.1f; while(true) { float k=i;
		 * System.out.println("i="+i+"    k="+k); mySqrt=(1/2f)*(k+(number/k));
		 * System.out.println("mySqrt="+mySqrt+"    i="+i+"    k="+k);
		 * if(number==((int)mySqrt)*((int)mySqrt))break; else i=i+0.00001f;
		 * System.out.println("mySqrt="+mySqrt+"    i="+i+"    k="+k);
		 * System.out.println("    "); if((mySqrt*mySqrt)>number) {
		 * System.out.println("erorr"); break; }
		 * 
		 * } System.out.println("Sqrt "+number+" = "+(int)mySqrt);
		 */
		/*
		 * for(float i=0.01f;i*i!=number;i=i+0.01f) { float mySqrt=0;
		 * mySqrt=i*i; System.out.println(i+"-----"+mySqrt);
		 * System.out.println((int)i);
		 * 
		 * }
		 */
		float mySqrt = 0;
		float i = 0.01f;
		int answer = 0;
		long startTime = System.currentTimeMillis();
		do {
			mySqrt = i * i;
			i = i + 0.01f;
			answer = (int) i;
			System.out.println(mySqrt);
		} while ((int) mySqrt != number);
		System.out.println(answer);
		System.out.println("Run time = " + (System.currentTimeMillis() - startTime) / 1000f + " seconds");

	}
}