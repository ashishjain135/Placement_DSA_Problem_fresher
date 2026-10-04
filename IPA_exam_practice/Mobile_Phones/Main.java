import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Mobile[]mobile = new Mobile[4];
        for(int i = 0; i<4; i++){
            int mobileId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String model = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            double rating = sc.nextDouble();
            sc.nextLine();
            mobile[i] = new Mobile(mobileId, brand,model, price, rating);
        }
        //input for operating
        String brand = sc.nextLine();
        double price = sc.nextDouble();
        sc.nextLine();
        //output 1 
        Mobile task1 = findMobileByBrand(mobile, brand);
        if(task1 != null){
            System.out.println(task1.getMobileId());
            System.out.println(task1.getModel());
            System.out.println(task1.getPrice());
        }else{
            System.out.println("No mobile found");
        }

        //output 2 
        Mobile[]task2 = sortMobileByPrice(mobile, price);
        if(task2 != null){
            for(int i = 0; i<task2.length; i++){
                System.out.println(task2[i].getModel());
            }
        }else{
            System.out.println("No mobile found");
        }
    }
    public static Mobile findMobileByBrand(Mobile[]mobile, String brand){
        Mobile ans = null;
        for(int i = 0; i<mobile.length; i++){
            if(mobile[i].getBrand().equalsIgnoreCase(brand)){
                return mobile[i];
            }
        }
        return ans;
    } 
    public static Mobile[]sortMobileByPrice(Mobile[]mobile, double maxPrice){
        Mobile[]copy = new Mobile[mobile.length];
        int result = 0;
        for(int i = 0; i<mobile.length; i++){
            if(mobile[i].getPrice() < maxPrice && mobile[i].getRating() >= 4.0){
                copy[result] = mobile[i];
                result++;
            }
        }
        //if no result found return null
        if(result == 0){
            return null;
        }
        //sort on basis price
        for(int i = 0; i<result-1; i++){
            for(int j = i+1; j<result; j++){
                if(copy[i].getPrice() > copy[j].getPrice()){
                    Mobile temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
                if(copy[i].getPrice() == copy[j].getPrice()){
                    if(copy[i].getRating() > copy[j].getRating()){
                        Mobile temp = copy[i];
                        copy[i] = copy[j];
                        copy[j] = temp;
                    }
                }
            }
        }
        Mobile []ans = new Mobile[result];
        for(int i = 0; i<result; i++){
            ans[i] = copy[i]; 
        }
        return ans;
    }
}
class Mobile{
    private int mobileId;
    private String brand;
    private String model;
    private double price;
    private double rating;

    public Mobile(int mobileId, String brand,String model, double price, double rating){
        this.mobileId = mobileId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.rating = rating;
    }
    //setters
    public void setMobileId(int mobileId){
        this.mobileId = mobileId;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    //getters
    public int getMobileId(){
        return this.mobileId;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public double getPrice(){
        return this.price;
    }
    public double getRating(){
        return this.rating;
    }
}