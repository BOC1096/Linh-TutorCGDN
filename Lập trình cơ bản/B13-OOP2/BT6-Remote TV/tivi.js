class Tivi {
    constructor(channel, volume, status) {
        this.channel = channel;
        this.volume = volume;
        this.status = status;
    }

    changeChannel(channel) {
        this.channel = channel;
        document.writeln("Current channel is " + this.channel + "<br>");
    }

    increaseVolume(iVolume) {
        this.volume += iVolume;
        document.writeln("Current volume is " + this.volume + "<br>");
    }

    decreaseVolume(iVolume) {
        this.volume -= iVolume;
        document.writeln("Current volume is " + this.volume + "<br>");
    }

}