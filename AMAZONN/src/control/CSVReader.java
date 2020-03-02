package control;
import UI.*;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Write a description of class CSVReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CSVReader
{

    public static void main(String args[])
    {
        // Test electronics
        String filename = "Electronics.csv";
        ArrayList<Electronics> list = new ArrayList<Electronics>();

        CSVReader test = new CSVReader();
        test.readElectronicsCSVFile(filename, list);

        for (int i = 0; i < list.size(); i++)
        {
            list.get(i).setDescription();
            System.out.println("");
        }

        // Read the CSV game file data into the list
        String filename1 = "Games.csv";
        ArrayList<Games> list1 = new ArrayList<Games>();

        CSVReader test1 = new CSVReader();
        test.readGamesCSVFile(filename1, list1);

        for (int i = 0; i < list1.size(); i++)
        {
            list1.get(i).setDescription();
            System.out.println("");
        }

        // Test clothes
        String filename2 = "Clothes.csv";
        ArrayList<Clothes> list2 = new ArrayList<Clothes>();

        CSVReader test2 = new CSVReader();
        test.readClothesCSVFile(filename2, list2);

        for (int i = 0; i < list1.size(); i++)
        {
            list2.get(i).setDescription();
            System.out.println("");
        }
    }

    /**
     * This function will take in as input a CSV file containing electronic products and read all the products
     * into the arraylist of electronic products.  This method will be called by the ProductStorage class to 
     * store the product data
     * @param csvfilename
     * @param myList
     */
    public void readElectronicsCSVFile(String csvfilename, ArrayList<Electronics> myList)
    {
    	// Define a bufferedReader object to open the CSV file
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ","; // parse the line of input string separated by comma
        boolean header = true;

        // define both the generalProperties and electronicsProperties arraylist to store the information for each 
        // electronic product read.  Then we instantiate a new Electronics object by calling the constructor that
        // takes both arguments and add it to myList.  myList is the arraylist passed into this reader from ProductStorage
        // as prodElectronics
        ArrayList<Object> generalProperties = new ArrayList<Object>();
        ArrayList<Object> electronicsProperties = new ArrayList<Object>();

        try {  // catch the FileNotFoundException in case the file does not exist.  This is needed by Java
            br = new BufferedReader(new FileReader(csvfilename));

            while ( (line = br.readLine()) != null)
            {
            	// first we read in a line of string from the file using br.readLine()
            	// line.split will split the line of strings separated by comma.  This is the format of the 
            	// CSV file.  Each product information is separated by a comma
                String [] data = line.split(csvSplitBy);

                // We skip the first line because it contains only the header information about each column
                if (header)
                {
                    header = false;
                    continue;
                }

                // In case we run past the end of the file and the while loop doesn't end, we break out of the loop
                if (data.length <= 0)
                    break;

               // We store the the general properties of electronics, which are stored in column 0, 6, 7, and 8
                generalProperties.add(data[0]);
                generalProperties.add(data[6]);
                generalProperties.add((Double)(Double.parseDouble(data[7])));
                generalProperties.add((Double)(Double.parseDouble(data[8])));

                // We store the electronics properties, which are stored in column 1, 2, 3, 4, 5, and 9
                electronicsProperties.add(data[1]);  // creator
                electronicsProperties.add(data[2]);  // type
                electronicsProperties.add((Integer)(Integer.parseInt(data[3])));  // year released
                electronicsProperties.add(data[4]);  // category
                electronicsProperties.add((Integer)(Integer.parseInt(data[5])));  // age
                electronicsProperties.add((Boolean)(Boolean.parseBoolean(data[9])));  // bestseller
                
                // instantiate an electronics object from generalproperties and electronicsproperties, and add it to the arraylist
                myList.add(new Electronics(generalProperties, electronicsProperties));
                // reset both arraylist back to empty and get ready for the next text line from the CSV file
                electronicsProperties.clear();
                generalProperties.clear();

            }

            // close the file
            br.close();

        } catch (FileNotFoundException e) {  // catch FileNotFoundException
            System.out.println("File no found");
        }

        catch (IOException e) {  // catch illegal input exception
            System.out.println("Error reading file");
        }

    }

 
    /**
     * This function will take in as input a CSV file containing game products and read all the products
     * into the arraylist of game products.  This method will be called by the ProductStorage class to 
     * store the product data
     * @param csvfilename
     * @param myList
     */
    public void readGamesCSVFile(String csvfilename, ArrayList<Games> myList)
    {
    	// Define a bufferedReader object to open the CSV file
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";  // parse the line of input string separated by comma
        boolean header = true;

        // define both the generalProperties and gamesProperties arraylist to store the information for each 
        // game product read.  Then we instantiate a new Games object by calling the constructor that
        // takes both arguments and add it to myList.  myList is the arraylist passed into this reader from ProductStorage
        // as prodGames
        ArrayList<Object> generalProperties = new ArrayList<Object>();
        ArrayList<Object> gamesProperties = new ArrayList<Object>();

        try {  // catch the FileNotFoundException in case the file does not exist.  This is needed by Java
            br = new BufferedReader(new FileReader(csvfilename));

            while ( (line = br.readLine()) != null)
            {
            	// first we read in a line of string from the file using br.readLine()
            	// line.split will split the line of strings separated by comma.  This is the format of the 
            	// CSV file.  Each product information is separated by a comma
                String [] data = line.split(csvSplitBy);

                // We skip the first line because it contains only the header information about each column
                if (header)
                {
                    header = false;
                    continue;
                }

                // In case we run past the end of the file and the while loop doesn't end, we break out of the loop
                if (data.length <= 0)
                    break;

                // We store the the general properties of electronics, which are stored in column 0, 5, 6, 7
                generalProperties.add(data[0]);
                generalProperties.add(data[5]);
                generalProperties.add((Double)(Double.parseDouble(data[6])));
                generalProperties.add((Double)(Double.parseDouble(data[7])));

                // We store the games properties, which are stored in column 1, 2, 3, 4, and 8
                gamesProperties.add(data[1]);  // creator
                gamesProperties.add(data[2]);  // type
                gamesProperties.add((Integer)(Integer.parseInt(data[3])));  // year released
                gamesProperties.add((Integer)(Integer.parseInt(data[4])));  // age
                gamesProperties.add((Boolean)(Boolean.parseBoolean(data[8])));  // bestseller
                
                // instantiate an Games object from generalproperties and electronicsproperties, and add it to the arraylist
                myList.add(new Games(generalProperties, gamesProperties));
                // reset both arraylist back to empty and get ready for the next text line from the CSV file
                generalProperties.clear();
                gamesProperties.clear();//clear previous data


            }
            
            br.close();  // close the file

        } catch (FileNotFoundException e)   // catch the exception if the file does not exist
        {
            System.out.println("File no found");
        }

        catch (IOException e)  // catch the exception if the input is invalid
        {
            System.out.println("Error reading file");
        }
    }

    /**
     * This function will take in as input a CSV file containing clothing products and read all the products
     * into the arraylist of game products.  This method will be called by the ProductStorage class to 
     * store the product data
     * @param csvfilename
     * @param myList
     */
    public void readClothesCSVFile(String csvfilename, ArrayList<Clothes> myList)
    {
    	// Define a bufferedReader object to open the CSV file
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";  // parse the line of input string separated by comma
        boolean header = true;

        // define both the generalProperties and clothesProperties arraylist to store the information for each 
        // game product read.  Then we instantiate a new Clothes object by calling the constructor that
        // takes both arguments and add it to myList.  myList is the arraylist passed into this reader from ProductStorage
        // as prodClothes
        ArrayList<Object> generalProperties = new ArrayList<Object>();
        ArrayList<Object> clothesProperties = new ArrayList<Object>();

        try {  // catch the FileNotFoundException in case the file does not exist.  This is needed by Java
            br = new BufferedReader(new FileReader(csvfilename));

            while ( (line = br.readLine()) != null)
            {
            	// first we read in a line of string from the file using br.readLine()
            	// line.split will split the line of strings separated by comma.  This is the format of the 
            	// CSV file.  Each product information is separated by a comma
                String [] data = line.split(csvSplitBy);

                // We skip the first line because it contains only the header information about each column
                if (header)
                {
                    header = false;
                    continue;
                }

                // In case we run past the end of the file and the while loop doesn't end, we break out of the loop
                if (data.length <= 0)
                    break;

                // We store the the general properties of electronics, which are stored in column 0, 7, 8, 9
                generalProperties.add(data[0]);
                generalProperties.add(data[7]);
                generalProperties.add((Double)(Double.parseDouble(data[8])));
                generalProperties.add((Double)(Double.parseDouble(data[9])));

                // We store the games properties, which are stored in column 1, 2, 3, 4, 5, and 6
                clothesProperties.add(data[1]);  // creator
                clothesProperties.add(data[2]);  // type
                clothesProperties.add((Integer)(Integer.parseInt(data[3])));  // year released
                clothesProperties.add((Character)(data[4].charAt(0)));  // gender
                clothesProperties.add(data[5]);  // size
                clothesProperties.add(data[6]);  // color
                
                // instantiate an Clothes object from generalproperties and electronicsproperties, and add it to the arraylist
                myList.add(new Clothes(generalProperties, clothesProperties));
                // reset both arraylist back to empty and get ready for the next text line from the CSV file
                generalProperties.clear();
                clothesProperties.clear();//clear previous data

            }

            br.close();  // close the file

        } catch (FileNotFoundException e) {  // catch error if no input CSV file is found
            System.out.println("File no found");
        }

        catch (IOException e) {  // catch exception if input is invalid
            System.out.println("Error reading file");
        }

    }

}
