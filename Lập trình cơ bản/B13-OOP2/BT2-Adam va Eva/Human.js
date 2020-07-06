let Human = function () {
    this.setName = function (name) {
        this.name = name;
    };
    this.getName = function () {
        return this.name;
    };
    this.setGender = function (gender) {
        this.gender = gender;
    };
    this.getGender = function () {
        return this.gender;
    };
    this.setWeighthuman = function (weighthuman) {
        this.weighthuman = weighthuman;
    };
    this.getWeighthuman = function () {
        return this.weighthuman;
    };
    this.Speak = function () {
        console.log("hello");
    };
    this.eat = function () {
       return (this.weighthuman ++ );

    }
};