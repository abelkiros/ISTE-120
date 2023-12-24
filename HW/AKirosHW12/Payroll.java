import java.util.*;

public class Payroll {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String menu = "\nWhat do you want to do?\n\t1 Create a new employee\n\t2 Set pay\n\t3 Show weekly pay\n\t4 Show annual pay\n\t5 Show summary\n\t6 Quit\n==>";

        int empCount = 0;

        Salaried s1 = new Salaried();

        Hourly h1 = new Hourly();

        while (true) {

            System.out.print(menu);

            int option = input.nextInt();

            if (option == 1) {

                while (true) {

                    System.out.print("\nWhat type of employee would you like to create (Salaried or Hourly)? ");

                    String op = input.next();

                    if (op.equalsIgnoreCase("salaried")) {

                        System.out.print("\nPlease enter the name:");

                        String name = input.next();

                        s1.setName(name);

                        System.out.print("\nPlease enter the social security number:");

                        String ssn = input.next();

                        s1.setSsn(ssn);

                        System.out.print("\nPlease enter the annual pay:");

                        double pay = input.nextDouble();

                        s1.setPay(pay);

                        empCount = empCount + 1;

                        System.out.println("\n==> Employee " + empCount + " has been created.");

                    } else if (op.equalsIgnoreCase("hourly")) {

                        System.out.print("\nPlease enter the name: ");

                        String name = input.next();

                        h1.setName(name);

                        System.out.print("\nPlease enter the social security number: ");

                        String ssn = input.next();

                        h1.setSsn(ssn);

                        double hRate;

                        while (true) {

                            System.out.print("\nPlease enter the hourly rate of pay: ");

                            hRate = input.nextDouble();

                            h1.setHOURLY_RATE(hRate);

                            if (hRate <= 0) {

                                System.out.println("\n***Please enter a number > 0.");
                                continue;

                            } else {

                                break;

                            }

                        }

                        int avg;

                        while (true) {

                            System.out.print("\nPlease enter the average number of hours worked per week: ");

                            avg = input.nextInt();
                            h1.setAVG_HOURS_PER_WEEK(avg);

                            if (avg <= 0) {
                                System.out.println("\n***Please enter a number > 0.");
                                continue;

                            } else {

                                break;

                            }

                        }

                        empCount = empCount + 1;

                        System.out.println("\n==> Employee " + empCount + " has been created.");

                    } else {

                        System.out.println("\n***Please enter either 'salaried' or 'hourly'.");
                        continue;

                    }

                    break;

                }

            } else if (option == 2) {

                System.out.print("Which employee do you wish to use (enter 1 to " + empCount + ")? ");

                while (true) {

                    int emp = input.nextInt();

                    if (emp > empCount || emp <= 0) {

                        System.out.print("\n***ERROR Please enter an employee number from 1 to " + empCount + ": ");

                        continue;

                    } else {

                        System.out.print("\nHow much would you like to set the annual pay to?");

                        double pay = input.nextDouble();

                        while (pay <= 0) {

                            System.out.println("\n***ERROR Please enter an amount > 0.");

                            System.out.print("How much would you like to set the annual pay to? ");

                            pay = input.nextDouble();

                            if (option == 1) {

                                s1.setPay(pay);

                            } else {

                                h1.setPay(pay);

                            }

                        }

                    }

                    break;

                }

            } else if (option == 3) {

                System.out.print("\nWhich employee do you wish to use (enter 1 to " + empCount + ")? ");

                while (true) {

                    int emp = input.nextInt();

                    if (emp > empCount || emp <= 0) {

                        System.out.print("\n***ERROR Please enter an employee number from 1 to " + empCount + ": ");

                        continue;

                    } else {

                        if (option == 1) {

                            System.out.println("\nThe weekly pay is " + s1.calcWeeklyPay());

                        } else {

                            System.out.println("The weekly pay is " + h1.calcWeeklyPay());

                        }

                    }

                    break;

                }

            } else if (option == 4) {

                System.out.print("\nWhich employee do you wish to use (enter 1 to " + empCount + ")? ");

                while (true) {

                    int emp = input.nextInt();

                    if (emp > empCount || emp <= 0) {

                        System.out.print("\n***ERROR Please enter an employee number from 1 to " + empCount + ": ");

                        continue;

                    } else {

                        if (option == 1) {

                            System.out.println("\nThe annual pay is " + s1.calcAnnualPay());

                        } else {

                            System.out.println("\nThe annual pay is " + h1.calcAnnualPay());

                        }

                    }

                    break;

                }

            } else if (option == 5) {

                System.out.print("\nWhich employee do you wish to use (enter 1 to " + empCount + ")? ");

                while (true) {

                    int emp = input.nextInt();

                    if (emp > empCount || emp <= 0) {

                        System.out.print("\n***ERROR Please enter an employee number from 1 to " + empCount + ": ");

                        continue;

                    } else {

                        if (option != 1) {

                            System.out.println(s1.toString());

                        } else {

                            System.out.println(h1.toString());

                        }

                    }

                    break;

                }

            } else if (option == 6) {

                System.out.println("Bye!");

                System.exit(0);

            } else {

                System.out.println("\nERROR Bad option, please try again.");

                // System.out.print(menu);

            }

        } // end of outer loop

    }// end of main

}// end of class