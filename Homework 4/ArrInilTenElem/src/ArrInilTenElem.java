
public class ArrInilTenElem {

	public static void main(String[] args) {
		int[] arrElemInic =new int[10];
		
		for(int i=0;i<10;i++){
			arrElemInic[i]=i*10;
		}
		
		for(int nums: arrElemInic){
			System.out.print(nums + " ");
		}
		
	}

}
