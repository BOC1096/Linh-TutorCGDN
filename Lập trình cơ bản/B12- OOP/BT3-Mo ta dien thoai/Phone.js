class Mobile {
    constructor(batteryPercent, messageDraft, messageInbox, messageSent, status) {
        this.batteryPercent = batteryPercent;
        this.messageDraft = messageDraft;
        this.messageInbox = messageInbox;
        this.messageSent = messageSent;
        this.status = status;
    }

    showStatus() {
        if (this.status === "on") {
            document.writeln("Mobile is on. <br>");
        } else {
            document.writeln("Mobile is off. <br>");
        }
        this.batteryPercent--;
    }

    turnOnOff() {
        this.status = this.status === "on" ? "off" : "on";
        this.batteryPercent--;
    }

    charge() {
        document.writeln("Charge...<br>");
        this.batteryPercent = 100;
    }

    writeMessage(messageText) {
        if (this.status === "on") {
            this.messageDraft.push(messageText);
            this.batteryPercent--;
        } else {
            document.writeln("Mobile is off. You can't write message.<br>");
        }

    }

    receiveMessage(messageText) {
        this.messageInbox.push(messageText);
        this.batteryPercent--;
    }

    sendMessage(otherMobile) {
        if (this.status === "on") {
            let messageText = this.messageDraft.pop();
            this.messageSent.push(messageText);
            otherMobile.receiveMessage(messageText);
            this.batteryPercent--;
        } else {
            document.writeln("Mobile is off. You can't send message.<br>");
        }
    }

    showMessageInbox() {
        if (this.status === "on") {
            document.writeln("Inbox: " + this.messageInbox + "<br>");
            this.batteryPercent--;
        } else {
            document.writeln("Mobile is off. You can't see inbox message.<br>");
        }
    }

    showMessageSent() {
        if (this.status === "on") {
            document.writeln("Sent message: " + this.messageSent + "<br>");
            this.batteryPercent--;
        } else {
            document.writeln("Mobile is off. You can't see sent message.<br>");
        }
    }

}

nokia = new Mobile(50, [], [], [], "on");
iphone = new Mobile(80, [], [], [], "on");

nokia.writeMessage("Hello iphone!");
nokia.sendMessage(iphone);
iphone.showMessageInbox();