package com.example.demo.ChandraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraPlayer;
import com.example.demo.ChandraRepository.ChandraPlayerRepo;

import java.util.List;

@Service
public class ChandraPlayerService {

    @Autowired
    private ChandraPlayerRepo playerRepo;

    public List<ChandraPlayer> getAllPlayers() {
        return playerRepo.findAll();
    }

    public ChandraPlayer getPlayerById(int id) {
        return playerRepo.findById(id).orElse(null);
    }

    public ChandraPlayer addPlayer(ChandraPlayer player) {
        return playerRepo.save(player);
    }
}
