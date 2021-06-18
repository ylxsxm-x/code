package com.mogu;

import java.util.Random;

public class Ep extends FlyObject{
    int sp;
    //设置敌机类型
    int type;

    public Ep(){
        Random random = new Random();
        int index = random.nextInt(15)+1;
        type = index;
        String path = "/img/ep" + (index<10?"0":"")+index+".png";
        img = App.getImg(path);

        //确定敌机图片
        w = img.getWidth();
        x = random.nextInt(512-w);
        y = 0;

        //设置速度
        sp = 17-index;


    }

    public void move() {
        if(type==5){
            x -= 5;
            y += sp;
        }
        else if(type==6){
            x += 5;
            y += sp;
        }
        else {
            y+=sp;
        }
    }

    public boolean shootBy(Fire f) {
        Boolean hit = x <= f.x+f.w &&x>f.x-w&&y<=f.y+f.h&&y>f.y-h;
        return hit;
    }

    public boolean shootBy(Hero f) {
        Boolean hit = x <= f.x+f.w &&x>f.x-w&&y<=f.y+f.h&&y>f.y-h;
        return hit;
    }
}
