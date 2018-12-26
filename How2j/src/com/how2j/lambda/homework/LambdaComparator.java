package com.how2j.lambda.homework;

import com.how2j.lambda.Hero;

import java.util.*;

public class LambdaComparator {

    public static void main(String[] args) {
        Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();

        for (int i = 0; i < 10; i++) {
            //通过随机值实例化hero的hp和damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //Collections.sort(heros);

        //引入Comparator，指定比较的算法
        Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                //按照hp进行排序
                if(h1.hp>=h2.hp)
                    return 1;  //正数表示h1比h2要大
                else
                    return -1;
            }
        };

        //1、 把外面的壳子去掉
        Comparator<Hero> c1 = (Hero h1, Hero h2) -> {
          return h1.hp >= h2.hp ? 1 : -1;
        };

        //2、把 return 和 {} 去掉
        Comparator<Hero> c2 = (Hero h1, Hero h2) -> h1.hp >= h2.hp ? 1 : -1;

        //3、去掉参数类型；

        System.out.println("按照血量排序后的集合：");
        Collections.sort(heros,(h1, h2) -> h1.hp >= h2.hp ? 1 : -1);
        System.out.println(heros);
    }
}
