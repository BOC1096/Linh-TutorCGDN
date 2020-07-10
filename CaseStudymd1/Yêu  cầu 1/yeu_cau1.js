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

let costOfService = 0;
if (typeOfService === "villa") {
    costOfService = 500;
} else if (typeOfService === "house") {
    costOfService = 300;
} else {
    costOfService = 100;
}

let totalBills = costOfService * rentDays * (1 - discount / 100);

document.writeln("Họ và tên: " + fullName + "<br>");
document.writeln("Số CMND: " + identify + "<br>");
document.writeln("Ngày sinh: " + dateOfBirth + "<br>");
document.writeln("Email: " + email + "<br>");
document.writeln("Địa chỉ: " + address + "<br>");
document.writeln("Loại khách hàng: " + typeOfCustomer + "<br>");
document.writeln("Giảm giá: " + discount + "%<br>");
document.writeln("Số người: " + numberOfPeople + "<br>");
document.writeln("Số ngày thuê: " + rentDays + "<br>");
document.writeln("Loại dịch vụ: " + typeOfService + "<br>");
document.writeln("Loại phòng: " + typeOfRoom + "<br>");
document.writeln("Tổng hóa đơn: " + totalBills + "$");