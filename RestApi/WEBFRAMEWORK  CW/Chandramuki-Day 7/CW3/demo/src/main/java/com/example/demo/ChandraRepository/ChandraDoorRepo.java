package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraDoor;

import java.util.List;

@Repository
public interface ChandraDoorRepo extends JpaRepository<ChandraDoor,Integer>{

    List<ChandraDoor> findByDoorId(int doorId);
    List<ChandraDoor> findByAccessType(String accessType);
    
}
