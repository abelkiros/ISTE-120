public interface Company {
    String COMPANY_NAME = "Super Employer Inc.",

            COMPANY_ADDRESS = "Rochester, NY";

    int WEEKS_PAID = 52;

    public void setPay(double pay);

    public double calcAnnualPay();

    public double calcWeeklyPay();
}