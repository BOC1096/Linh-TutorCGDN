let arrNameCustomers = [];

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

    arrNameCustomers.push([fullName, identify, dateOfBirth, email, address,
        typeOfCustomer, discount, numberOfPeople, rentDays, typeOfService, typeOfRoom
    ]);
}

function displayCustomers() {
    let listCus = "";
    for (let i = 0; i < arrNameCustomers.length; i++) {
        listCus += "-----------------------------" +
            "Thông tin khách hàng [" + (i + 1) + "]: \n" +
            "Họ và tên: " + arrNameCustomers[i][0] + "\n" +
            "CMND: " + arrNameCustomers[i][1] + "\n" +
            "Ngày sinh: " + arrNameCustomers[i][2] + "\n" +
            "Email: " + arrNameCustomers[i][3] + "\n" +
            "Địa chỉ: " + arrNameCustomers[i][4] + "\n" +
            "Loại khách hàng: " + arrNameCustomers[i][5] + "\n" +
            "Giảm giá: " + arrNameCustomers[i][6] + "%\n" +
            "Số người thuê: " + arrNameCustomers[i][7] + "\n" +
            "Số ngày thuê: " + arrNameCustomers[i][8] + "\n" +
            "Loại dịch vụ: " + arrNameCustomers[i][9] + "\n" +
            "Loại khách hàng: " + arrNameCustomers[i][10] + "\n";
    }
    alert(listCus);
}

function editCustomer() {
    let flag = true;
    let chooseCustomer = parseInt(prompt("Chọn khách hàng: (1-" + arrNameCustomers.length + "): ")) - 1;

    if (chooseCustomer < 0 || chooseCustomer > arrNameCustomers.length - 1) {
        flag = false;
        alert("Thất bại");
        return;
    }

    let chooseItem = parseInt(prompt(
        "1. Họ và tên: " + arrNameCustomers[chooseCustomer][0] + "\n" +
        "2. CMND: " + arrNameCustomers[chooseCustomer][1] + "\n" +
        "3. Ngày sinh: " + arrNameCustomers[chooseCustomer][2] + "\n" +
        "4. Email: " + arrNameCustomers[chooseCustomer][3] + "\n" +
        "5. Địa chỉ: " + arrNameCustomers[chooseCustomer][4] + "\n" +
        "6. Loại khách hàng: " + arrNameCustomers[chooseCustomer][5] + "\n" +
        "7. Giảm giá: " + arrNameCustomers[chooseCustomer][6] + "%\n" +
        "8. Số người thuê: " + arrNameCustomers[chooseCustomer][7] + "\n" +
        "9. Số ngày thuê: " + arrNameCustomers[chooseCustomer][8] + "\n" +
        "10. Loại dịch vụ: " + arrNameCustomers[chooseCustomer][9] + "\n" +
        "11. Loại phòng: " + arrNameCustomers[chooseCustomer][10] + "\n" +
        "Vui lòng chọn (1-11): "));

    switch (chooseItem) {
        case 1:
            arrNameCustomers[chooseCustomer][0] = prompt("Vui lòng nhập họ tên: ");
            break;
        case 2:
            arrNameCustomers[chooseCustomer][1] = prompt("Vui lòng nhập số CMND: ");
            break;
        case 3:
            arrNameCustomers[chooseCustomer][2] = prompt("Vui lòng nhập ngày sinh: ");
            break;
        case 4:
            arrNameCustomers[chooseCustomer][3] = prompt("Vui lòng nhập email: ");
            break;
        case 5:
            arrNameCustomers[chooseCustomer][4] = prompt("Vui lòng nhập địa chỉ: ");
            break;
        case 6:
            arrNameCustomers[chooseCustomer][5] = prompt("Vui lòng nhập loại khách hàng (Diamond, Platinum, Gold, Silver, Member): ").toLowerCase();
            break;
        case 7:
            arrNameCustomers[chooseCustomer][6] = parseFloat(prompt("Vui lòng nhập thẻ giảm giá (%): "));
            break;
        case 8:
            arrNameCustomers[chooseCustomer][7] = parseInt(prompt("Vui lòng nhập số người thuê: "));
            break;
        case 9:
            arrNameCustomers[chooseCustomer][8] = parseInt(prompt("Vui lòng nhập số ngày thuê: "));
            break;
        case 10:
            arrNameCustomers[chooseCustomer][9] = prompt("Vui lòng chọn loại dịch vụ (Villa, House, Room): ").toLowerCase();
            break;
        case 11:
            arrNameCustomers[chooseCustomer][10] = prompt("Vui lòng nhập loại phòng (VIP, Business, Normal): ").toLowerCase();
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
    let chooseCustomer = parseInt(prompt("Chọn khách hàng muốn xóa (1-" + arrNameCustomers.length + "): ")) - 1;

    if (chooseCustomer < 0 || chooseCustomer > arrNameCustomers.length - 1) {
        flag = false;
        alert("Thất bại");
        return;
    }

    for (let i = chooseCustomer; i < arrNameCustomers.length - 1; i++) {
        arrNameCustomers[i] = arrNameCustomers[i + 1];
    }
    arrNameCustomers.pop();

    displayCustomers();
}

do {
    var choose = prompt(
        "1. Thêm khách hàng. \n" +
        "2. Hiển thị thông tin khách hàng. \n" +
        "3. Chỉnh sửa thông tin khách hàng. \n" +
        "4. Xóa khách hàng. \n" +
        "5. Thoát. \n");

    switch (choose) {
        case "1":
            addNewCustomer();
            break;
        case "2":
            displayCustomers();
            break;
        case "3":
            editCustomer();
            break;
        case "4":
            deleteCustomer();
            break;
    }
} while (choose != '5');