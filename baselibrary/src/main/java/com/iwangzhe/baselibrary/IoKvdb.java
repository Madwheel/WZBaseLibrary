package com.iwangzhe.baselibrary;

import com.snappydb.SnappydbException;

/**
 * author : 亚辉
 * e-mail : 2372680617@qq.com
 * date   : 2020/8/1116:14
 * desc   :
 */
public interface IoKvdb {
    void put(String key, Object object) throws SnappydbException;

    <T> T getObject(String key, Class<T> className) throws SnappydbException;
}
