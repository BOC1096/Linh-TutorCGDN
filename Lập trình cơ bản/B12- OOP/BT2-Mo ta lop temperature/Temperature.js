let Temperature = function() {
    this.setdoC = function(doC) {
        this.doC = doC;
    };
    this.getdoC = function(doC) {
        return this.doC;
    };
    this.doF = function() {
        return this.doC * 1.8 + 32;
    };
    this.doK = function() {
        return this.doC + 273.15;
    };
};