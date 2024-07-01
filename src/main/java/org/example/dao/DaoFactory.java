package org.example.dao;

import org.example.bo.SuperBo;
import org.example.dao.custom.impl.CustomerDaoImpl;
import org.example.util.DaoType;

public class DaoFactory {

    private static DaoFactory instance;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return instance!=null?instance:(instance=new DaoFactory());
    }
    public <T extends SuperDao>T getDao(DaoType type){
        switch (type){
            case CUSTOMER:return (T)new CustomerDaoImpl();
        }
        return null;
    }
}
