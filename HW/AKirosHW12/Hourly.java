public class Hourly implements Company {
    // attributes
    int OVERTIME_HOURS = 40;
    int AVG_HOURS_PER_WEEK;
    double OVERTIME_RATE = 1.5;
    double HOURLY_RATE;
    double pay;
    String name;
    String ssn;

    public double getPay() {
        return pay;
    }

    public int getOVERTIME_HOURS() {
        return OVERTIME_HOURS;
    }

    public void setOVERTIME_HOURS(int oVERTIME_HOURS) {
        OVERTIME_HOURS = oVERTIME_HOURS;
    }

    public int getAVG_HOURS_PER_WEEK() {
        return AVG_HOURS_PER_WEEK;
    }

    public void setAVG_HOURS_PER_WEEK(int aVG_HOURS_PER_WEEK) {
        AVG_HOURS_PER_WEEK = aVG_HOURS_PER_WEEK;
    }

    public double getOVERTIME_RATE() {
        return OVERTIME_RATE;
    }

    public void setOVERTIME_RATE(double oVERTIME_RATE) {
        OVERTIME_RATE = oVERTIME_RATE;
    }

    public double getHOURLY_RATE() {
        return HOURLY_RATE;
    }

    public void setHOURLY_RATE(double hOURLY_RATE) {
        HOURLY_RATE = hOURLY_RATE;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double calcAnnualPay() {
        return calcWeeklyPay() * WEEKS_PAID;
    }

    @Override
    public double calcWeeklyPay() {
        if (AVG_HOURS_PER_WEEK > OVERTIME_HOURS) {
            return (OVERTIME_HOURS * HOURLY_RATE)
                    + ((AVG_HOURS_PER_WEEK - OVERTIME_HOURS) * HOURLY_RATE * OVERTIME_RATE);
        } else {
            return HOURLY_RATE * 8 * 5;
        }
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