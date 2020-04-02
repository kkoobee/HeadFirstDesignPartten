package capter09.c4;

public class MenuItem extends MenuComponent{
	
	private String name;
	
	private String description;
	
	private boolean vegetarian;
	
	private double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void print() {
		System.err.println("MenuItem [name=" + name + ", description=" + description + ", vegetarian=" + vegetarian + ", price="
				+ price + "]");
	}
}
