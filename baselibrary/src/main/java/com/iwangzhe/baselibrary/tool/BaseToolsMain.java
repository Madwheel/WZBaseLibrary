package com.iwangzhe.baselibrary.tool;

import com.iwangzhe.baselibrary.base.ModMain;

/**
 * author : 亚辉
 * e-mail : 2372680617@qq.com
 * date   : 2020/8/1116:25
 * desc   :
 */
public class BaseToolsMain extends ModMain {
    private final BaseToolsControlApp controlApp;

    @Override
    public String getModName() {
        return "BaseToolsMain";
    }

    private static BaseToolsMain mBaseToolsMain = null;

    public static BaseToolsMain getInstance() {
        synchronized (BaseToolsMain.class) {
            if (mBaseToolsMain == null) {
                mBaseToolsMain = new BaseToolsMain();
            }
        }
        return mBaseToolsMain;
    }

    public BaseToolsMain() {
        controlApp = BaseToolsControlApp.getInstance(this);
    }

    @Override
    public void born() {
        super.born();
    }

    public BaseToolsControlApp getControl() {
        return controlApp;
    }
}
