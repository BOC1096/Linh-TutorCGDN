package validation;

import java.time.LocalDate;
import java.util.Scanner;

public class Validation {
    private static String regex = "";
    private static Scanner scanner;

    public static String inputAndCheckValidationName() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter name (Format: Abc Abc): ");
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("Name not valid format");
            }
        }
    }

    public static String inputAndCheckValidationTypeRentOrRoomStandard() {

        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true) {
            scanner = new Scanner(System.in);
            String typeRentOrRoomStandard = scanner.nextLine();
            if (typeRentOrRoomStandard.matches(regex)) {
                return typeRentOrRoomStandard;
            } else {
                System.out.println("Type Rent can not valid format");
                System.out.print("Please enter again: ");
            }
        }
    }

    public static Double inputAndCheckValidationAreaUseOrAreaPool() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                Double area = scanner.nextDouble();
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("Area > 30");
                    System.out.print("Please enter again: ");
                }
            } catch (Exception e) {
                System.out.println("Invalid");
                System.out.print("Please enter again: ");
            }
        }
    }

    public static Double inputAndCheckValidationRentalCosts() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter Rental Costs: ");
                Double rentalCosts = scanner.nextDouble();
                if (rentalCosts > 0) {
                    return rentalCosts;
                } else {
                    System.out.println("Rental Costs not a  number");
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }

    public static Integer inputAndCheckValidationMaxNumberOfPeople() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter Max Number Of People: ");
                int maxNumberOfPeople = scanner.nextInt();
                if (maxNumberOfPeople > 0 && maxNumberOfPeople < 20) {
                    return maxNumberOfPeople;
                } else {
                    System.out.println("0 < Max Number Of People < 20");
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }

    public static Integer inputAndCheckValidationNumberOfFloors() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter Number Of Floors: ");
                Integer numberOfFloors = scanner.nextInt();
                if (numberOfFloors > 0) {
                    return numberOfFloors;
                } else {
                    System.out.println("Number Of Floors is not a number");
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }

    public static String inputAndCheckValidationBirthday() {
        regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter birthday (format dd/MM/yyyy): ");
            String birthday = scanner.nextLine();
            LocalDate date = LocalDate.now();

            if (birthday.matches(regex)) {
                String temp = "";
                for (int i = birthday.length() - 4; i < birthday.length(); i++) {
                    temp += birthday.charAt(i);
                }
                if (date.getYear() - new Integer(temp) >= 18) {
                    return birthday;
                } else {
                    System.out.println("Birthday invalid (> 18).");
                }

            } else {
                System.out.println("Birthday invalid fomart");
            }
        }
    }

    public static void main(String[] args) {
        inputAndCheckValidationBirthday();
    }

}
