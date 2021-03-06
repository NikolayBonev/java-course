import java.util.*;

public class decNums {

	public static void main(String[] args) {
		Integer[] array = {5, 17, 13, 9, 5, 8, 11, 6, 3, 1, 5, 12};
		
		List<Integer> decreasingNums =new ArrayList<Integer>();
		
		int len = 0;
		for(Integer i = 0 ; i < array.length-2; i++){
			if(array[i] > array[i+1]){
				int count = 0;
				int index = i;
				
				count = findLen(array, i);
				
				if(count == len){
										
					addNumbersToList(decreasingNums, array, index, count);
					
				}else if(count > len){
					len = count;
					
					decreasingNums.clear();
					
					addNumbersToList(decreasingNums, array, index, count);
				}
			}
		}
		
		printFoundNumbers(decreasingNums, len);
		
//		System.out.println(decreasingNums);

	}
	
	public static void printFoundNumbers(List<Integer> decreasingNums, int len){
		
		int size = (decreasingNums.size()/len)*len;
		
		boolean flag = false;
		
		for(int i = 0 ; i < size ; i++){
			if(i%len == 0 && i != 0){
				System.out.println();
				flag = false;
			}else if(flag == true){
				System.out.print(", ");
			}
			
			System.out.print(decreasingNums.get(i));
			flag = true;
		}
	}
	
	public static void addNumbersToList(List<Integer> decreasingNums, Integer[] array, int index, int count){
		
		for(int i = index ; i < (index + count)  ; i++){
			decreasingNums.add(array[i]);
		}
	}
	
	public static int findLen(Integer[] array, Integer i){
		
		int count = 0;
		
		for(Integer j = i; j < array.length-1 ; j++){
			if(array[j] > array[j+1]){
				count++;
			}else if(array[j] < array[j+1] && count > 0){
				count++;
				i = j;
				break;
			}
		}
		
		return count;
	}

}
