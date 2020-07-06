class Cat {
    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get weight() {
        return this._weight;
    }

    set weight(value) {
        this._weight = value;
    }

    get speed() {
        return this._speed;
    }

    set speed(value) {
        this._speed = value;
    }
    constructor(name, weight, speed) {
        this._name = name;
        this._weight = weight;
        this._speed = speed;
    }

    growl() {
        document.writeln(name + " growl: Meo meo");
    }

    catch (rat) {
        if (this._speed > rat._speed) {
            document.writeln(this._name + " caught " + rat._name + "<br>");
            this.eat(rat);
        } else {
            document.writeln(this._name + " didn't catch " + rat._name + "<br>");
        }
    }

    eat(rat) {
        this._weight += rat._weight;
        document.writeln("Weight of " + this._name + " is " + this._weight + " kg." + "<br>");
    }
}