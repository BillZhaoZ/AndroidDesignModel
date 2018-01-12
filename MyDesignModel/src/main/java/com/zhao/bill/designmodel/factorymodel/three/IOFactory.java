package com.zhao.bill.designmodel.factorymodel.three;

/**
 * 获取IO处理者
 * Created by Bill on 2018/1/12.
 */

public class IOFactory {

    public static <T extends IOHandler> T getIOHandler(Class<T> tClass) {
        IOHandler ioHandler = null;

        try {
            ioHandler = (IOHandler) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) ioHandler;
    }
}
