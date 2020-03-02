package control;
//import util.*;
import UI.*;
	
import java.util.ArrayList;
import java.util.Arrays;

/*public class ProductStorage {
    public static ArrayList<Product> prodElectronics = new ArrayList<>();
    public static ArrayList<Product> prodClothes = new ArrayList<>();
    public static ArrayList<Product> prodGames = new ArrayList<>();

    static {
        prodElectronics.add(new Electronics(new ArrayList(Arrays.asList("Madden", "//", 60.00, 3.5)),
                new ArrayList(Arrays.asList("Dell", "PC", 2015, true))));
        prodGames.add(new Games(new ArrayList(Arrays.asList("Madden", "//", 60.00, 3.5)),
                new ArrayList(Arrays.asList("EA", "Sports", 2020, 10, "Single player"))));

        System.out.println(prodElectronics.get(0).getName());
        System.out.println(prodGames);
    }
    public static void main(String args[])
    {
        ProductStorage temp = new ProductStorage();
    }

    
    public void addElectronics(Product e)
    {
        System.out.println("New electronic product added to product storage");
        e.setDescription();
        
        prodElectronics.add(e);
    }
    
    /**
     * Method to add one clothesc object to prodClothes ArrayList
     */
public class ProductStorage {
    private static ArrayList<Electronics> prodElectronics;
    private static ArrayList<Clothes> prodClothes;
    private static ArrayList<Games> prodGames;
    
    
    public static void main(String args[])
    {
        // create general properties for electronics
        /*ArrayList<Object> generalProperties = new ArrayList<Object>();
        generalProperties.add("Electronics");
        generalProperties.add("dell.png");
        generalProperties.add((Double) 500.0);
        generalProperties.add((Double) 9.1);
        
        // create properties for computer in electronics
        ArrayList<Object> electronicsProperties = new ArrayList<Object>();
        electronicsProperties.add("Dell");
        electronicsProperties.add("Computer");
        electronicsProperties.add((Integer) 2015);  // yearReleased
        electronicsProperties.add("PC Laptop"); // category
        electronicsProperties.add((Integer) 10);
        electronicsProperties.add((Boolean) false); // is it bestseller
        
        // instantiate an object electronic, a computer, and add it to productstorage
        Electronics item = new Electronics(generalProperties, electronicsProperties);
        
        ProductStorage product = new ProductStorage(item);
        product.addElectronics(item);
        
        product.removeElectronics(item);*/
        
        /*
         * Read from Electronics CSV file and populate the prodElectronics arrayList with
         * all of the products from the CSV file
         */
        ProductStorage testStorgage = new ProductStorage();
                // Test electronics
        String filename = "Electronics.csv";
        testStorgage.prodElectronics = new ArrayList<Electronics>();

        CSVReader test = new CSVReader();
        test.readElectronicsCSVFile(filename, testStorgage.prodElectronics);

        for (int i = 0; i < testStorgage.prodElectronics.size(); i++)
        {
            testStorgage.prodElectronics.get(i).setDescription();
            System.out.println("");
        }
        
        

        // Test games
        String filename1 = "Games.csv";
        testStorgage.prodGames = new ArrayList<Games>();

        //CSVReader test1 = new CSVReader();
        test.readGamesCSVFile(filename1, testStorgage.prodGames);

        for (int i = 0; i < testStorgage.prodGames.size(); i++)
        {
            testStorgage.prodGames.get(i).setDescription();
            System.out.println("");
        }

        // Test clothes
        String filename2 = "Clothes.csv";
        testStorgage.prodClothes = new ArrayList<Clothes>();

        //CSVReader test2 = new CSVReader();
        test.readClothesCSVFile(filename2, testStorgage.prodClothes);

        for (int i = 0; i < testStorgage.prodClothes.size(); i++)
        {
            testStorgage.prodClothes.get(i).setDescription();
            System.out.println("");
        }
        
        
        
    }
    
    public static ArrayList<Games> getGamesList()
    {
    	return prodGames;
    }
    
    public static ArrayList<Electronics> getElectronicsList()
    {
    	return prodElectronics;
    }
    
    public static ArrayList<Clothes> getClothesList()
    {
    	return prodClothes;
    }

    
    /**
     * Default constructor to initialize all products to empty ArrayList
     */
    public ProductStorage()
    {
        prodElectronics = new ArrayList<Electronics>();
        prodClothes = new ArrayList<Clothes>();
        prodGames = new ArrayList<Games>();
    }
    
    /**
     * Constructor to initialize all products and add first electronics object into prodElectronics
     */
    
    public ProductStorage(Electronics e)
    {
        System.out.println("New electronic product added to product storage");
        e.setDescription();
        
        prodElectronics = new ArrayList<Electronics>();
        prodElectronics.add(e);
        prodClothes = new ArrayList<Clothes>();
        prodGames = new ArrayList<Games>();
    }
    
    /**
     * Constructor to initialize all products and add first electronics object into prodClothes
     */
    
    public ProductStorage(Clothes c)
    {
        prodElectronics = new ArrayList<Electronics>();
        prodClothes = new ArrayList<Clothes>();
        prodClothes.add(c);
        prodGames = new ArrayList<Games>();
    }
    
    /**
     * Constructor to initialize all products and add first electronics object into prodGames
     */
    
    public ProductStorage(Games g)
    {
        prodElectronics = new ArrayList<Electronics>();
        prodClothes = new ArrayList<Clothes>();
        prodGames = new ArrayList<Games>();
        prodGames.add(g);
    }
    

    /**
     * Method to add one electronic object to prodElectronics ArrayList
     */
    
    public void addElectronics(Electronics e)
    {
        System.out.println("New electronic product added to product storage");
        e.setDescription();
        
        prodElectronics.add(e);
    }
    
    /**
     * Method to add one clothesc object to prodClothes ArrayList
     */

    public void addClothes(Clothes c)
    {
        prodClothes.add(c);
    }
    
    /**
     * Method to add one game object to prodGames ArrayList
     */
    
    public void addGames(Games g)
    {
        prodGames.add(g);
    }
    
    /**
     * Method to delete electronic object e from prodElectronics ArrayList
     */
    
    public void removeElectronics(Electronics e)
    {
        System.out.println("New electronic product removed from product storage");
        e.setDescription();
        
        prodElectronics.remove(e);
    }
    
    /**
     * Method to delete clothes object c from prodClothes ArrayList
     */

    public void removeClothes(Clothes c)
    {
        prodClothes.remove(c);
    }
    
    /**
     * Method to delete game object g from prodGames ArrayList
     */
    
    public void removeGames(Games g)
    {
        prodGames.remove(g);
    }
}


