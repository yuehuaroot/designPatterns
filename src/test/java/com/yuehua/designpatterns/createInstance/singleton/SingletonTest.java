package com.yuehua.designpatterns.createInstance.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2){
            System.out.println("instance1 与 instance2是相同的实例");
        }else {
            System.out.println("instance1 与 instance2是不同的实例");
        }
        System.out.println("End.");
    }
}
