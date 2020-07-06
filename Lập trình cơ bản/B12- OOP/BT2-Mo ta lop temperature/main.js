let result = "";
let temp = new Temperature();
temp.setdoC(25);
result = "do K: " + temp.doK() + " do F: " + temp.doF();
document.getElementById("result").innerText = result;