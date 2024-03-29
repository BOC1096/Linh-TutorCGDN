let fullName = "Doan Ngoc Linh";
let identify = "123321456654";
let dateOfBirth = "10/10/1996";
let email = "linh.doan@codegym.vn";
let address = "Da Nang"
let typeOfCustomer = "diamond";
let discount = 5;
let numberOfPeople = 3;
let rentDays = 5;
let typeOfService = "Villa";
let typeOfRoom = "VIP";

let costOfService = 0;
if (typeOfService === "villa") {
    costOfService = 500;
} else if (typeOfService === "house") {
    costOfService = 300;
} else {
    costOfService = 100;
}


do {

    let choose = parseInt(prompt(
        "1. Hiển thị thông tin khách hàng. \n" +
        "2. Chỉnh sửa thông tin khách hàng. \n" +
        "3. Số tiền phải trả. \n"));

    switch (choose) {
        case 1:
            alert("Thông tin khách hàng: \n" +
                "Họ tên: " + fullName + "\n" +
                "CMND: " + identify + "\n" +
                "Ngày sinh: " + dateOfBirth + "\n" +
                "Email: " + email + "\n" +
                "Địa chỉ: " + address + "\n" +
                "Loại khách hàng: " + typeOfCustomer + "\n" +
                "Giảm giá" + discount + "%\n" +
                "Số người: " + numberOfPeople + "\n" +
                "Số ngày thuê: " + rentDays + "\n" +
                "Loại dịch vụ: " + typeOfService + "\n" +
                "Loại phòng: " + typeOfRoom + "\n");
            break;
        case 2:
            let chooseItem = parseInt(prompt(
                "1. Họ tên: " + fullName + "\n" +
                "2. CMND: " + identify + "\n" +
                "3. Ngày sinh: " + dateOfBirth + "\n" +
                "4. Email: " + email + "\n" +
                "5. Địa chỉ: " + address + "\n" +
                "6. Loại khách hàng: " + typeOfCustomer + "\n" +
                "7. Giảm giá" + discount + "%\n" +
                "8. Số người: " + numberOfPeople + "\n" +
                "9. Số ngày thuê: " + rentDays + "\n" +
                "10. Loại dịch vụ: " + typeOfService + "\n" +
                "11. Loại phòng: " + typeOfRoom + "\n" +
                "Vui lòng chọn thông tin muốn sửa: "));

            switch (chooseItem) {
                case 1:
                    fullName = prompt("Vui lòng nhập họ tên: ");
                    break;
                case 2:
                    identify = prompt("Vui lòng nhập số CMND: ");
                    break;
                case 3:
                    dateOfBirth = prompt("Vui lòng nhập ngày sinh:");
                    break;
                case 4:
                    email = prompt("Vui lòng nhập email:  ");
                    break;
                case 5:
                    address = prompt("Vui lòng nhập địa chỉ: ");
                    break;
                case 6:
                    typeOfCustomer = prompt("Vui lòng chọn loại khách hàng (Diamond, Platinum, Gold, Silver, Member):").toLowerCase();
                    break;
                case 7:
                    discount = parseFloat(prompt("Nhập thẻ giảm giá (%):  "));
                    break;
                case 8:
                    numberOfPeople = parseInt(prompt("Vui lòng nhập số người thuê: "));
                    break;
                case 9:
                    rentDays = parseInt(prompt("Vui lòng nhập số ngày thuê: "));
                    break;
                case 10:
                    typeOfService = prompt("Vui lòng nhập loại dịch vụ (Villa, House, Room):  ").toLowerCase();
                    break;
                case 11:
                    typeOfRoom = prompt("Vui lòng nhập loại phòng (VIP, Business, Normal): ").toLowerCase();
                    break;
                default:
                    alert("Thất bại !!");
                    break;
            }
            break;
        case 3:
            let discountByAddress = 0;

            if (address === "Da Nang") {
                discountByAddress = 20;
            } else if (address === "Hue") {
                discountByAddress = 10;
            } else if (address === "Quang Nam") {
                discountByAddress = 5;
            }

            let discountByTime = 0;

            if (rentDays > 7) {
                discountByTime = 30;
            } else if (rentDays >= 5 && rentDays <= 7) {
                discountByTime = 20;
            } else if (rentDays >= 2 && rentDays <= 4) {
                discountByTime = 10;
            }

            let discountByCustomer = 0;
            if (typeOfCustomer === "diamond") {
                discountByCustomer = 15;
            } else if (typeOfService === "platinum") {
                discountByCustomer = 10;
            } else if (typeOfService === "gold") {
                discountByCustomer = 5;
            } else if (typeOfService === "silver") {
                discountByCustomer = 2;
            }

            let totalOfDiscount = discountByAddress + discountByTime + discountByCustomer;

            let costOfService = 0;
            if (typeOfService === "villa") {
                costOfService = 500;
            } else if (typeOfService === "house") {
                costOfService = 300;
            } else {
                costOfService = 100;
            }

            let totalBills = costOfService * rentDays - totalOfDiscount;
            alert("Tổng số tiền phải trả là: " + totalBills);

            break;
        default:
            alert("Vui lòng chọn 1, 2 hoặc 3.");
            break;
    }
} while (true);