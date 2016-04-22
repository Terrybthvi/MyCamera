package com.example.terry.mycamera.Crop;

/**
 * Created by bthvi on 2016/3/4.
 */

import android.graphics.Bitmap;

import java.io.Serializable;



/**
 * @Class:
 * @Description:
 * @author: leiqi(http://blog.csdn.net/u013132758)
 * @Date: 2016/3/15
 */
public class CropperImage implements Serializable {
    private Bitmap bitmap;
    private float x;
    private float y;
    private float width;
    private float height;

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
