
package com.mercury.manager;

//import it.skarafaz.mercury.R;


public enum ExportPublicKeyStatus {

    SUCCESS(1),
    ERROR(2),
    CANNOT_WRITE_EXT_STORAGE(3),
    PERMISSION(4);

    private int message;

    ExportPublicKeyStatus(int message) {
        this.message = message;
    }

    public int message() {
        return message;
    }
}
