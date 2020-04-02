package capter08.c3;

public class Duck implements Comparable<Duck>{
	String name;
	int weight;
	
	public Duck(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Duck o) {
		return this.weight-o.weight;
	}
}
