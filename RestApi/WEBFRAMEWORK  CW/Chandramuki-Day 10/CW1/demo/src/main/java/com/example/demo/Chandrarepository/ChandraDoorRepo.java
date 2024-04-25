package com.example.demo.Chandrarepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraDoor;
@Repository
public interface ChandraDoorRepo extends JpaRepository<ChandraDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<ChandraDoor> findByColor(String color);

    public List<ChandraDoor> findByDoorType(String doortype);
}
