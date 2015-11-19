package org.miaohong.objectcache.config;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;


import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by baidu on 15/11/19.
 */
public class Config {
    private static ClassLoader classLoader = Config.class.getClassLoader();
    private static final String configFilePath = "config/objectcache.conf.json";
    private static Config _instance;

    private int listenPort;

    public int getListenPort() {
        return listenPort;
    }

    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }

    public static Config getInstance() {
        return _instance;
    }

    @Override
    public String toString() {
        return "Config | Port : " + getListenPort();
    }

    static {
        FileInputStream configIn = null;
        try {
            configIn = new FileInputStream(classLoader.getResource(configFilePath).getFile());
            _instance = JSON.parseObject(IOUtils.toString(configIn), Config.class);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(configIn);
        }
    }

    public void configTest() {
        Config config = Config.getInstance();
        System.out.println(config);
    }

}
