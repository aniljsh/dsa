package com.bsa;
/**
 * We are dividing the array until we get the correct value
 */

public class BinarySearchInfinateArray {
	
	
	public static void main(String[] args) {
		
		int target = 600;
		
		
		System.out.println(" Helllo World");
		
		long start = System.currentTimeMillis();
		
		//find element
		int index = findElement(target);
		long end = System.currentTimeMillis();
		
		long time = (end - start)/1000;
		
		System.out.println(" execution time " + time);
		if(index>-1) {
			System.out.println(" Element was found  " + index);
			
		}else {
			System.out.println(" NO Element was found  ");
			
		}
		
		
	}
	
	
	private static int findElement(int target) {
		
		int leftIndex = 0;
		//int rightIndex = Integer.MAX_VALUE;
		int rightIndex = 11;
		
		
		
		//generate Arrays
		int numbers[] = generateArray(rightIndex);
		System.out.println(" Element numbers  " + numbers);
		
		
		while(leftIndex<=rightIndex) {
			int midIndex = leftIndex + (rightIndex-leftIndex)/2;
			System.out.println(" leftIndex:" + leftIndex +" rightIndex:"+rightIndex + " midIndex:"+midIndex);
			int element = getElement(midIndex, numbers);
			
			if(target == element ) {
				
				return midIndex;
				
			}else if(element<target){
				leftIndex = midIndex +1; //search right only
				
			}else if (element>target) {
				
				rightIndex = midIndex - 1; //search left only
				
			}
			
		}
		
		
		
		
		return -1;
	}
	
	private static int getElement(int index, int[] nums) {
		
		return nums[index];
	}
	
	
	private static int[] generateArray(int size) {
		
		int numbers[] = new int[size];
		for(int i = 0; i< size ; i++) {
			
			numbers[i] = i*100;
			
		}
		
		return numbers;
		
	}

}
