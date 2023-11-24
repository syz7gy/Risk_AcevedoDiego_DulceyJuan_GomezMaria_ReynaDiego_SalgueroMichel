package co.edu.unbosque.model;

import co.edu.unbosque.util.Edge;
import co.edu.unbosque.util.Graph;
import co.edu.unbosque.util.MyLinkedList;
import co.edu.unbosque.util.Vertex;

public class Adjacency {

	private MyLinkedList<Vertex> southAmerica, northAmerica, europe, asia, australia, africa;

	// SouthAmerica
	private Vertex s1, s2, s3, s4;
	// NorthAmerica
	private Vertex n1, n2, n3, n4, n5, n6, n7, n8, n9;
	// Europe
	private Vertex e1, e2, e3, e4, e5, e6, e7;
	// Africa
	private Vertex af1, af2, af3, af4, af5, af6;
	// Australia
	private Vertex au1, au2, au3, au4;
	// Asia
	private Vertex as1, as2, as3, as4, as5, as6, as7, as8, as9, as10, as11, as12;

	private Graph worldGraph;

	public Adjacency() {
		
		this.southAmerica = new MyLinkedList<Vertex>();
		this.northAmerica = new MyLinkedList<Vertex>();
		this.europe = new MyLinkedList<Vertex>();
		this.asia = new MyLinkedList<Vertex>();
		this.australia = new MyLinkedList<Vertex>();
		this.africa = new MyLinkedList<Vertex>();
		this.worldGraph = new Graph();
		
		initAdjacencies();
		
	}

	public void initSouth() {

		s1 = new Vertex("s1");
		s2 = new Vertex("s2");
		s3 = new Vertex("s3");
		s4 = new Vertex("s4");

		southAmerica.add(s1);
		southAmerica.add(s2);
		southAmerica.add(s3);
		southAmerica.add(s4);

		for (int i = 0; i < southAmerica.size(); i++) {
			worldGraph.addVertex(southAmerica.get(i).getInfo());
		}

	}

	public void initNorth() {

		n1 = new Vertex("n1");
		n2 = new Vertex("n2");
		n3 = new Vertex("n3");
		n4 = new Vertex("n4");
		n5 = new Vertex("n5");
		n6 = new Vertex("n6");
		n7 = new Vertex("n7");
		n8 = new Vertex("n8");
		n9 = new Vertex("n9");

		northAmerica.add(n1);
		northAmerica.add(n2);
		northAmerica.add(n3);
		northAmerica.add(n4);
		northAmerica.add(n5);
		northAmerica.add(n6);
		northAmerica.add(n7);
		northAmerica.add(n8);
		northAmerica.add(n9);

		for (int i = 0; i < northAmerica.size(); i++) {
			worldGraph.addVertex(northAmerica.get(i).getInfo());
		}

	}

	public void initEurope() {

		e1 = new Vertex("e1");
		e2 = new Vertex("e2");
		e3 = new Vertex("e3");
		e4 = new Vertex("e4");
		e5 = new Vertex("e5");
		e6 = new Vertex("e6");
		e7 = new Vertex("e7");

		europe.add(e1);
		europe.add(e2);
		europe.add(e3);
		europe.add(e4);
		europe.add(e5);
		europe.add(e6);
		europe.add(e7);

		for (int i = 0; i < europe.size(); i++) {
			worldGraph.addVertex(europe.get(i).getInfo());
		}

	}

	public void initAfrica() {

		af1 = new Vertex("af1");
		af2 = new Vertex("af2");
		af3 = new Vertex("af3");
		af4 = new Vertex("af4");
		af5 = new Vertex("af5");
		af6 = new Vertex("af6");

		

		africa.add(af1);
		africa.add(af2);
		africa.add(af3);
		africa.add(af4);
		africa.add(af5);
		africa.add(af6);

		for (int i = 0; i < africa.size(); i++) {
			worldGraph.addVertex(africa.get(i).getInfo());
		}

	}

	public void initAsia() {

		as1 = new Vertex("as1");
		as2 = new Vertex("as2");
		as3 = new Vertex("as3");
		as4 = new Vertex("as4");
		as5 = new Vertex("as5");
		as6 = new Vertex("as6");
		as7 = new Vertex("as7");
		as8 = new Vertex("as8");
		as9 = new Vertex("as9");
		as10 = new Vertex("as10");
		as11 = new Vertex("as11");
		as12 = new Vertex("as12");
		
		
		
		asia.add(as1);
		asia.add(as2);
		asia.add(as3);
		asia.add(as4);
		asia.add(as5);
		asia.add(as6);
		asia.add(as7);
		asia.add(as8);
		asia.add(as9);
		asia.add(as10);
		asia.add(as11);
		asia.add(as12);

		for (int i = 0; i < asia.size(); i++) {
			worldGraph.addVertex(asia.get(i).getInfo());
		}

	}

	public void initAustralia() {

		au1 = new Vertex("au1");
		au2 = new Vertex("au2");
		au3 = new Vertex("au3");
		au4 = new Vertex("au4");

		au1.addEdge(new Edge(au1, au3, 0));
		au1.addEdge(new Edge(au1, au4, 0));
		au2.addEdge(new Edge(au2, au3, 0));
		au2.addEdge(new Edge(au2, au4, 0));
		au2.addEdge(new Edge(au2, as9, 0));
		au3.addEdge(new Edge(au3, au1, 0));
		au3.addEdge(new Edge(au3, au2, 0));
		au3.addEdge(new Edge(au3, au4, 0));
		au4.addEdge(new Edge(au4, au1, 0));
		au4.addEdge(new Edge(au4, au2, 0));
		au4.addEdge(new Edge(au4, au3, 0));

		australia.add(au1);
		australia.add(au2);
		australia.add(au3);
		australia.add(au4);

		for (int i = 0; i < australia.size(); i++) {
			worldGraph.addVertex(australia.get(i).getInfo());
		}

	}
	
	public void initAdjacencies() {
		
		initSouth();
		initNorth();
		initEurope();
		initAfrica();
		initAsia();
		initAustralia();
		
		//SouthAmerica
		s1.addEdge(new Edge(s1, s2, 0));
		s1.addEdge(new Edge(s1, s3, 0));
		s2.addEdge(new Edge(s2, s1, 0));
		s2.addEdge(new Edge(s2, s3, 0));
		s2.addEdge(new Edge(s2, s4, 0));
		s2.addEdge(new Edge(s2, af5, 0));
		s3.addEdge(new Edge(s3, s1, 0));
		s3.addEdge(new Edge(s3, s2, 0));
		s3.addEdge(new Edge(s3, s4, 0));
		s4.addEdge(new Edge(s4, s2, 0));
		s4.addEdge(new Edge(s4, s3, 0));
		s4.addEdge(new Edge(s4, n3, 0));
		
		//NorthAmerica
		n1.addEdge(new Edge(n1, n2, 0));
		n1.addEdge(new Edge(n1, n6, 0));
		n1.addEdge(new Edge(n1, as6, 0));
		n2.addEdge(new Edge(n2, n1, 0));
		n2.addEdge(new Edge(n2, n6, 0));
		n2.addEdge(new Edge(n2, n7, 0));
		n2.addEdge(new Edge(n2, n9, 0));
		n3.addEdge(new Edge(n3, n4, 0));
		n3.addEdge(new Edge(n3, n9, 0));
		n3.addEdge(new Edge(n3, s4, 0));
		n4.addEdge(new Edge(n4, n3, 0));
		n4.addEdge(new Edge(n4, n7, 0));
		n4.addEdge(new Edge(n4, n8, 0));
		n4.addEdge(new Edge(n4, n9, 0));
		n5.addEdge(new Edge(n5, n6, 0));
		n5.addEdge(new Edge(n5, n7, 0));
		n5.addEdge(new Edge(n5, n8, 0));
		n5.addEdge(new Edge(n5, e2, 0));
		n6.addEdge(new Edge(n6, n1, 0));
		n6.addEdge(new Edge(n6, n2, 0));
		n6.addEdge(new Edge(n6, n5, 0));
		n6.addEdge(new Edge(n6, n7, 0));
		n7.addEdge(new Edge(n7, n2, 0));
		n7.addEdge(new Edge(n7, n4, 0));
		n7.addEdge(new Edge(n7, n5, 0));
		n7.addEdge(new Edge(n7, n6, 0));
		n7.addEdge(new Edge(n7, n8, 0));
		n7.addEdge(new Edge(n7, n9, 0));
		n8.addEdge(new Edge(n8, n4, 0));
		n8.addEdge(new Edge(n8, n5, 0));
		n8.addEdge(new Edge(n8, n7, 0));
		n9.addEdge(new Edge(n9, n2, 0));
		n9.addEdge(new Edge(n9, n3, 0));
		n9.addEdge(new Edge(n9, n4, 0));
		n9.addEdge(new Edge(n9, n7, 0));
		
		//Europe
		e1.addEdge(new Edge(e1, e2, 0));
		e1.addEdge(new Edge(e1, e3, 0));
		e1.addEdge(new Edge(e1, e4, 0));
		e1.addEdge(new Edge(e1, e7, 0));
		e2.addEdge(new Edge(e2, e1, 0));
		e2.addEdge(new Edge(e2, e4, 0));
		e2.addEdge(new Edge(e2, n5, 0));
		e3.addEdge(new Edge(e3, e1, 0));
		e3.addEdge(new Edge(e3, e4, 0));
		e3.addEdge(new Edge(e3, e5, 0));
		e3.addEdge(new Edge(e3, e6, 0));
		e3.addEdge(new Edge(e3, e7, 0));
		e4.addEdge(new Edge(e4, e1, 0));
		e4.addEdge(new Edge(e4, e2, 0));
		e4.addEdge(new Edge(e4, e3, 0));
		e4.addEdge(new Edge(e4, e6, 0));
		e5.addEdge(new Edge(e5, e3, 0));
		e5.addEdge(new Edge(e5, e6, 0));
		e5.addEdge(new Edge(e5, e7, 0));
		e5.addEdge(new Edge(e5, af3, 0));
		e5.addEdge(new Edge(e5, af5, 0));
		e5.addEdge(new Edge(e5, as7, 0));
		e6.addEdge(new Edge(e6, e3, 0));
		e6.addEdge(new Edge(e6, e4, 0));
		e6.addEdge(new Edge(e6, e5, 0));
		e6.addEdge(new Edge(e6, as1, 0));
		e6.addEdge(new Edge(e6, as7, 0));
		e6.addEdge(new Edge(e6, as11, 0));
		e7.addEdge(new Edge(e7, e1, 0));
		e7.addEdge(new Edge(e7, e3, 0));
		e7.addEdge(new Edge(e7, e5, 0));
		e7.addEdge(new Edge(e7, af5, 0));
		
		//Africa
		af1.addEdge(new Edge(af1, af2, 0));
		af1.addEdge(new Edge(af1, af5, 0));
		af1.addEdge(new Edge(af1, af6, 0));
		af2.addEdge(new Edge(af2, af1, 0));
		af2.addEdge(new Edge(af2, af3, 0));
		af2.addEdge(new Edge(af2, af4, 0));
		af2.addEdge(new Edge(af2, af5, 0));
		af2.addEdge(new Edge(af2, af6, 0));
		af3.addEdge(new Edge(af3, af2, 0));
		af3.addEdge(new Edge(af3, af5, 0));
		af3.addEdge(new Edge(af3, e5, 0));
		af3.addEdge(new Edge(af3, as7, 0));
		af4.addEdge(new Edge(af4, af2, 0));
		af4.addEdge(new Edge(af4, af6, 0));
		af5.addEdge(new Edge(af5, af1, 0));
		af5.addEdge(new Edge(af5, af2, 0));
		af5.addEdge(new Edge(af5, af3, 0));
		af5.addEdge(new Edge(af5, s2, 0));
		af5.addEdge(new Edge(af5, e5, 0));
		af5.addEdge(new Edge(af5, e7, 0));
		af6.addEdge(new Edge(af6, af1, 0));
		af6.addEdge(new Edge(af6, af2, 0));
		af6.addEdge(new Edge(af6, af4, 0));
		
		//Asia
		as1.addEdge(new Edge(as1, as2, 0));
		as1.addEdge(new Edge(as1, as3, 0));
		as1.addEdge(new Edge(as1, as7, 0));
		as1.addEdge(new Edge(as1, as11, 0));
		as1.addEdge(new Edge(as1, e6, 0));
		as2.addEdge(new Edge(as2, as1, 0));
		as2.addEdge(new Edge(as2, as3, 0));
		as2.addEdge(new Edge(as2, as8, 0));
		as2.addEdge(new Edge(as2, as9, 0));
		as2.addEdge(new Edge(as2, as10, 0));
		as2.addEdge(new Edge(as2, as11, 0));
		as3.addEdge(new Edge(as3, as1, 0));
		as3.addEdge(new Edge(as3, as2, 0));
		as3.addEdge(new Edge(as3, as7, 0));
		as3.addEdge(new Edge(as3, as9, 0));
		as4.addEdge(new Edge(as4, as8, 0));
		as4.addEdge(new Edge(as4, as10, 0));
		as4.addEdge(new Edge(as4, as12, 0));
		as5.addEdge(new Edge(as5, as6, 0));
		as5.addEdge(new Edge(as5, as8, 0));
		as6.addEdge(new Edge(as6, as4, 0));
		as6.addEdge(new Edge(as6, as5, 0));
		as6.addEdge(new Edge(as6, as8, 0));
		as6.addEdge(new Edge(as6, as12, 0));
		as6.addEdge(new Edge(as6, n1, 0));
		as7.addEdge(new Edge(as7, as1, 0));
		as7.addEdge(new Edge(as7, as3, 0));
		as7.addEdge(new Edge(as7, af3, 0));
		as7.addEdge(new Edge(as7, e5, 0));
		as7.addEdge(new Edge(as7, e6, 0));
		as8.addEdge(new Edge(as8, as2, 0));
		as8.addEdge(new Edge(as8, as4, 0));
		as8.addEdge(new Edge(as8, as5, 0));
		as8.addEdge(new Edge(as8, as6, 0));
		as8.addEdge(new Edge(as8, as10, 0));
		as9.addEdge(new Edge(as9, as2, 0));
		as9.addEdge(new Edge(as9, as3, 0));
		as9.addEdge(new Edge(as9, au2, 0));
		as10.addEdge(new Edge(as10, as2, 0));
		as10.addEdge(new Edge(as10, as4, 0));
		as10.addEdge(new Edge(as10, as8, 0));
		as10.addEdge(new Edge(as10, as11, 0));
		as10.addEdge(new Edge(as10, as12, 0));
		as11.addEdge(new Edge(as11, as1, 0));
		as11.addEdge(new Edge(as11, as2, 0));
		as11.addEdge(new Edge(as11, as10, 0));
		as11.addEdge(new Edge(as11, e6, 0));
		as12.addEdge(new Edge(as12, as4, 0));
		as12.addEdge(new Edge(as12, as6, 0));
		as12.addEdge(new Edge(as12, as10, 0));
		
	}

	public MyLinkedList<Vertex> getSouthAmerica() {
		return southAmerica;
	}

	public void setSouthAmerica(MyLinkedList<Vertex> southAmerica) {
		this.southAmerica = southAmerica;
	}

	public MyLinkedList<Vertex> getNorthAmerica() {
		return northAmerica;
	}

	public void setNorthAmerica(MyLinkedList<Vertex> northAmerica) {
		this.northAmerica = northAmerica;
	}

	public MyLinkedList<Vertex> getEurope() {
		return europe;
	}

	public void setEurope(MyLinkedList<Vertex> europe) {
		this.europe = europe;
	}

	public MyLinkedList<Vertex> getAsia() {
		return asia;
	}

	public void setAsia(MyLinkedList<Vertex> asia) {
		this.asia = asia;
	}

	public MyLinkedList<Vertex> getAustralia() {
		return australia;
	}

	public void setAustralia(MyLinkedList<Vertex> australia) {
		this.australia = australia;
	}

	public MyLinkedList<Vertex> getAfrica() {
		return africa;
	}

	public void setAfrica(MyLinkedList<Vertex> africa) {
		this.africa = africa;
	}

	public Vertex getS1() {
		return s1;
	}

	public void setS1(Vertex s1) {
		this.s1 = s1;
	}

	public Vertex getS2() {
		return s2;
	}

	public void setS2(Vertex s2) {
		this.s2 = s2;
	}

	public Vertex getS3() {
		return s3;
	}

	public void setS3(Vertex s3) {
		this.s3 = s3;
	}

	public Vertex getS4() {
		return s4;
	}

	public void setS4(Vertex s4) {
		this.s4 = s4;
	}

	public Vertex getN1() {
		return n1;
	}

	public void setN1(Vertex n1) {
		this.n1 = n1;
	}

	public Vertex getN2() {
		return n2;
	}

	public void setN2(Vertex n2) {
		this.n2 = n2;
	}

	public Vertex getN3() {
		return n3;
	}

	public void setN3(Vertex n3) {
		this.n3 = n3;
	}

	public Vertex getN4() {
		return n4;
	}

	public void setN4(Vertex n4) {
		this.n4 = n4;
	}

	public Vertex getN5() {
		return n5;
	}

	public void setN5(Vertex n5) {
		this.n5 = n5;
	}

	public Vertex getN6() {
		return n6;
	}

	public void setN6(Vertex n6) {
		this.n6 = n6;
	}

	public Vertex getN7() {
		return n7;
	}

	public void setN7(Vertex n7) {
		this.n7 = n7;
	}

	public Vertex getN8() {
		return n8;
	}

	public void setN8(Vertex n8) {
		this.n8 = n8;
	}

	public Vertex getN9() {
		return n9;
	}

	public void setN9(Vertex n9) {
		this.n9 = n9;
	}

	public Vertex getE1() {
		return e1;
	}

	public void setE1(Vertex e1) {
		this.e1 = e1;
	}

	public Vertex getE2() {
		return e2;
	}

	public void setE2(Vertex e2) {
		this.e2 = e2;
	}

	public Vertex getE3() {
		return e3;
	}

	public void setE3(Vertex e3) {
		this.e3 = e3;
	}

	public Vertex getE4() {
		return e4;
	}

	public void setE4(Vertex e4) {
		this.e4 = e4;
	}

	public Vertex getE5() {
		return e5;
	}

	public void setE5(Vertex e5) {
		this.e5 = e5;
	}

	public Vertex getE6() {
		return e6;
	}

	public void setE6(Vertex e6) {
		this.e6 = e6;
	}

	public Vertex getE7() {
		return e7;
	}

	public void setE7(Vertex e7) {
		this.e7 = e7;
	}

	public Vertex getAf1() {
		return af1;
	}

	public void setAf1(Vertex af1) {
		this.af1 = af1;
	}

	public Vertex getAf2() {
		return af2;
	}

	public void setAf2(Vertex af2) {
		this.af2 = af2;
	}

	public Vertex getAf3() {
		return af3;
	}

	public void setAf3(Vertex af3) {
		this.af3 = af3;
	}

	public Vertex getAf4() {
		return af4;
	}

	public void setAf4(Vertex af4) {
		this.af4 = af4;
	}

	public Vertex getAf5() {
		return af5;
	}

	public void setAf5(Vertex af5) {
		this.af5 = af5;
	}

	public Vertex getAf6() {
		return af6;
	}

	public void setAf6(Vertex af6) {
		this.af6 = af6;
	}

	public Vertex getAu1() {
		return au1;
	}

	public void setAu1(Vertex au1) {
		this.au1 = au1;
	}

	public Vertex getAu2() {
		return au2;
	}

	public void setAu2(Vertex au2) {
		this.au2 = au2;
	}

	public Vertex getAu3() {
		return au3;
	}

	public void setAu3(Vertex au3) {
		this.au3 = au3;
	}

	public Vertex getAu4() {
		return au4;
	}

	public void setAu4(Vertex au4) {
		this.au4 = au4;
	}

	public Vertex getAs1() {
		return as1;
	}

	public void setAs1(Vertex as1) {
		this.as1 = as1;
	}

	public Vertex getAs2() {
		return as2;
	}

	public void setAs2(Vertex as2) {
		this.as2 = as2;
	}

	public Vertex getAs3() {
		return as3;
	}

	public void setAs3(Vertex as3) {
		this.as3 = as3;
	}

	public Vertex getAs4() {
		return as4;
	}

	public void setAs4(Vertex as4) {
		this.as4 = as4;
	}

	public Vertex getAs5() {
		return as5;
	}

	public void setAs5(Vertex as5) {
		this.as5 = as5;
	}

	public Vertex getAs6() {
		return as6;
	}

	public void setAs6(Vertex as6) {
		this.as6 = as6;
	}

	public Vertex getAs7() {
		return as7;
	}

	public void setAs7(Vertex as7) {
		this.as7 = as7;
	}

	public Vertex getAs8() {
		return as8;
	}

	public void setAs8(Vertex as8) {
		this.as8 = as8;
	}

	public Vertex getAs9() {
		return as9;
	}

	public void setAs9(Vertex as9) {
		this.as9 = as9;
	}

	public Vertex getAs10() {
		return as10;
	}

	public void setAs10(Vertex as10) {
		this.as10 = as10;
	}

	public Vertex getAs11() {
		return as11;
	}

	public void setAs11(Vertex as11) {
		this.as11 = as11;
	}

	public Vertex getAs12() {
		return as12;
	}

	public void setAs12(Vertex as12) {
		this.as12 = as12;
	}

	public Graph getWorldGraph() {
		return worldGraph;
	}

	public void setWorldGraph(Graph worldGraph) {
		this.worldGraph = worldGraph;
	}

}
