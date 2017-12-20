package com.zhao.bill.designmodel.model;

import java.util.ArrayList;

/**
 * 文档类型
 * WordDocument扮演的是concreatePrototype角色（具体的原型类）
 * 而cloneable是代表的prototype角色(抽象类或者接口，声明具备clone能力)
 * Created by Bill on 2017/12/20.
 */

public class WordDocument implements Cloneable {

    private String mText;
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("==========  WordDocument 构造函数  ==========");
    }

    @Override
    protected WordDocument clone() {
        WordDocument document = null;

        try {
            document = (WordDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        document.mText = this.mText;
        document.mImages = this.mImages;

        return document;
    }

    public void showDocu() {
        System.out.println("==========  WordDocument start  ==========");
        System.out.println("text: " + mText);
        System.out.println("image list: ");

        for (String image : mImages) {
            System.out.println("image name: " + image);
        }

        System.out.println("==========  WordDocument end  ==========");
    }


    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(String images) {
        this.mImages.add(images);
    }
}
