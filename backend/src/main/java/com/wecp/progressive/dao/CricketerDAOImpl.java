package com.wecp.progressive.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.entity.Cricketer;

public class CricketerDAOImpl implements CricketerDAO{

    public CricketerDAOImpl(){
        
    }

    @Override
    public int addCricketer(Cricketer cricketer) throws SQLException {
        // String sql = "insert into cricketer ( team_id , cricketer_name , age , nationality , experience , role , total_runs , total_wickets ) values ( ? , ? , ? , ? , ? , ? , ? , ? )";
        // try(PreparedStatement ps = con.prepareStatement(sql)){

        // }
        return -1;
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        return List.of();
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        
    }
    

}
