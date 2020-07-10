class Employee {
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

    get position() {
        return this._position;
    }

    set position(value) {
        this._position = value;
    }

    get salary() {
        return this._salary;
    }

    set salary(value) {
        this._salary = value;
    }

    constructor(fullName, identify, dateOfBirth, email, address, position, salary) {
        this._fullName = fullName;
        this._identify = identify;
        this._dateOfBirth = dateOfBirth;
        this._email = email;
        this._address = address;
        this._position = position;
        this._salary = salary;
    }

    getTotalSalary() {
        // -	Trợ cấp 500$ cho Employee nào làm ở vị trí Manager
        // -	Trợ cấp 300$ cho Employee nào làm ở vị trí Sale
        // -	Trợ cấp 200$ cho Employee làm việc ở vị trí Marketing
        let subsidize = 0;
        if (this._position === "manager") {
            subsidize = 500;
        } else if (this._position === "sale") {
            subsidize = 300;
        } else if (this._position === "marketing") {
            subsidize = 200;
        }

        return this._salary + subsidize;
    }
}