package com.example.exr_automappingdto.repo;

import com.example.exr_automappingdto.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends JpaRepository<Game, Long> {

    Game findByTitle(String title);

}
