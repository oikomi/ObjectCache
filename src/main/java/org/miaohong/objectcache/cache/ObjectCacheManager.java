package org.miaohong.objectcache.cache;

/**
 * Created by baidu on 15/11/19.
 */
public class ObjectCacheManager {

    private ObjectCacheManager() {
    }

    private static class SingletonHolder {
        private static final ObjectCacheManager INSTANCE = new ObjectCacheManager();
    }

    public static final ObjectCacheManager getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
