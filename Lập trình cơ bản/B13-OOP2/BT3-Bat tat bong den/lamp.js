class SwitchButton {
    status;
    lamp;

    connectToLamp(electricLamp) {
        this.lamp = electricLamp;
    }

    switchOff() {
        this.status = "off";
        this.lamp.turnOff();
    }

    switchOn() {
        this.status = "on";
        this.lamp.turnOn();
    }
}

class ElectricLamp {
    status;

    turnOff() {
        this.status = "off";
        document.writeln("Electric lamp is off. <br>");
    }

    turnOn() {
        this.status = "on";
        document.writeln("Electric lamp is on. <br>");
    }
}

let switchButton = new SwitchButton();
let electricLamp = new ElectricLamp();
switchButton.connectToLamp(electricLamp);

switchButton.switchOn();
switchButton.switchOff();
switchButton.switchOn();
switchButton.switchOff();
switchButton.switchOn();
switchButton.switchOff();
switchButton.switchOn();
switchButton.switchOff();
switchButton.switchOn();
switchButton.switchOff();