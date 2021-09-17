package cn.zjc.test.animal.applets;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/5
 */
public class User {
    /**
     * 用户出拳
     */
    String launch;

    /**
     * 用户出拳
     * @return
     */
    public String launch() {
        // todo 实现出拳策略
        return launch;
    }

    public void setSelect(String select) {
        this.launch = select;
    }
}
