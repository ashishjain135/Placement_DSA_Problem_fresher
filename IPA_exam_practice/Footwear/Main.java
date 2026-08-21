
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Footwear[] fw = new Footwear[n];
        for (int i = 0; i < n; i++) {
            int fId = sc.nextInt();
            sc.nextLine();
            String fName = sc.nextLine();
            String fType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            fw[i] = new Footwear(fId, fName, fType, price);
        }
        String type = sc.nextLine();
        String Brand = sc.nextLine();

        int task1 = getCountByType(fw, type);
        //
        if (task1 != 0) {
            System.out.println(task1);
        } else {
            System.out.println("Footwear not available");
        }
        Footwear task2 = getSecondHighestPriceBrand(fw, Brand);
        if (task2 != null) {
            System.out.println(task2.getFid());
            System.out.println(task2.getFName());
            System.out.println(task2.getFprice());
        } else {
            System.out.println("Brand not available");
        }
    }

    //task 1
    public static int getCountByType(Footwear[] fw, String type) {
        int count = 0;
        for (int i = 0; i < fw.length; i++) {
            if (fw[i].getFtype().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    public static Footwear getSecondHighestPriceBrand(Footwear[] fw, String Brand) {
        //copy fw based on Brand
        int count = 0;
        Footwear[] copy = new Footwear[fw.length];
        for (int i = 0; i < fw.length; i++) {
            if (fw[i].getFName().equalsIgnoreCase(Brand)) {
                copy[count] = fw[i];
                count++;
            }
        }
        if (count < 2) {
            return null;
        }
        //apply filter based on price
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (copy[i].getFprice() < copy[j].getFprice()) {
                    Footwear temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        Footwear result = copy[1];
        return result;
    }

}

class Footwear {

    private int fId;
    private String fName;
    private String fType;
    private int fPrice;

    public Footwear(int fId, String fName, String fType, int fPrice) {
        this.fId = fId;
        this.fName = fName;
        this.fType = fType;
        this.fPrice = fPrice;
    }
    //getters 

    public int getFid() {
        return fId;
    }

    public String getFName() {
        return fName;
    }

    public String getFtype() {
        return fType;
    }

    public int getFprice() {
        return fPrice;
    }
    //setters

    public void setFid(int fId) {
        this.fId = fId;
    }

    public void setFname(String fName) {
        this.fName = fName;
    }

    public void setFtype(String fType) {
        this.fType = fType;
    }

    public void setFprice(int fPrice) {
        this.fPrice = fPrice;
    }
}
