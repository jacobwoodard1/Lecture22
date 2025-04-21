package com.test.app;

/**
 * Hello world!
 *
 */
public class App 
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
		public static void main(String[] args) {
			App t = new App();
			int result1 = t.o()/t.n();
			if(result1 == 0){
				throw new RuntimeException();
			}
			int result2 = t.n() * 2;
			System.out.println("Hello world" + result1 + " " + result2);

		}
		

}
