package service.impl;

import models.Service;
import models.Villa;
import service.ServiceInterface;
import validation.Validation;

import java.util.Scanner;
import java.util.UUID;

public class VillaServiceImpl implements ServiceInterface {
    Scanner scanner;
    @Override
    public Service addNewService() {
        scanner=new Scanner(System.in);
        Service villa = new Villa();
        villa.setId(UUID.randomUUID().toString().replace("-", ""));

        villa.setNameService( Validation.inputAndCheckValidationName());
        System.out.print("Enter area use: ");
        villa.setArea​​Use(Validation.inputAndCheckValidationAreaUseOrAreaPool());

        villa.setRentalCosts(Validation.inputAndCheckValidationRentalCosts());

        villa.setMaxNumberOfPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());

        System.out.print("Enter type rent (Format: Abc Abc): ");
        villa.setTypeRent(Validation.inputAndCheckValidationTypeRentOrRoomStandard());

        System.out.print("Enter room standard (Format: Abc Abc): ");
        ((Villa) villa).setRoomStandard(Validation.inputAndCheckValidationTypeRentOrRoomStandard());

        System.out.print("Enter convenient description: ");
        ((Villa) villa).setConvenientDescription(scanner.nextLine());

        System.out.print("Enter area pool: ");
        ((Villa) villa).setAreaPool(Validation.inputAndCheckValidationAreaUseOrAreaPool());

        ((Villa) villa).setNumberOfFloors(Validation.inputAndCheckValidationNumberOfFloors());
        System.out.println("------------------------------------------------");
        return villa;
    }
}
