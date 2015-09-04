
public class Test {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Graph<Graph.Node> graph = new Graph<Graph.Node>();
		
		graph.addCity("Sofia");
		graph.addCity("Burgas");
		graph.addCity("Plovdiv");
		
		graph.addConnection("Sofia", "Burgas");
		graph.addConnection("Burgas", "Varna");
		graph.addConnection("Plovdiv", "Varna");
		graph.addConnection("Varna", "Plovdiv");
		
		System.out.println("Count of nodes: " + graph.isEmpty());
		graph.printGraphNodes();
		
		graph.removeConnection("Sofia", "Burgas");
		
		graph.removeCity("Varna");
		
		graph.addConnection("Sofia", "Plovdiv");
		
		System.out.println("Count of nodes: " + graph.isEmpty());
		
		System.out.println();
		
		graph.printGraphNodes();
		
		if(graph.isConnected("Sofia", "Plovdiv")){
			System.out.println("There is a connection!");
		}else{
			System.out.println("There is no connection!");
		}
		
		if(graph.isConnected("Sofia", "Burgas")){
			System.out.println("There is a connection!");
		}else{
			System.out.println("There is no connection!");
		}
		
	}

}