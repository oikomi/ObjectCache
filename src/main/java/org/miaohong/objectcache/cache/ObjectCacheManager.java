package org.miaohong.objectcache.cache;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by baidu on 15/11/19.
 */
public class ObjectCacheManager implements ObjectCache{
    private ConcurrentHashMap<String, Object> objectCacheMap;

    private ObjectCacheManager() {
        objectCacheMap = new ConcurrentHashMap<String, Object>();

    }

    private static class SingletonHolder {
        private static final ObjectCacheManager INSTANCE = new ObjectCacheManager();
    }

    public static final ObjectCacheManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public boolean add(Object object) {
        return false;
    }

    public Object query(String key) {
        return null;
    }

}
