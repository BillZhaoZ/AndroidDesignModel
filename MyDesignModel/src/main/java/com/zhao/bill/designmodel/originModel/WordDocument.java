package com.zhao.bill.designmodel.originModel;

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

            document.mText = this.mText;

            // 1.浅拷贝
            // document.mImages = this.mImages;

            // 2.深拷贝  拷贝对象时，对于引用形的字段，也采用拷贝的形式  而不是单纯的引用
            document.mImages = (ArrayList<String>) this.mImages.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

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
