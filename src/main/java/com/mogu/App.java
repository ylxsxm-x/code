package com.mogu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

//处理图片的工具类
public class App {
    //static可以公用所有对象都共用该方法，并且可以不依赖对象实现
    public static BufferedImage getImg(String path){
        //io流，输送数据的管道
        try {
            BufferedImage img = ImageIO.read(App.class.getResource(path));
            return img;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ImageIcon getImg2(String path){
        InputStream is;
        is = App.class.getClassLoader().getResourceAsStream(path);
        try {
            return new ImageIcon(ImageIO.read(is));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
