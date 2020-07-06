tivi = new Tivi("1", 20, "off");
remote = new Remote("Samsung");
remote.turnOnOff(tivi);
tivi.changeChannel("7");
remote.changeChannel(tivi, "3");
remote.increaseVolume(tivi, 2);
remote.turnOnOff(tivi);