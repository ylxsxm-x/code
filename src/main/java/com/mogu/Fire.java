package com.mogu;

public class Fire extends FlyObject{
    //子弹当前移动方向，0为左上角飞，1垂直飞，2右上角飞
    int dir;
    //构造方法，初始化子弹
    public Fire(int hx,int hy,int dir){
        //确定子弹的图片
        img = App.getImg("/img/fire.png");
        //确定图片的大小
        w = img.getWidth()/4;
        h = img.getHeight()/4;
        //确定子弹的位置
        x = hx;
        y = hy;
        this.dir=dir;

    }

    public void move() {
        //左上角飞
        if(dir==0){
            x -= 1;
            y -= 10;
        }
        //垂直上飞
        else if(dir == 1){
            y -= 10;
        }
        //右上角飞
        else if(dir == 2){
            x += 1;
            y -= 10;
        }
    }
}