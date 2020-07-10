let arrNameCustomers = [];

do {
    let choose = prompt(
        "1. Thêm khahsch hàng. \n" +
        "2. Xóa khách hàng. \n" +
        "Vui lòng chọn 1 hoặc 2.");

    switch (choose) {
        case "1":
            let n = prompt("Vui lòng nhập số khách hàng muốn thêm: ");

            for (let i = 0; i < n; i++) {
                let name = prompt("Vui lòng nhập tên khách hàng " + (i + 1));
                arrNameCustomers.push(name);
            }
            break;

        case "2":
            let name = prompt("Vui lòng nhập tên khách hàng muốn xóa: ");
            let iCus = arrNameCustomers.indexOf(name);

            if (iCus >= 0) {
                for (let i = iCus; i < arrNameCustomers.length - 1; i++) {
                    arrNameCustomers[i] = arrNameCustomers[i + 1];
                }

                arrNameCustomers.pop();
                arrNameCustomers.sort();

                alert("Danh sách khách hàng: " + arrNameCustomers);
            } else {
                alert("Khách hàng không tồn tại.")
            }
            break;
    }
} while (true);