package com.mercury.model.event;

import com.mercury.ssh.SshCommandDrop;

public class SshCommandMessage {
    private String message;
    private SshCommandDrop<Boolean> drop;

    public SshCommandMessage(String message, SshCommandDrop<Boolean> drop) {
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
