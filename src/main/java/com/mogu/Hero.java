package com.mogu;

//主机
public class Hero extends FlyObject{
    //主机血量
    int hp;

    public Hero(){
        img = App.getImg("/img/hero.png");
        //确认初始位置
        x = 200;
        y = 500;
        w = img.getWidth();
        h = img.getHeight();
        hp = 3;
    }

    public void moveToMouse(int mx,int my){
        x = mx;
        y = my;
    }
}
