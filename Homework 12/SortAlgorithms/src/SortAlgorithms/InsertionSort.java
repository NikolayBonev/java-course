package SortAlgorithms;
public class InsertionSort {
	public void sort(int[] inputArr){
        
        for (int i = 1; i < inputArr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(inputArr[j] < inputArr[j-1]){
                    swap(inputArr, j, j-1);
                }
            }
        }
    }
	
	private void swap(int inputArr[], int i, int j){
    	
        int temp = inputArr[i];
        inputArr[i] = inputArr[j];
        inputArr[j] = temp; 
    }    
	
}
