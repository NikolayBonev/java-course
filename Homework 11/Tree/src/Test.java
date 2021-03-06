
public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Tree<Double> tree =
	            new Tree<Double>(8.0,
	                    new Tree<Double>(23.0,
	                          new Tree<Double>(1.0),
	                          new Tree<Double>(21.0),
	                          new Tree<Double>(44.0)),
	                    new Tree<Double>(15.0),
	                    new Tree<Double>(18.0,
	                          new Tree<Double>(5.0),
	                          new Tree<Double>(9.0))
	    );

//		It has to return here different from -1.
		int i = tree.searchElement(new Double(44.0));
		
		System.out.println(i);
		
//		Here will return -1.
		i = tree.searchElement(new Double(16.0));
		System.out.println(i);
	}

}
