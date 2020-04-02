package capter09.c2;

/**
 * 迭代器与组合模式
 * @author snail
 *菜单项bean
 */
public class MenuItem {
	
	/**
	 * 菜单名称
	 */
	private String name;
	
	/**
	 * 菜单描述
	 */
	private String desc;
	
	/**
	 * 是否是素食
	 */
	private Boolean vege;
	
	/**
	 * 价格
	 */
	private Double price;
	
	public MenuItem(String name,String desc,Boolean vege,Double price) {
		this.name = name;
		this.desc = desc;
		this.vege = vege;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public Boolean getVege() {
		return vege;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", desc=" + desc + ", vege=" + vege + ", price=" + price + "]";
	}
	
	
}
