package service.impl;

import models.Room;
import models.Service;
import service.ServiceInterface;
import validation.Validation;

import java.util.Scanner;
import java.util.UUID;

public class RoomServiceImpl implements ServiceInterface {
    Scanner scanner;
    @Override
    public Service addNewService() {
        scanner=new Scanner(System.in);
        Service room=new Room();
        room.setId(UUID.randomUUID().toString().replace("-", ""));
        room.setNameService( Validation.inputAndCheckValidationName());
        System.out.print("Enter area use: ");
        room.setArea​​Use(Validation.inputAndCheckValidationAreaUseOrAreaPool());

        room.setRentalCosts(Validation.inputAndCheckValidationRentalCosts());

        room.setMaxNumberOfPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());

        System.out.print("Enter type rent (Format: Abc Abc): ");
        room.setTypeRent(Validation.inputAndCheckValidationTypeRentOrRoomStandard());

        System.out.print("Enter room standard (Format: Abc Abc): ");
        ((Room) room).setFreeService(scanner.nextLine());

        System.out.println("Enter Free Service");
        ((Room) room).setFreeService(scanner.nextLine());
        System.out.println("------------------------------------------------");

        return room;
    }
}
