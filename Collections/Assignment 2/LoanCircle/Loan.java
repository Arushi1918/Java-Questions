public class Loan {
    private double annualInterestRate;
    private int noOfYears;
    private double loanAmt;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int noOfYears, double loanAmt){
        this.annualInterestRate=annualInterestRate;
        this.noOfYears=noOfYears;
        this.loanAmt=loanAmt;
        loanDate=new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }

    public int getNoOfYears(){
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears){
        this.noOfYears=noOfYears;
    }

    public double getLoanAmt(){
        return loanAmt;
    }

    public void setLoanAmt(double loanAmt){
        this.loanAmt=loanAmt;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate=annualInterestRate/1200;
        double mothlyPayment=loanAmt*monthlyInterestRate/
                (1-(1/Math.pow(1+monthlyInterestRate,noOfYears*12)));
        return mothlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment=getMonthlyPayment()*noOfYears*12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
