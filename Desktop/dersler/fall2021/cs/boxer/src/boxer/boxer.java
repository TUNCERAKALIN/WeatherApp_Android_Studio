package boxer;

import java.util.Arrays;
import java.util.Collections;

public class boxer {
	private int[] a;
	public boolean isLeft =true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10, 20, 30, 40, 50}; 
		boxer m = new boxer(a);

		try {

			for(int i :m.shift(-1) ) {
				System.out.println(i);
			}
			for(int i :m.shift(16) ) {
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


	}
	public boxer(int[] array) {
		a =Arrays.copyOf(array, array.length);

	}
	public int[] shift(int m) throws Exception {
		int[] newArray = new int[a.length];
		if(m<=0) {
			throw new Exception();
		}
		int size = m%a.length;

		if(isLeft) {
			System.out.println("Now left");
			isLeft = false;

			for (int i = 0; i < a.length; i++) {
				newArray[(i+(newArray.length-size)) % newArray.length] = a[i];
			}   





		}else {
			System.out.println("Now Right");
			isLeft =true;
			for (int i = 0; i < a.length; i++) {
				newArray[(i+size) % newArray.length] = a[i];
			}

		}
		return newArray;

	}


}
