package com.design.mode.strategy;

import com.design.mode.strategy.duck.behavior.fly.impl.FlyRocketPowered;
import com.design.mode.strategy.duck.behavior.quack.impl.Squeak;
import com.design.mode.strategy.duck.definite.MallardDuck;
import com.design.mode.strategy.duck.definite.ModelDuck;

/**
 * @author DavidLiu
 * 策略模式
 * 定义了算法族，分别封装起来，让他们之间可以互相替换，
 * 此模式算法的变化独立于算法的客户
 * 理解：将行为抽象为接口。使用时传入不同的实现 来决定该行为的执行过程
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("==========MallardDuck==========");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.perFromQuack();
        mallardDuck.perFromFly();
        System.out.println("==========ModelDuck==========");
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.perFromQuack();
        modelDuck.perFromFly();
        System.out.println("==========modification ModelDuck==========");
        //加入火箭飞行器
        load("adding Rocket Powered", ".", 3);
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        load("adding quack", ".", 3);
        modelDuck.setQuackBehavior(new Squeak());
        load("modification success", "！", 0);
        modelDuck.perFromQuack();
        modelDuck.perFromFly();
    }

    /**
     * 加载
     *
     * @param msg  信息
     * @param wait 等待符
     * @param size 等待几秒
     */
    private static void load(String msg, String wait, int size) {
        System.out.print(msg + wait);
        for (int i = 0; i < size; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();
    }
}
