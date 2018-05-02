package it.skarafaz.mercury.ssh;

//import it.skarafaz.mercury.R;

public enum SshCommandStatus {
    CONNECTION_INIT_ERROR(1),
    CONNECTION_FAILED(2),
    EXECUTION_FAILED(3),
    COMMAND_SENT(4);

    private int message;

    SshCommandStatus(int message) {
        this.message = message;
    }

    public int message() {
        return message;
    }
}
