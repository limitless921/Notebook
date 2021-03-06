package com.notepad.demo.PresenterUtils;



public interface Presenter {

    /**
     * 数据库获取信息
     */
    void getPadData();

    /**
     * 数据库移除数据
     */
    void removeData(long id,int position);


    /**
     * 根据名称删除数据库
     * @param name
     */
    void removeData(String name);
}
