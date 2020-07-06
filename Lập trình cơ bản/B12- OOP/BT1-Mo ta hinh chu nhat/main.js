let a = document.getElementById("width");
let b = document.getElementById("heigth");
let result = "";

function tinhtoan() {
    let hcn = new Hinhchunhat();
    hcn.setwidthHCN(a.value * 1);
    hcn.setheigthHCN(b.value * 1);
    result = "CV: " + hcn.chuvi() + "m" + "DT: " + hcn.dientich() + "m2";
    document.getElementById("result").innerText = result;
}

function getRandomHex() {
    return Math.floor(Math.random() * 255);
}

function getRandomColor() {
    let red = getRandomHex();
    let green = getRandomHex();
    let blue = getRandomHex();
    return "rgb(" + red + "," + blue + "," + green + ")";
}

function veHCN() {
    let ctx = document.getElementById("myCanvas").getContext("2d");
    let color = getRandomColor();
    ctx.fillStyle = color;
    ctx.fillRect(0, 0, a.value * 1, b.value * 1);
}