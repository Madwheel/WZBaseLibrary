package com.iwangzhe.baselibrary;

import com.iwangzhe.baselibrary.base.IResCallback;
import com.iwangzhe.baselibrary.base.JBase;

import java.util.Map;

/**
 * author : 亚辉
 * e-mail : 2372680617@qq.com
 * date   : 2020/8/1113:49
 * desc   :
 */
public interface NetHttp {
    <T extends JBase> void reqGetResByWzApi(Class<T> jBase, String url, Map<String, String> params, IResCallback callback);
}
