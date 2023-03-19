package ling.shuai.tu.pei.jiang.qi.战法;

import ling.android.操作.算术运算;
import ling.shuai.tu.pei.jiang.qi.框架.事件驱动器.战法类型;
import ling.shuai.tu.pei.jiang.qi.框架.战法基类;
import ling.shuai.tu.pei.jiang.qi.框架.武将基类;

public class 一骑当千 implements 战法基类 {
    protected final 武将基类 携带者;
    protected boolean 正在判定 = false;

    public 一骑当千(武将基类 携带者) {
        this.携带者 = 携带者;
    }

    @Override
    public void 准备回合开始() {

    }

    @Override
    public void 回合开始() {

    }

    @Override
    public void 行动阶段(武将基类 来源) {

    }

    @Override
    public void 发动普通攻击(武将基类 来源, 武将基类 目标) {

    }

    @Override
    public void 受到普通攻击(武将基类 来源, 武将基类 目标) {

    }

    @Override
    public boolean 战法准备生效(武将基类 目标, 战法基类 战法) {
        return false;
    }

    @Override
    public boolean 战法判定开始(武将基类 来源, 战法基类 战法) {
        if (来源 == 携带者 && 战法.getName().equals(this.getName())) {
            //判定自己能否生效
            if (正在判定) {
                //已经判定一回合，直接生效
                正在判定 = false;
                return true;
            } else {
                if (算术运算.取随机数(0, 100) < 30) {
                    //判定成功
                    print(来源.getName() + "的[" + 战法.getName() + "]开始准备");
                    正在判定 = true;
                }
                return false;
            }
        }
        //本战法对其他战法没有截断效果，故返回true
        return true;
    }

    @Override
    public boolean 打断判定(武将基类 来源, 战法基类 战法) {
        if (正在判定) {
            正在判定 = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void 回合结束(武将基类 目标) {

    }

    @Override
    public 战法类型 getType() {
        return 战法类型.主动;
    }

    @Override
    public String getName() {
        return "一器当千";
    }

    @Override
    public String getText() {
        return "1回合准备，对敌军全体发动一次猛烈攻击，伤害率280%";
    }
}
