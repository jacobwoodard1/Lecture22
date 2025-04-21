package students;

/**
 * Hello world!
 *
 */
public class Test 
{

		public int m(int y){
			int z = 0; 
			while (y > 0){
				z = z + 1;
				y = y - 1;
			}
			return z;
		}
		
		public int n(){
			int y = 2;
			return m(y);
		}
		
		public int o(){
			int y = 0;
			return m(y);
		}
		
		public int k(int x){
			if(x > 0){
				x = 2*x;
			} else {
				x = 2*x - 1;
			}
			return x;
		}
		public static void main(String[] args) {
			Test t = new Test();
			int x = Integer.parseInt(args[0]);
			int result1 = t.o()/t.n();
			int result2 = t.n()/t.k(x);
			System.out.println("Hello world" + result1 + " " + result2);

		}
		

}
