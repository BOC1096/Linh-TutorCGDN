let apple = new Apple();
apple.setWeight(10);

let adam = new Human();
adam.setName("Adam");
adam.setGender("Male");
adam.setWeighthuman(65);

let eva = new Human();
eva.setName("Eva");
eva.setGender("Female");
eva.setWeighthuman(50);

function eatA() {
    while (!apple.isEmpty()) {
        alert("so tao la: " + apple.weight);
        apple.DecreaseApple();
        adam.eat();
        alert("adam da an tao");
        alert("can nang adam: " + adam.weighthuman);
        apple.DecreaseApple();
        eva.eat();
        alert("eva da an tao");
        alert("can nang eva: " + eva.weighthuman);
    }
    alert("tao da het");
}
eatA();