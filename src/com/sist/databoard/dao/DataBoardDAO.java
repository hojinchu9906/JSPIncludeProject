package com.sist.databoard.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sist on 2016-03-23.
 */
public class DataBoardDAO {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private static DataBoardDAO dataBoardDAO;

    /*
           풀에 미리 Connection 객체를 생성한후에 사용,
           Connection 객체가 일정한 수를 가지고 있음.

           미리 연결후 사용 ==> 연결에 소요되는 시간을 줄일 수 있음.
           미리 생성된 객체 주소를 얻어옴.==> 객체가 저장되어 있는 장소 ==> JNDI

           주소 => lookup => RMI set("변수",객체)
           ===> lookup("jdbc/oracle")
           DBCP ==> 관리(Connection)
     */

    public void getConnection(){
        try{
            Context initContext=new InitialContext();
            //JNDI초기화 탐색기 (탐색기 연다.)

            Context context=(Context)initContext.lookup("java://comp/env");
            DataSource dataSource=(DataSource)context.lookup("jdbc/oracle");

            connection=dataSource.getConnection();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void disConnection(){
        try{
            if(preparedStatement!=null) preparedStatement.close();
            if(connection!=null) connection.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    //싱글톤 생성자
    public static DataBoardDAO newInstance(){
        if(dataBoardDAO==null)
            dataBoardDAO=new DataBoardDAO();
        return dataBoardDAO;
    }

    //모든 리스트 데이터 보기
    public List<DataBoardDTO> boardAllData(int page){
        List<DataBoardDTO> list=new ArrayList<>();

        try{
                getConnection();

                int rowSize=10;
                int start=(page*rowSize)-(rowSize-1);
                int end=(page*rowSize);

                //쿼리문 작성차례임.
                String sql="";


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            disConnection();
        }




        return list;
    }
}

























































