class Bankaccount {
    int accno;
    String accname;
    String address;
    int phone;
    String gender;

    public Bankaccount(int accno, String accname, String address, int phone, String gender) {
        this.accno = accno;
        this.accname = accname;
        this.address = address;
        this.phone = phone;
        this.gender = gender;

    }

    public void showdetails() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Name: " + accname);
        System.out.println("Address" + address);
        System.out.println(phone);
        System.out.println(gender);

    }

}

class Savingaccount extends Bankaccount {
    int currentamount;
    int month;

    public Savingaccount(int accno, String accname, String address, int phone, String gender, int currentamount,
            int month) {
        super(accno, accname, address, phone, gender);
        this.currentamount = currentamount;
        this.month = month;
    }

    public double calctotal() {
        if (month <= 3) {
            return (currentamount + currentamount * 0.02);
        } else if (month > 3 && month <= 6) {
            return (currentamount + currentamount * 0.05);

        } else if (month > 6 && month < 12) {
            return (currentamount + currentamount * 0.08);
        } else {
            return (currentamount + currentamount * (11.03) / 100);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Savingaccount s1 = new Savingaccount(123, "Raj", "BALAJU", 983467389, "M", 20000, 13);
        s1.showdetails();
        System.out.println("Return" + s1.calctotal());

    }
}