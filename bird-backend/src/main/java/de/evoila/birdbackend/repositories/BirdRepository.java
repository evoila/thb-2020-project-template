package de.evoila.birdbackend.repositories;

import de.evoila.birdbackend.model.Bird;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdRepository extends JpaRepository<Bird, Long> {
}
