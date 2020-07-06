let Apple = function () {
    this.setWeight = function (weight) {
        this.weight = weight;
    };
    this.getWeight = function () {
        return this.weight;
    };
    this.DecreaseApple = function () {
        if (this.weight > 0) {
            this.weight--;
        }
    };
    this.isEmpty = function () {
        if (this.weight === 0) {
            return true;
        } else return false;

    };
};