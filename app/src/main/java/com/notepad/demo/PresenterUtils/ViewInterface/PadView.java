package com.notepad.demo.PresenterUtils.ViewInterface;

import java.util.List;



public interface PadView<T>{
    /**
     * 数据库获取数据后刷新主页信息
     * @param list
     */
    void setGridView(List<T>list);

    /**
     * 编辑完数据后显示界面信息
     * @param
     */
    void NoteErrorView(String error);


    void deleteGridView(int position);
}
