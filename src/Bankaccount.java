import java.time.Month;
import java.time.Year;

public class Bankaccount {
    private int AccNo;
    private String AccName;
    private int Balance;
    private Date openingDate;

    private  Date Dob;

    public Bankaccount() {
        AccNo = 1234;
        AccName = "Credit account";
        Balance = 20000;
        openingDate = new Date(10, 9, 2005);
        Dob = new Date(20,8,2008);
    }

    public Bankaccount(int accNo, String accName, int balance, int Day, int month, int year) {
        this.AccNo = accNo;
        this.AccName = accName;
        this.Balance = balance;
        this.openingDate = new Date(Day, month, year);
        this.Dob = new Date(Day, month,year);
    }

    public void display() {
        System.out.println("AccN0 = " + AccNo + " AccName = " + AccName + "Balance = " + Balance);
        System.out.println("openingDate = " + openingDate.getDay() + "-" + openingDate.getMonth() + " -" + openingDate.getYear());
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String accName) {
        AccName = accName;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
}
