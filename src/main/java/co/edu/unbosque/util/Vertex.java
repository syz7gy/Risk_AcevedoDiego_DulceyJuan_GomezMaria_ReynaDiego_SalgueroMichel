package co.edu.unbosque.util;


public class Vertex {
	
	private String name;
	private MyLinkedList<Edge> edges;
	private String jugador;
	private int troops;
	
	public Vertex(String name) {
		this.name=name;
		this.edges=new MyLinkedList<Edge>();
		this.troops = 0 ;
	}

	public Vertex() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyLinkedList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(MyLinkedList<Edge> edges) {
		this.edges = edges;
	}

	public void addEdge(Edge newEdge) {
		edges.add(newEdge);
	}

	public int getTroops() {
		return troops;
	}

	public void setTroops(int troops) {
		this.troops = troops;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "\nVertex [name=" + name + ", edges=" + edges + "]";
	}


}
