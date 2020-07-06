function Hero(image, top, left, size, speed) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.speed = speed;

    this.getHeroElement = function() {
        return '<img width="' + this.size + '"' +
            ' height="' + this.size + '"' +
            ' src="' + this.image + '"' +
            ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
    };

    this.moveRight = function() {
        this.left += speed;
        console.log('right: ' + this.left);
    }

    this.moveDown = function() {
        this.top += speed;
        console.log('down: ' + this.top);
    }

    this.moveLeft = function() {
        this.left -= speed;
        console.log('left: ' + this.left);
    }

    this.moveUp = function() {
        this.top -= speed;
        console.log('top: ' + this.top);
    }
}

var hero = new Hero('pikachu.png', 20, 30, 256, 20);

function start() {

    if (hero.top === 20 && hero.left < window.innerWidth - hero.size) {
        hero.moveRight();
    }
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 50);
}

function startDown() {
    if (hero.left >= window.innerWidth - hero.size) {
        hero.moveDown();
    }
    setTimeout(startDown, 50);
}

function startLeft() {
    if (hero.top >= window.innerHeight - hero.size) {
        hero.moveLeft();
    }
    setTimeout(startLeft, 50);
}

function startUp() {
    if (hero.left <= 30) {
        hero.moveUp();
    }
    setTimeout(startUp, 50);
}

start();
startDown();
startLeft();
startUp();