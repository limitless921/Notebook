package com.notepad.demo.mode.modeInface;

import com.notepad.demo.PresenterUtils.PresenFrame;



public interface ModeInterface<T>{

    void addModeData(T object);
    void deleteModeData(long id);
    void deleteAllMode();
    void getAllDatasFromDataBase(PresenFrame.OnAppCallback onAppCallback);
}
