package org.miaohong.objectcache.cache;

/**
 * Created by baidu on 15/11/19.
 */
public interface ObjectCache {
    public boolean add(Object object);
    public Object query(String key);

}
