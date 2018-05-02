package it.skarafaz.mercury.fragment;
/*
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.*;
import it.skarafaz.mercury.R;
*/
import it.skarafaz.mercury.adapter.LogListAdapter;
import it.skarafaz.mercury.adapter.*;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogFragment  {
    private static final String LOG_DIR = "log";
    private static final String LOG_FILE = "mercury.log";
    private static final String OLD_EXT = "old";
    private static final Logger logger = LoggerFactory.getLogger(LogFragment.class);



    private void reload() {
        new LogListAdapter( readLog());
    }

    private List<String> readLog() {
        List<String> lines = new ArrayList<>();
        try {
            lines = FileUtils.readLines(getLogFile(), "UTF-8");
        } catch (IOException e) {
            logger.error(e.getMessage().replace("\n", " "));
        }
        return lines;
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void clearLog() {
        try {
            FileUtils.write(getLogFile(), "");
        } catch (IOException e) {
            logger.error(e.getMessage().replace("\n", " "));
        }
        for (File file : FileUtils.listFiles(getLogDir(), new String[] { OLD_EXT }, false)) {
            file.delete();
        }
        reload();
    }

    private File getLogFile() {
        return new File(getLogDir(), LOG_FILE);
    }

    private File getLogDir() {
        return new File(LOG_DIR);
    }
}
