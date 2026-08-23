
import java.util.*;

public class Main {

    public static void main(String[] args) {
        BankAccount[] ba = new BankAccount[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String accId = sc.nextLine();
            String accHolderName = sc.nextLine();
            String accType = sc.nextLine();
            String occupation = sc.nextLine();

            String pancard = sc.nextLine();
            String acIdenFicType = sc.nextLine();
            String acIden = sc.nextLine();
            String status = sc.nextLine();
            //first need to create KYC Object
            KYC kyc = new KYC(pancard, acIdenFicType, acIden, status);
            ba[i] = new BankAccount(accId, accHolderName, accType, occupation, kyc);
        }
        //input occupation
        String occupation = sc.nextLine();
        String pancard = sc.nextLine();

        //task 1
        int task1 = findKYCStatusCountByOccupation(ba, occupation);
        if (task1 != 0) {
            System.out.println(task1);
        } else {
            System.out.println("No accounts found with approved KYC status");
        }
        //task 2
        BankAccount task2 = getAccountDetailsByPanParameters(ba, pancard);
        if (task2 != null) {
            System.out.println(task2.getAccId() + " " + task2.getAccHolderName() + " " + task2.getAccType());
        } else {
            System.out.println("No account found with the given PAN");
        }

    }

    public static int findKYCStatusCountByOccupation(BankAccount[] ba, String Occupation) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if ((ba[i].getOccupation().equalsIgnoreCase(Occupation)) && ba[i].getKyc().getStatus().equalsIgnoreCase("Approved")) {
                count++;
            }
        }
        return count;
    }

    public static BankAccount getAccountDetailsByPanParameters(BankAccount[] ba, String panNo) {

        for (int i = 0; i < 4; i++) {
            if (ba[i].getKyc().getPancard().equalsIgnoreCase(panNo)) {
                return ba[i];
            }
        }
        return null;
    }
}

class KYC {

    private String pancard;
    private String acIdenFicType;
    private String acIden;
    private String status;

    public KYC(String pancard, String acIdenFicType, String acIden, String status) {
        this.pancard = pancard;
        this.acIdenFicType = acIdenFicType;
        this.acIden = acIden;
        this.status = status;

    }

    //getters
    public String getPancard() {
        return this.pancard;
    }

    public String getAcIdenFicType() {
        return this.acIdenFicType;

    }

    public String getAcIden() {
        return this.acIden;
    }

    public String getStatus() {
        return this.status;
    }

    //setters
    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public void setAcIdenFicType(String acIdenFicType) {
        this.acIdenFicType = acIdenFicType;
    }

    public void setAcIden(String acIden) {
        this.acIden = acIden;

    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class BankAccount {

    private String accId;
    private String accHolderName;
    private String accType;
    private String occupation;
    private KYC kyc;

    public BankAccount(String accId, String accHolderName, String accType, String occupation, KYC kyc) {
        this.accId = accId;
        this.accHolderName = accHolderName;
        this.accType = accType;
        this.occupation = occupation;
        this.kyc = kyc;
    }

    //getters
    public String getAccId() {
        return this.accId;
    }

    public String getAccHolderName() {
        return this.accHolderName;
    }

    public String getAccType() {
        return this.accType;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public KYC getKyc() {
        return this.kyc;
    }

    //setters
    public void setAccId(String accId) {
        this.accId = accId;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setKyc(KYC kyc) {
        this.kyc = kyc;
    }
}
