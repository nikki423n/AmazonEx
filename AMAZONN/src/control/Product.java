package control;
import UI.*;


public abstract class Product {
	
	protected String name = null; //name of product
	protected String description = null; //description that appears for product
	protected String imagePath = null; //imagepath for produce icon
	protected double price = 0.0; //price of product, truncated to 1/100
	protected double rating = 0.0; //rating of product out of 5
	
	/**
	 * abstract method to be implemented by subclass to 
	 * set description of product
	 * 
	 * combines product specific information into a String
	 */
	protected abstract String setDescription();	

	/**
	 * name getter
	 * 
	 * @return name of product
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * description getter
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * imagepath getter
	 * 
	 * @return image path
	 */
	public String getImagePath(){
		return name;
	}
	
	/**
	 * price getter
	 * 
	 * @return name of product
	 */
	public double getPrice(){
		return price;
	}
	
	/**
	 * rating getter
	 * 
	 * @return name of product
	 */
	public double getRating(){
		return rating;
	}
	
}
