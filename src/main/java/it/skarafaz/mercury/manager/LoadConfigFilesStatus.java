

package it.skarafaz.mercury.manager;

//import it.skarafaz.mercury.R;

public enum LoadConfigFilesStatus {
    SUCCESS(1),
    ERROR(2),
    CANNOT_READ_EXT_STORAGE(3),
    CANNOT_CREATE_CONFIG_DIR(4),
    PERMISSION(5);

    private int message;

    LoadConfigFilesStatus(int message) {
        this.message = message;
    }

    public int message() {
        return message;
    }
}
