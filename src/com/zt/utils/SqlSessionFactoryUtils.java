package com.zt.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sf;
    public static SqlSessionFactory getSqlSessionFactory(){
    	try{
    		if(sf==null){
        		Reader in=Resources.getResourceAsReader
        				            ("mybatisMapper.xml");
        		sf=new SqlSessionFactoryBuilder().build(in);
    		}
    	}catch(Exception e){e.printStackTrace();
    	}   	
    	return sf;
    }
    public static SqlSession getSqlSession(){
    	getSqlSessionFactory();
    	return sf.openSession();
    }
}
