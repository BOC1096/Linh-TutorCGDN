let gameCreep = function() {
    this.beginCreep = function(crepy, crepx) {
        this.creepY = crepy;
        this.creepX = crepx;
        this.img1 = new Image();
        this.img1.src = "https://www.vippng.com/png/detail/50-503550_police-car-top-blue-png-image-police-car.png";
        this.drawcreep = document.getElementById("carGame").getContext("2d");

        this.drawcreep.drawImage(this.img1, this.creepX, this.creepY, 140, 90);
    }
}
let gameCar = function() {
    this.speed = 7;
    this.paintBegin = function() {
        this.paintCar(500, 80);
    }
    this.paintCar = function(carleft, carright) {
        this.img = new Image();
        this.carX = carleft;
        this.carY = carright;
        this.img.src = "https://pngimage.net/wp-content/uploads/2018/05/car-top-view-png-2.png";
        this.drawcar = document.getElementById("carGame").getContext("2d");
        this.drawcar.drawImage(this.img, this.carX, this.carY, 100, 80);
    }
    this.moveCarTo = function() {

        this.carY = this.carY - this.speed;
        this.drawcar.clearRect(this.carX - 10, this.carY, 120, 80);
        this.paintCar(this.carX, this.carY);
    }
    this.moveCarBack = function() {
        this.carY = this.carY + this.speed;
        this.drawcar.clearRect(this.carX - 10, this.carY, 120, 80);
        this.paintCar(this.carX, this.carY);

    }
    this.moveCarLeft = function() {
        this.carX = this.carX - this.speed;
        this.drawcar.clearRect(this.carX - 10, this.carY, 120, 80);
        this.paintCar(this.carX, this.carY);
    }
    this.moveCarRight = function() {
        this.carX = this.carX + this.speed;
        this.drawcar.clearRect(this.carX - 10, this.carY, 120, 80);
        this.paintCar(this.carX, this.carY);
    }
};
let gamestart = new gameCar();
gamestart.paintBegin();
docReady();
let crepy;
let diem = 0;
document.getElementById("diem").innerHTML = diem;
switch (Math.floor(Math.random() * 2) + 1) {
    case 1:
        crepy = 10;
        break;
    case 2:
        crepy = 120;
        break;
};
let crepx = -150;
let Creep = new gameCreep();
setInterval(function() {
    crepx++;
    if (crepx > 720) {
        diem++;
        document.getElementById("diem").innerHTML = diem;
        crepx = -150;
        switch (Math.floor(Math.random() * 2) + 1) {
            case 1:
                crepy = 10;
                break;
            case 2:
                crepy = 120;
                break;
        }
        Creep = new gameCreep();
    } else if (crepx <= 720) {
        Creep.beginCreep(crepy, crepx);
        if (gamestart.carX < 5 || gamestart.carX > 610 || gamestart.carY < 0 || gamestart.carY > 170) {
            alert("ban da thua cuoc");
            crepx = -150;
            location.reload();
        }
        if (crepy === 10) {
            if (((crepx < gamestart.carX && gamestart.carX < crepx + 120) || (crepx < gamestart.carX + 100 && gamestart.carX + 100 < crepx + 120)) && gamestart.carY < 87) {
                alert("ban da thua cuoc");
                crepx = -150;
                location.reload();
            }
        } else if (crepy === 120) {
            if (((crepx < gamestart.carX && gamestart.carX < crepx + 120) || (crepx < gamestart.carX + 100 && gamestart.carX + 100 < crepx + 120)) && gamestart.carY > 52) {
                alert("ban da thua cuoc");
                crepx = -150;
                location.reload();
            }
        }
    }
}, 1);

function moveSelection(evt) {
    switch (evt.keyCode) {
        case 37:
            gamestart.moveCarLeft();
            break;
        case 39:
            gamestart.moveCarRight();
            break;
        case 38:
            gamestart.moveCarTo();
            break;
        case 40:
            gamestart.moveCarBack();
            break;
    }
}

function docReady() {
    window.addEventListener('keydown', moveSelection);
}