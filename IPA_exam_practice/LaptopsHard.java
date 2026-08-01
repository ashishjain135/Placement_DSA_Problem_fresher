
/**
 * 35 MARKS QUESTIONS
 *
 *  *Question 1:
 *
 *  *Create a class Laptop with the below attributes:
 * laptopId - int
 * brand - String
 * osType - String
 * price - double
 * rating - int
 * Write a parameterized constructor, getters and setters for the above class.
 * Implement the following static methods:
 * 1. countOfLaptopsByBrand()
 * The method countOfLaptopsByBrand() should take an array of
 * Laptop objects and a String parameter representing the brand.
 * The method should find the number of laptops whose brand
 * matches the given brand and whose rating is greater than 3.
 * The method should return the count.
 * If no such laptop is found, the method should return 0.
 *
 *  *2. searchLaptopByOsType()
 *
 *  *The method searchLaptopByOsType() should take an array of
 * Laptop objects and a String parameter representing the osType.
 * The method should find all laptops whose osType matches the
 * given osType and return them as an array.
 * The returned array should be sorted in ascending order of
 * laptopId.
 * If no laptop is found with the given osType, the method
 * should return null.
 *
 *  *Note:
 * - String comparison should be case-insensitive.
 * - Assume that the input data is always valid.
 * - The returned array should contain only the matching laptops.
 * In the main method,
 * - Read the details of 4 Laptop objects and initialize an array
 * of Laptop objects.
 * - Read a String value representing the brand.
 * - Read a String value representing the osType.
 * - Call countOfLaptopsByBrand() and print the returned value.
 * - If the returned value is 0, print:
 * "The given brand is not available"
 * - Call searchLaptopByOsType() and print the laptopId and
 * rating of each Laptop object returned by the method.
 *
 *  *- If the method returns null, print:
 * "The given os is not available"
 */
import java.util.*;

public class LaptopsHard {

    public static int countOfLaptopsByBrand(Laptops[] laptops, String brand) {
        int count = 0;
        for (int i = 0; i < laptops.length; i++) {
            //DELL == dell
            if (laptops[i].getBrand().equalsIgnoreCase(brand) && laptops[i].getRating() > 3) {
                count++;
            }
        }
        return count;
    }

    public static Laptops[] searchLaptopByOsType(Laptops[] laptops, String osType) {
        Laptops[] result = new Laptops[laptops.length];
        int index = 0;
        int flag = 0;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getOsType().equalsIgnoreCase(osType)) {
                result[index] = laptops[i];
                index++;
                flag = 1;
            }
        }
        if (flag == 0) {
            return null;
        }

        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (result[i].getLaptopId() > result[j].getLaptopId()) {
                    Laptops temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        Laptops[] finalResult = new Laptops[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptops[] laptops = new Laptops[4];
        for (int i = 0; i < 4; i++) {
            int laptopId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            double price = sc.nextDouble();
            int rating = sc.nextInt();

            laptops[i] = new Laptops(laptopId, brand, osType, price, rating);
        }

        //input brand name and osType
        sc.nextLine();
        String brand = sc.nextLine();
        String osType = sc.nextLine();

        //only need to return number of laptop whose brand match and also rating > 3
        int output1 = countOfLaptopsByBrand(laptops, brand);
        if (output1 == 0) {
            System.out.println("The given brand is not available");
        } else {
            System.out.println(output1);
        }

        //return array Ostype and rating
        Laptops[] output2 = searchLaptopByOsType(laptops, osType);
        if (output2 == null) {
            System.out.print("The given os is not available");
        } else {
            for (int i = 0; i < output2.length; i++) {
                System.out.println(output2[i].getLaptopId());
                System.out.println(output2[i].getRating());
            }
        }
        sc.close();
    }
}

class Laptops {

    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptops(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    //getters 
    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public String getOsType() {
        return osType;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    //setters
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
