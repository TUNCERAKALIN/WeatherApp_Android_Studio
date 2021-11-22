package deneme;
import java.util.Arrays;

public class sum {
	
	public static void main(String[] args) {
		
//		bu kodlari baska method icinde yazip cagir
//		int[] A = {1,2,3};
//		int[] b = new int[A.length];
//		for(int a =0 ; a<A.length;++a) {
//			b[A.length-a-1] = A[a];
//		}
//		for(int a: b) {
//			System.out.print(a);
//		 }
//========================================
//		int[] A = {1,2,3};
//		
//		InsertionSort yapmayi unutma;
		//UML onemli
		int[] apple = {1,2,3,3,4,6,7,7,9};
		removeDuplicates(apple);
		for(int a: apple) {
			System.out.print(a+ " ");
		}
//		
		
		}
   public static void removeDuplicates(int[] array) {
		
		for(int i = 0; i<array.length-1;++i) {
			boolean match = false;
			for(int k=i+1; k<array.length;++k) {
				
				if(array[i] == array[k]) {
					array[k] = 0;
					match = true;
				}
				
			}
			if(match == true) {
				array[i] = 0;
				match = false;
			}
		}
		
	}
		
	}

