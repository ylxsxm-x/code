package com.mogu;

public class AirPlane {
    public static void main(String[] args) {
        //创建窗体
        GameFrame frame = new GameFrame();
        //创建面板
        GamePanel panel = new GamePanel(frame);
        //调用开始游戏的方法启动游戏
        panel.action();
        //将面板加入到窗体中
        frame.add(panel);
        //设置窗体可见
        frame.setVisible(true);
    }

}
