
public class Test {

	public static void main(String[] args) {
		Deque<String> test = new Deque<String>();
		
/*		offerFirst adds element to the begging of the deque.
 * 		offerLast adds element to the end of the deque.
 * 		offer adds element to the end of the deque like offerLast.
 */
		
		test.offerFirst("Fist");
		test.offerFirst("Secound");
		test.offerFirst("Secound1312");
		test.offer("Third");
		test.offerLast("Bla");

/*		This function removes the last element and returns the value of the element.
 * 		There is also a function called removeLast that does the same operation.
 * 		removeFirst removes the first element from the deque and returns the value of the element.
 */
		test.remove();
		
//		It has to return true if there is a element "Bla".
		System.out.println(test.contains("Bla"));
		
//		It has to return false if there are elements in the deque and true if there aren't.
		System.out.println(test.isEmpty());
		
//		Returns number of elements in the deque.
		System.out.println(test.size());
		
/*		Returns the value of last element without removing it.
 * 		Also there is a function peekLast() that does the same.
 * 		peekFirst returns the value of the first element without removing it.
 */	
		System.out.println(test.peek());
		
//		Returns the value of first element without removing it.
		System.out.println(test.peekFirst());
		
		System.out.println();
/*		The loop prints the elements and removes them from the deque
 * 		The function pollFirst takes the value of the first element and
 * 		delete it from the deque
 */
		while(!test.isEmpty()){
			System.out.println(test.pollFirst());
		}
		
		System.out.println();
		
//		Here will return true isEmpty()
		System.out.println(test.isEmpty());
		
	}

}
