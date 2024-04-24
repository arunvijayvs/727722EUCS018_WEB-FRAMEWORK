package com.examly.springapp.Arunvijayrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Arunvijaymodel.ArunDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface ArunDoorRepo extends JpaRepository<ArunDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<ArunDoor> findByColor(String color);

    public List<ArunDoor> findByDoorType(String doortype);
}
