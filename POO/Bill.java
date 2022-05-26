package POO;

public class Bill {
    //fields or variables
    double fee;
    double minutes;
    double tax;

    //constructor
    public Bill() {
    }
    //methods
    double calculateTax(){
        tax=((minutes*0.25)+(fee))*0.15;
        return tax;
    }

    void showBill(){
        System.out.printf("The fee is: %.2f\n",getFee());
        System.out.printf("The minutes are: %.2f\n",getMinutes());
        System.out.printf("The tax is: %.2f\n",calculateTax());
        System.out.printf("The total is: %.2f\n",calculateTotal());
    }
    double calculateTotal(){
        return tax+fee;
    }

    //getters and setters methods
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }


}
