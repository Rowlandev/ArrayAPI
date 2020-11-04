package edu.indwes.cis330.arrays;

public class ArrayAPI implements INumArrayUtils {

	@Override
	public void addItem(int number, int[] array, int position) {
		int temp1=-1;
		int temp2=-1;
		
		for (int i=0;i<array.length;i++) {
			
			if(i==position) {
				temp1 =array[i];
				array[i] = number;
			}
			
			else if(i>position){
				temp2 = array[i];
				array[i]=temp1;
				temp1=temp2;
			}
			
		}
		
	}

	@Override
	public void removeItem(int number, int[] array) {
		int offset =0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==number) {
				offset++;
			}
			
			if(i+offset<array.length) {
				array[i]=array[i+offset];

			}
			else {
				array[i]=0;
			}
		}
	}
	
}
