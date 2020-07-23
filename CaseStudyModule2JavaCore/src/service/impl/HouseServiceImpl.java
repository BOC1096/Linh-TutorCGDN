package service.impl;

import models.House;
import models.Service;
import service.ServiceInterface;
import validation.Validation;

import java.util.Scanner;
import java.util.UUID;

public class HouseServiceImpl implements ServiceInterface {
    Scanner scanner;

    @Override
    public Service addNewService() {
        scanner = new Scanner(System.in);
        Service house = new House();
        house.setId(UUID.randomUUID().toString().replace("-", ""));
        house.setNameService(Validation.inputAndCheckValidationName());
        System.out.print("Enter area use: ");
        house.setArea​​Use(Validation.inputAndCheckValidationAreaUseOrAreaPool());

        house.setRentalCosts(Validation.inputAndCheckValidationRentalCosts());

        house.setMaxNumberOfPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());

        System.out.print("Enter type rent (Format: Abc Abc): ");
        house.setTypeRent(Validation.inputAndCheckValidationTypeRentOrRoomStandard());

        System.out.print("Enter room standard (Format: Abc Abc): ");
        ((House) house).setRoomStandard(Validation.inputAndCheckValidationTypeRentOrRoomStandard());

        System.out.print("Enter convenient description: ");
        ((House) house).setConvenientDescription(scanner.nextLine());

        ((House) house).setNumberOfFloors(Validation.inputAndCheckValidationNumberOfFloors());
        System.out.println("------------------------------------------------");
        return house;
    }
}
