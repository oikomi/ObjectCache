package org.miaohong.objectcache.config;

import junit.framework.TestCase;

/**
 * Created by baidu on 15/11/19.
 */
public class ConfigTest extends TestCase {

    public void testconfigTest() {
        Config config = Config.getInstance();
        config.configTest();
    }
}
