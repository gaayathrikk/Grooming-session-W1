package designpatterns.command;

interface Command {
    public void execute();
}

class SmartSystem {
    public void on() {
        System.out.println("SmartSystem is on");
    }

    public void off() {
        System.out.println("SmartSystem is off");
    }
}

class SmartSystemOnCommand implements Command {
    SmartSystem smartSystem;

    public SmartSystemOnCommand(SmartSystem smartSystem) {
        this.smartSystem = smartSystem;
    }

    public void execute() {
        smartSystem.on();
    }
}

class SmartSystemOffCommand implements Command {
    SmartSystem smartSystem;

    public SmartSystemOffCommand(SmartSystem smartSystem) {
        this.smartSystem = smartSystem;
    }

    public void execute() {
        smartSystem.off();
    }
}


class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        SmartSystem smartSystem = new SmartSystem();

        remote.setCommand(new SmartSystemOnCommand(smartSystem));
        remote.buttonWasPressed();
        remote.setCommand(new SmartSystemOffCommand(smartSystem));
        remote.buttonWasPressed();
    }
}
