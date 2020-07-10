class Customer {
    get fullName() {
        return this._fullName;
    }

    set fullName(value) {
        this._fullName = value;
    }

    get identify() {
        return this._identify;
    }

    set identify(value) {
        this._identify = value;
    }

    get dateOfBirth() {
        return this._dateOfBirth;
    }

    set dateOfBirth(value) {
        this._dateOfBirth = value;
    }

    get email() {
        return this._email;
    }

    set email(value) {
        this._email = value;
    }

    get address() {
        return this._address;
    }

    set address(value) {
        this._address = value;
    }

    get typeOfCustomer() {
        return this._typeOfCustomer;
    }

    set typeOfCustomer(value) {
        this._typeOfCustomer = value;
    }

    get discount() {
        return this._discount;
    }

    set discount(value) {
        this._discount = value;
    }

    get numberOfPeople() {
        return this._numberOfPeople;
    }

    set numberOfPeople(value) {
        this._numberOfPeople = value;
    }

    get rentDays() {
        return this._rentDays;
    }

    set rentDays(value) {
        this._rentDays = value;
    }

    get typeOfService() {
        return this._typeOfService;
    }

    set typeOfService(value) {
        this._typeOfService = value;
    }

    get typeOfRoom() {
        return this._typeOfRoom;
    }

    set typeOfRoom(value) {
        this._typeOfRoom = value;
    }

    constructor(fullName, identify, dateOfBirth, email, address,
        typeOfCustomer, discount, numberOfPeople, rentDays, typeOfService, typeOfRoom) {
        this._fullName = fullName;
        this._identify = identify;
        this._dateOfBirth = dateOfBirth;
        this._email = email;
        this._address = address;
        this._typeOfCustomer = typeOfCustomer;
        this._discount = discount;
        this._numberOfPeople = numberOfPeople;
        this._rentDays = rentDays;
        this._typeOfService = typeOfService;
        this._typeOfRoom = typeOfRoom;
    }

    getTotalBills() {

        let costOfService = 0;
        if (this._typeOfService === "villa") {
            costOfService = 500;
        } else if (this._typeOfService === "house") {
            costOfService = 300;
        } else {
            costOfService = 100;
        }

        return costOfService * this._rentDays * (1 - this._discount / 100);
    }
}