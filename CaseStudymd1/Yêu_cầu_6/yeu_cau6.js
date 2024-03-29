let listCustomers = [];
let listEmployees = [];

function addNewCustomer() {
    let fullName = prompt("Vui lòng nhập họ tên: ");
    let identify = prompt("Vui lòng nhập số CMND: ");
    let dateOfBirth = prompt("Vui lòng nhập ngày sinh: ");
    let email = prompt("Vui lòng nhập email: ");
    let address = prompt("Vui lòng nhập địa chỉ: ");
    let typeOfCustomer = prompt("Vui lòng chọn loại khách hàng (Diamond, Platinum, Gold, Silver, Member): ").toLowerCase();
    let discount = parseFloat(prompt("Nhập thẻ giảm giá (%): "));
    let numberOfPeople = parseInt(prompt("Vui lòng nhập số người thuê: "));
    let rentDays = parseInt(prompt("Vui lòng nhập số ngày thuê: "));
    let typeOfService = prompt("Vui lòng nhập loại dịch vụ (Villa, House, Room): ").toLowerCase();
    let typeOfRoom = prompt("Vui lòng nhập loại phòng (VIP, Business, Normal): ").toLowerCase();

    let customer = new Customer(fullName, identify, dateOfBirth, email, address,
        typeOfCustomer, discount, numberOfPeople, rentDays, typeOfService, typeOfRoom);
    listCustomers.push(customer);
}


function addNewEmployee() {
    let fullName = prompt("Vui lòng nhập họ tên: ");
    let identify = prompt("Vui lòng nhập số CMND: ");
    let dateOfBirth = prompt("Vui lòng nhập ngày sinh: ");
    let email = prompt("Please input email: ");
    let address = prompt("Vui lòng nhập địa chỉ: ");
    let position = prompt("Vui lòng nhập địa chỉ: ");
    let salary = parseFloat(prompt("Vui lòng nhập lương: "));

    let employee = new Employee(fullName, identify, dateOfBirth, email, address, position, salary);

    listEmployees.push(employee);
}

function getListCustomer() {
    let listCus = "";
    for (let i = 0; i < listCustomers.length; i++) {
        listCus += "-----------------------------" +
            "Thông tin khách hàng [" + (i + 1) + "]: \n" +
            "Họ tên: " + listCustomers[i].fullName + "\n" +
            "CMND: " + listCustomers[i].identify + "\n" +
            "Ngày sinh: " + listCustomers[i].dateOfBirth + "\n" +
            "Email: " + listCustomers[i].email + "\n" +
            "Địa chỉ: " + listCustomers[i].address + "\n" +
            "Loại khách hàng: " + listCustomers[i].typeOfCustomer + "\n" +
            "Giảm giá: " + listCustomers[i].discount + "%\n" +
            "Số người: " + listCustomers[i].numberOfPeople + "\n" +
            "Số ngày thuê: " + listCustomers[i].rentDays + "\n" +
            "Loại dịch vụ: " + listCustomers[i].typeOfService + "\n" +
            "Loại phòng: " + listCustomers[i].typeOfRoom + "\n";
    }

    return listCus;
}

function displayCustomers() {
    alert(getListCustomer());
}

function getListEmployee() {
    let listEm = "";
    for (let i = 0; i < listEmployees.length; i++) {
        listEm += "-----------------------------" +
            "Thông tin nhân viên [" + (i + 1) + "]: \n" +
            "Họ tên: " + listEmployees[i].fullName + "\n" +
            "CMND: " + listEmployees[i].identify + "\n" +
            "Ngày sinh: " + listEmployees[i].dateOfBirth + "\n" +
            "Email: " + listEmployees[i].email + "\n" +
            "Địa chỉ: " + listEmployees[i].address + "\n" +
            "Vị trí: " + listEmployees[i].position + "\n" +
            "Lương: " + listEmployees[i].salary + "\n"
    }

    return listEm;
}

function displayEmployees() {
    alert(getListEmployee());
}

function getSalaryOfEmployee() {
    let listEm = "";
    for (let i = 0; i < listEmployees.length; i++) {
        listEm += "-----------------------------" +
            "Thông tin nhân viên [" + (i + 1) + "]: \n" +
            "Họ tên: " + listEmployees[i].fullName + "\n" +
            "Vị trí: " + listEmployees[i].position + "\n" +
            "Tổng lương: " + listEmployees[i].getTotalSalary() + "\n"
    }

    alert(listEm);
}

function displayTotalPay() {
    let listCus = "";
    for (let i = 0; i < listCustomers.length; i++) {
        listCus += "-----------------------------" +
            "Thông tin khách hàng [" + (i + 1) + "]: \n" +
            "Họ tên: " + listCustomers[i].fullName + "\n" +
            "CMND: " + listCustomers[i].identify + "\n" +
            "Ngày sinh: " + listCustomers[i].dateOfBirth + "\n" +
            "Email: " + listCustomers[i].email + "\n" +
            "Địa chỉ: " + listCustomers[i].address + "\n" +
            "Loại khách hàng: " + listCustomers[i].typeOfCustomer + "\n" +
            "Giảm giá: " + listCustomers[i].discount + "%\n" +
            "Số người: " + listCustomers[i].numberOfPeople + "\n" +
            "Số ngày thuê: " + listCustomers[i].rentDays + "\n" +
            "Loại dịch vụ: " + listCustomers[i].typeOfService + "\n" +
            "Loại phòng: " + listCustomers[i].typeOfRoom + "\n";
    }

    let flag = true;
    let chooseCustomer = parseInt(prompt(getListCustomer() +
        "Chọn khách hàng  (1-" + listCustomers.length + ")")) - 1;

    if (chooseCustomer < 0 || chooseCustomer > listCustomers.length - 1) {
        flag = false;
        alert("Thất bại");
        return;
    }

    alert("Tổng số tiền:  " + (chooseCustomer + 1) + ": " + listCustomers[chooseCustomer].getTotalBills());
}

function editCustomer() {
    let flag = true;
    let chooseCustomer = parseInt(prompt("Chọn khách hahfng (1-" + listCustomers.length + "): ")) - 1;

    if (chooseCustomer < 0 || chooseCustomer > listCustomers.length - 1) {
        flag = false;
        alert("Thất bại");
        return;
    }

    let chooseItem = parseInt(prompt(
        "1. Họ và tên: " + listCustomers[chooseCustomer][0] + "\n" +
        "2. CMND: " + listCustomers[chooseCustomer][1] + "\n" +
        "3. Ngày sinh: " + listCustomers[chooseCustomer][2] + "\n" +
        "4. Email: " + listCustomers[chooseCustomer][3] + "\n" +
        "5. Địa chỉ: " + listCustomers[chooseCustomer][4] + "\n" +
        "6. Loại khách hàng: " + listCustomers[chooseCustomer][5] + "\n" +
        "7. Giảm giá: " + listCustomers[chooseCustomer][6] + "%\n" +
        "8. Số người thuê: " + listCustomers[chooseCustomer][7] + "\n" +
        "9. Số ngày thuê: " + listCustomers[chooseCustomer][8] + "\n" +
        "10. Loại dịch vụ: " + listCustomers[chooseCustomer][9] + "\n" +
        "11. Loại phòng: " + listCustomers[chooseCustomer][10] + "\n" +
        "Vui lòng chọn (1-11): "));

    switch (chooseItem) {
        case 1:
            listCustomers[chooseCustomer].fullName = prompt("Vui lòng nhập họ tên: ");
            break;
        case 2:
            listCustomers[chooseCustomer].identify = prompt("Vui lòng nhập CMND: ");
            break;
        case 3:
            listCustomers[chooseCustomer].dateOfBirth = prompt("Vui lòng nhập ngày sinh: ");
            break;
        case 4:
            listCustomers[chooseCustomer].email = prompt("Vui lòng nhập email: ");
            break;
        case 5:
            listCustomers[chooseCustomer].address = prompt("Vui lòng nhập địa chỉ: ");
            break;
        case 6:
            listCustomers[chooseCustomer].typeOfCustomer =
                prompt("Vui lòng nhập loại khách hàng (Diamond, Platinum, Gold, Silver, Member): ").toLowerCase();
            break;
        case 7:
            listCustomers[chooseCustomer].discount = parseFloat(prompt("Vui lòng nhập giảm giá (%): "));
            break;
        case 8:
            listCustomers[chooseCustomer].numberOfPeople = parseInt(prompt("Vui lòng nhập số người: "));
            break;
        case 9:
            listCustomers[chooseCustomer].rentDays = parseInt(prompt("Vui lòng nhập số ngày thuê: "));
            break;
        case 10:
            listCustomers[chooseCustomer].typeOfService = prompt("Vui lòng nhập loại dịch vụ (Villa, House, Room): ").toLowerCase();
            break;
        case 11:
            listCustomers[chooseCustomer].typeOfRoom = prompt("Vui lòng nhập loại phòng (VIP, Business, Normal): ").toLowerCase();
            break;
        default:
            flag = false;
            alert("Thất bại");
            break;
    }

    displayCustomers();
}

function deleteCustomer() {
    let flag = true;
    let chooseCustomer = parseInt(prompt("Chọn khách hàng muốn xóa (1-" + listCustomers.length + "): ")) - 1;

    if (chooseCustomer < 0 || chooseCustomer > listCustomers.length - 1) {
        flag = false;
        alert("Chọn lỗi");
        return;
    }

    for (let i = chooseCustomer; i < listCustomers.length - 1; i++) {
        listCustomers[i] = listCustomers[i + 1];
    }
    listCustomers.pop();

    displayCustomers();
}

do {
    var choose = prompt(
        "1. Thêm khách hàng. \n" +
        "2. Hiển thị thông tin khách hàng. \n" +
        "3. Hiển thị tổng hóa đơn khách hàng. \n" +
        "4. Chỉnh sửa thông tin khách hàng. \n" +
        "5. Xóa khách hàng. \n" +
        "6. Thêm nhân viên. \n" +
        "7. Hiển thị thông tin nhân viên. \n" +
        "8. Lương nhân viên. \n" +
        "9. Thoát. \n");

    switch (choose) {
        case "1":
            addNewCustomer();
            break;
        case "2":
            displayCustomers();
            break;
        case "3":
            displayTotalPay();
            break;
        case "4":
            editCustomer();
            break;
        case "5":
            deleteCustomer();
            break;
        case "6":
            addNewEmployee();
            break;
        case "7":
            displayEmployees();
            break;
        case "8":
            getSalaryOfEmployee();
            break;
    }
} while (choose != '9');