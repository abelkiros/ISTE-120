public class Salaried implements Company {
    // attributes
    double HEALTH_INSURANCE = 125.50;
    double pay;
    String name;
    String ssn;

    public double getPay() {
        return pay;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double calcAnnualPay() {
        return WEEKS_PAID * HEALTH_INSURANCE;
    }

    @Override
    public double calcWeeklyPay() {
        return (calcAnnualPay() / WEEKS_PAID) - HEALTH_INSURANCE;
    }

    @Override
    public String toString() {
        return String.format(
                "\nName: %s%nSSN: %s%n\tAnnual salary:   $   %10.2f%n\tAnnual Pay:     $   %10.2f%n\tWeekly Pay:   $   %10.2f",
                getName(), getSsn(), getPay(), calcAnnualPay(), calcWeeklyPay());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

}// end of class