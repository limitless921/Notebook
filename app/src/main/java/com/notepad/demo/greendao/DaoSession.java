package com.notepad.demo.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.notepad.demo.mode.PadApp;

import com.notepad.demo.greendao.PadAppDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig padAppDaoConfig;

    private final PadAppDao padAppDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        padAppDaoConfig = daoConfigMap.get(PadAppDao.class).clone();
        padAppDaoConfig.initIdentityScope(type);

        padAppDao = new PadAppDao(padAppDaoConfig, this);

        registerDao(PadApp.class, padAppDao);
    }
    
    public void clear() {
        padAppDaoConfig.clearIdentityScope();
    }

    public PadAppDao getPadAppDao() {
        return padAppDao;
    }

}
