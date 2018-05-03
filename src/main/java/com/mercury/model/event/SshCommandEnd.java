package com.mercury.model.event;

import com.mercury.ssh.SshCommandStatus;

public class SshCommandEnd {
    private SshCommandStatus status;

    public SshCommandEnd(SshCommandStatus status) {
        this.status = status;
    }

    public SshCommandStatus getStatus() {
        return status;
    }
}
