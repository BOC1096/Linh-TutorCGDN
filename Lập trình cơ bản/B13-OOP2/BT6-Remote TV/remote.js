class Remote {
    constructor(code) {
        this.code = code;
    }

    changeChannel(tivi, channel) {
        tivi.changeChannel(channel);
    }

    increaseVolume(tivi, iVolume) {
        tivi.increaseVolume(iVolume);
    }

    decreaseVolume(tivi, iVolume) {
        tivi.decreaseVolume(iVolume);
    }

    turnOnOff(tivi) {
        tivi.status = tivi.status === "on" ? "off" : "on";
        document.writeln("Tivi is " + tivi.status + "<br>");
    }
}