
package it.skarafaz.mercury.manager;
/*
import android.Manifest;
import android.os.Environment;
*/

import it.skarafaz.mercury.jackson.ServerMapper;
import it.skarafaz.mercury.jackson.ValidationException;
import it.skarafaz.mercury.model.config.Server;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConfigManager {
    private static final Logger logger = LoggerFactory.getLogger(ConfigManager.class);
    private static String CONFIG_DIR = ".";
    private static final String JSON_EXT = "json";
    private static final String CONF_FILE="serverinfo.properites";
    private static ConfigManager instance;
    private File configDir;
    private ServerMapper mapper;
    private List<Server> servers;

    private ConfigManager() {
        CONFIG_DIR = System.getProperty("user.dir");
        System.out.println("Current Working Directory:" + CONFIG_DIR);

        String configDir = CONFIG_DIR +  "/" + CONF_FILE;
        System.out.println("masterPropertyFile:" + configDir);

        mapper = new ServerMapper();
        servers = new ArrayList<>();
    }

    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public File getConfigDir() {
        return configDir;
    }

    public List<Server> getServers() {
        return servers;
    }

    public boolean loadConfigFiles() {
        servers.clear();

        for (File file : listConfigFiles()) {
            try {
                servers.add(mapper.readValue(file));
            } catch (IOException | ValidationException e) {
               // status = LoadConfigFilesStatus.ERROR;
                logger.error(e.getMessage().replace("\n", " "));
            }
        }
        Collections.sort(servers);
        return true;
    }


    private Collection<File> listConfigFiles() {
        return FileUtils.listFiles(configDir, new String[] { JSON_EXT, JSON_EXT.toUpperCase() }, false);
    }
}
