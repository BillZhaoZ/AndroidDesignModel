package com.zhao.bill.designmodel.factorymodel.one;

/**
 * 具体工厂类
 * <p>
 * 也可以给某个产品设置自己的工厂类  各司其职
 * Created by Bill on 2017/12/23.
 */
public class ConcreateFactory extends Factory {

    /**
     * 静态方法
     *
     * @return
     */
    @Override
    public Product createProduct() {
        //  return new ConcreteProductA();
        return new ConcreteProductB();
    }

    /**
     * 需要什么对象  传入那个对象的类型即可
     *
     * @param tClass
     * @param <T>
     * @return
     */
    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {

        Product p = null;

        try {
            p = (Product) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) p;
    }
}
