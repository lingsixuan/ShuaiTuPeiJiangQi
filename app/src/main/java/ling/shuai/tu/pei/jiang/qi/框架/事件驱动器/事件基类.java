package ling.shuai.tu.pei.jiang.qi.框架.事件驱动器;

import ling.shuai.tu.pei.jiang.qi.框架.战法基类;
import ling.shuai.tu.pei.jiang.qi.框架.武将基类;

/**
 * 事件驱动器接受的所有事件都直接或间接继承自此类
 */
public interface 事件基类 {
    default void print(String message) {

    }

    void 准备回合开始();

    void 回合开始();

    void 行动阶段(武将基类 来源);

    void 发动普通攻击(武将基类 来源, 武将基类 目标);

    void 受到普通攻击(武将基类 来源, 武将基类 目标);

    boolean 战法准备生效(武将基类 目标, 战法基类 战法);

    void 回合结束(武将基类 目标);

}
