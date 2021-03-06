let fullName = prompt("Vui lòng nhập họ tên: ").trim().toLowerCase();
let fullNameArray = Array.from(fullName);

for (let i = 0; i < fullNameArray.length - 1; i++) {
    if (fullNameArray[i] === " " && fullNameArray[i + 1] === " ") {
        for (j = i + 1; j < fullNameArray.length - 1; j++) {
            fullNameArray[j] = fullNameArray[j + 1];
        }
        fullNameArray.pop();
    }
}

fullNameArray[0] = fullNameArray[0].toUpperCase();
for (let i = 1; i < fullNameArray.length; i++) {
    if (fullNameArray[i] === " ") {
        fullNameArray[i + 1] = fullNameArray[i + 1].toUpperCase();
    }
}

fullName = fullNameArray.join("");

let identify = "";
do {
    identify = prompt("Vui lòng nhập số CMND: ");
} while (isNaN(identify));

let dateOfBirth = "";
do {
    dateOfBirth = prompt("Vui lòng nhập ngày sinh: ");
    var dateOfBirthArray = dateOfBirth.split("/");
    console.log(dateOfBirthArray);
} while (dateOfBirthArray.length != 3 ||
    dateOfBirthArray[0].length != 2 ||
    dateOfBirthArray[1].length != 2 ||
    dateOfBirthArray[2].length != 4);

let email = "";
do {
    email = prompt("Vui lòng nhập email: ");
} while (email.indexOf("@") === 0 ||
    email.indexOf("@") === email.length - 1 ||
    email.indexOf("@") - 1 === email.indexOf(".") ||
    email.indexOf("@") + 1 === email.indexOf(".") ||
    email.indexOf(".") === email.length - 1);

let address = prompt("Vui lòng nhập địa chỉ: ");
let typeOfCustomer = prompt("Vui lòng nhập loại khách hàng (Diamond, Platinum, Gold, Silver, Member): ").toLowerCase();
let discount = parseFloat(prompt("Vui lòng nhập thẻ giảm giá (%): "));

let numberOfPeople = 0;
do {
    numberOfPeople = prompt("Vui lòng nhập số người: ");
} while (isNaN(numberOfPeople) || parseInt(numberOfPeople) < 0)

let rentDays = 0;
do {
    rentDays = parseInt(prompt("Vui lòng nhập số ngày thuê: "));
} while (isNaN(rentDays) || parseInt(rentDays) < 0)

let typeOfService = prompt("Vui lòng nhập loại dịch vụ (Villa, House, Room): ").toLowerCase();
let typeOfRoom = prompt("Vui lòng nhập loại phòng (VIP, Business, Normal): ").toLowerCase();


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