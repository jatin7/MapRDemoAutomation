package it.skarafaz.mercury.model.event;

import it.skarafaz.mercury.ssh.SshCommandDrop;

public class SshCommandYesNo {
    private String message;
    private SshCommandDrop<Boolean> drop;

    public SshCommandYesNo(String message, SshCommandDrop<Boolean> drop) {
        this.message = message;
        this.drop = drop;
    }

    public String getMessage() {
        return message;
    }

    public SshCommandDrop<Boolean> getDrop() {
        return drop;
    }
}
