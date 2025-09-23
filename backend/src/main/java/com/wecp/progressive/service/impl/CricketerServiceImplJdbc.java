package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplJdbc  implements CricketerService{

    private CricketerDAO cricketerDAO;

    public CricketerServiceImplJdbc() {
    }

    public CricketerServiceImplJdbc(CricketerDAO cricketerDAO) {
        this.cricketerDAO = cricketerDAO;
    }


    @Override
    public Integer addCricketer(Cricketer cricketer) {
       
        return -1;
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        
        CricketerService.super.deleteCricketer(cricketerId);
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        
        return List.of();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
      
        return List.of();
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
       
        return CricketerService.super.getCricketerById(cricketerId);
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        CricketerService.super.updateCricketer(cricketer);
    }

    

}