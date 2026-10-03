//class 

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Antenna[] ante = new Antenna[4];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int anteID = scn.nextInt();
            scn.nextLine(); //clear buffer
            String name = scn.nextLine();
            String lead = scn.nextLine();
            double vswr = scn.nextDouble();
            ante[i] = new Antenna(anteID, name, lead, vswr);
        }
        //input name
        scn.nextLine();
        String name = scn.nextLine();
        double vswr = scn.nextDouble();

        //output 1
        int task1 = searchByAntennaName(ante, name);
        if (task1 != 0) {
            System.out.println(task1);
        } else {
            System.out.println("There is no antenna with given parameter");
        }

        //output 2
        Antenna[] task2 = sortAnteByVswr(ante, vswr);
        if (task2 != null) {
            for (int i = 0; i < task2.length; i++) {
                System.out.println(task2[i].getLead());
            }
        } else {
            System.out.println("No Antenna found");
        }
    }

    public static int searchByAntennaName(Antenna[] ante, String name) {
        for (int i = 0; i < ante.length; i++) {
            if (ante[i].getName().equalsIgnoreCase(name)) {
                return ante[i].getAntennaID();
            }
        }
        return 0;
    }

    public static Antenna[] sortAnteByVswr(Antenna[] ante, double vswr) {
        //copy 
        Antenna[] copy = new Antenna[ante.length];
        int result = 0;
        for (int i = 0; i < ante.length; i++) {
            if (ante[i].getVswr() < vswr) {
                copy[result] = ante[i];
                result++;
            }
        }
        if (result == 0) {
            return null;
        }
        //sort 
        for (int i = 0; i < result - 1; i++) {
            for (int j = i; j < result; j++) {
                if (copy[i].getVswr() > copy[j].getVswr()) {
                    Antenna temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        //create final ans
        Antenna[] ans = new Antenna[result];
        for (int i = 0; i < result; i++) {
            ans[i] = copy[i];
        }
        return ans;

    }
}

class Antenna {

    private int antennaID;
    private String name;
    private String lead;
    private double vswr;

    public Antenna(int antennaID, String name, String lead, double vswr) {
        this.antennaID = antennaID;
        this.name = name;
        this.lead = lead;
        this.vswr = vswr;
    }
    //setters

    public void setAntennaID(int antennaID) {
        this.antennaID = antennaID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public void setVswr(double vswr) {
        this.vswr = vswr;
    }
    //getters

    public int getAntennaID() {
        return antennaID;
    }

    public String getName() {
        return this.name;
    }

    public String getLead() {
        return this.lead;
    }

    public double getVswr() {
        return this.vswr;
    }
}
