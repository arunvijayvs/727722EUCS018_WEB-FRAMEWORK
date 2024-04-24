package com.examly.springapp.Arunvijayservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Arunvijaymodel.ArunDoor;
import com.examly.springapp.Arunvijayrepository.ArunDoorRepo;

@Service
public class ArunDoorService {
    @Autowired
    private ArunDoorRepo doorRepo;

    public ArunDoor postData(ArunDoor door) {
        return doorRepo.save(door);
    }

    public List<ArunDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public ArunDoor updateDetail(int doorid, ArunDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<ArunDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<ArunDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public ArunDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}