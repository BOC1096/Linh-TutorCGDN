let Hinhchunhat = function() {
    this.setwidthHCN = function(widthHCN) {
        this.widthHCN = widthHCN;
    };
    this.getwidthHCN = function() {
        return this.widthHCN;
    };
    this.setheigthHCN = function(heigthHCN) {
        this.heigthHCN = heigthHCN;
    };
    this.getheigthHCN = function() {
        return this.heigthHCN;
    };
    this.chuvi = function() {
        return (this.widthHCN + this.heigthHCN) * 2;
    };
    this.dientich = function() {
        return (this.widthHCN * this.heigthHCN);
    };
};