import java.util.Date;

public class Assingmet1 {


    // DATA FIELDS

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // DEFAULT CONSTRUCTOR
    // =====================================================
    // Default values:
    // Interest Rate = 2.5%
    // Number of Years = 1
    // Loan Amount = 1000
    // Loan Date = Current date

    public Assingmet1() {
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }

    // CONSTRUCTOR WITH PARAMETERS

    public Assingmet1(double annualInterestRate, int numberOfYears, double loanAmount) {

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;

        // Automatically store today's date
        this.loanDate = new Date();
    }


    // GETTER METHODS

    // Get annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    // Get number of years
    public int getNumberOfYears() {
        return numberOfYears;
    }


    // Get loan amount
    public double getLoanAmount() {
        return loanAmount;
    }


    // Get loan creation date
    public Date getLoanDate() {
        return loanDate;
    }



    // SETTER METHODS


    // Set annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    // Set number of years
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }


    // Set loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }



    // GET MONTHLY PAYMENT


    public double getMonthlyPayment() {

        // Convert annual interest rate to monthly rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Total number of monthly payments
        int numberOfPayments = numberOfYears * 12;

        // Loan payment formula
        double monthlyPayment =
                (loanAmount * monthlyInterestRate)
                        /
                        (1 - Math.pow(
                                1 + monthlyInterestRate,
                                -numberOfPayments
                        ));

        return monthlyPayment;
    }



    // GET TOTAL PAYMENT

    public double getTotalPayment() {

        // Monthly payment × total number of months
        return getMonthlyPayment() * numberOfYears * 12;
    }



    // MAIN METHOD - TEST THE LOAN CLASS


    public static void main(String[] args) {


        // 1. CREATE DEFAULT LOAN

        Assingmet1 loan1 = new Assingmet1();

        System.out.println("======== DEFAULT LOAN INFORMATION ========");
        System.out.println("Annual Interest Rate: "
                + loan1.getAnnualInterestRate() + "%");

        System.out.println("Number of Years: "
                + loan1.getNumberOfYears());

        System.out.println("Loan Amount: $"
                + loan1.getLoanAmount());

        System.out.println("Loan Date: "
                + loan1.getLoanDate());

        System.out.printf("Monthly Payment: $%.2f%n",
                loan1.getMonthlyPayment());

        System.out.printf("Total Payment: $%.2f%n",
                loan1.getTotalPayment());



        // 2. CREATE CUSTOM LOAN

        Assingmet1 loan2 = new Assingmet1(5.0, 5, 5000);

        System.out.println();
        System.out.println("========    CUSTOM LOAN INFORMATION   ========");

        System.out.println("Annual Interest Rate: "
                + loan2.getAnnualInterestRate() + "%");

        System.out.println("Number of Years: "
                + loan2.getNumberOfYears());

        System.out.println("Loan Amount: $"
                + loan2.getLoanAmount());

        System.out.println("Loan Date: "
                + loan2.getLoanDate());

        System.out.printf("Monthly Payment: $%.2f%n",
                loan2.getMonthlyPayment());

        System.out.printf("Total Payment: $%.2f%n",
                loan2.getTotalPayment());


        // 3. TEST SETTER METHODS

        loan2.setAnnualInterestRate(6.0);
        loan2.setNumberOfYears(10);
        loan2.setLoanAmount(10000);

        System.out.println();
        System.out.println("========    UPDATED LOAN INFORMATION  ========");

        System.out.println("Annual Interest Rate: "
                + loan2.getAnnualInterestRate() + "%");

        System.out.println("Number of Years: "
                + loan2.getNumberOfYears());

        System.out.println("Loan Amount: $"
                + loan2.getLoanAmount());

        System.out.printf("Monthly Payment: $%.2f%n",
                loan2.getMonthlyPayment());

        System.out.printf("Total Payment: $%.2f%n",
                loan2.getTotalPayment());
    }
}
