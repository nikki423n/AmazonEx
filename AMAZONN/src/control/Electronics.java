package control;
import UI.*;


import java.util.ArrayList;

public class Electronics extends Product{
	
	private String  creator, type;
	private int yearReleased;
	private boolean bestseller;
	
	
	public Electronics(ArrayList generalProperties, ArrayList electronicsProperties) {
		//general properties
		super.name = (String) generalProperties.get(0);
		super.imagePath = (String) generalProperties.get(1);
		super.price = (double) generalProperties.get(2);
		super.rating = (double) generalProperties.get(3);
		
		creator = (String) electronicsProperties.get(0);
		type = (String) electronicsProperties.get(1);
		yearReleased = (int) electronicsProperties.get(2);
		if (electronicsProperties.get(3) == "TRUE")
			bestseller = true;
		else
			bestseller = false;
		//bestseller = (boolean) electronicsProperties.get(3);

		this.setDescription();
	}
	//@Override
    public String setDescription() {
    	
    	String returnString;
        
        // Convert all descriptions into strings
        // General descriptions
        String des_name = String.format("Product name: %s", super.name);
        String des_category = String.format("Category: Eectronics");
        String des_imagePath = String.format("Image path: %s", super.imagePath);
        String des_price = String.format("Price: $%.2f", super.price);
        String des_rating = String.format("Rating: %.1f", super.rating);

        // electronics descriptions
        String des_creator = String.format("Creator: %s", creator);
        String des_type = String.format("Type: %s", type);
        String des_yearReleased = String.format("Year released: %d", yearReleased);
        //String des_prop = String.format("Youngest age: %s", category);

        String des_bestseller;

        if (bestseller)
            des_bestseller = String.format("Bestseller");
        else
            des_bestseller = String.format("");
        
        // print out Electronics properties
        // We create a single string containing all the information so we can return to the calling function
        returnString = des_name + "\n" + des_creator + "\n";
        returnString = returnString + des_type + "\n" + des_yearReleased + "\n";
        returnString = returnString + des_category + "\n" ;
        returnString = returnString  + des_imagePath + "\n";
        returnString = returnString + des_price + "\n" + des_rating + "\n" + des_bestseller;

        // print all description of electronics
        System.out.println(des_name);
        System.out.println(des_creator);
        System.out.println(des_type);
        System.out.println(des_yearReleased);
        System.out.println(des_category);
        //System.out.println(des_prop);
        System.out.println(des_imagePath);
        System.out.println(des_price);
        System.out.println(des_rating);
        System.out.println(des_bestseller);
        
        return returnString;
    }
	/*
	
	@Override
	protected void setDescription() 
	{
		
        // electronics descriptions
		description = String.format("Created by %s. Type: %s. Year released: %d.", creator, type, yearReleased);

        if (bestseller)
            description += " Bestseller.";
	}
	
	@Override
	public String toString() {
		return description;
	}
	
	public static void main(String args[]) 
	{
		
	}*/
}
