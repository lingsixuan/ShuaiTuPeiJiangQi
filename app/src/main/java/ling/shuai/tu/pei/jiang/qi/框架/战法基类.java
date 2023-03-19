package ling.shuai.tu.pei.jiang.qi.框架;

import ling.shuai.tu.pei.jiang.qi.框架.事件驱动器.事件基类;
import ling.shuai.tu.pei.jiang.qi.框架.事件驱动器.战法类型;

public interface 战法基类 extends 事件基类 {
    战法类型 getType();

    String getName();

    String getText();

    /**
     * 战法开始判定时调用
     *
     * @param 战法 正在判定的战法
     * @return 是否能释放
     */
    boolean 战法判定开始(武将基类 来源, 战法基类 战法);

    boolean 打断判定(武将基类 来源, 战法基类 战法);
}
