package com.example.javapractice;

public class RectangleFun {
    int length=0;
    int width=0;
    public RectangleFun(int l,int w){
        this.length=l;
        this.width=w;
    }
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }
    int getArea(){
        return 2*(length+width);
    }
}
