package de.evoila.birdbackend.controller;

import de.evoila.birdbackend.model.Bird;
import de.evoila.birdbackend.repositories.BirdRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/birds")
public class BirdController {

    private final BirdRepository repository;
    private final Logger log = LoggerFactory.getLogger(BirdController.class);

    @Autowired
    public BirdController(BirdRepository repository) {
        this.repository = repository;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        log.info("Delete Bird with Id: " + id);
        repository.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public Bird get(@PathVariable Long id) {
        log.info("Get Bird with Id: " + id);
        return repository.getOne(id);
    }

    @GetMapping
    public Iterable<Bird> birds() {
        log.info("Get all birds");
        return repository.findAll();
    }

    @PutMapping
    public Bird put(@RequestBody Bird bird) {
        log.info("Saving " + bird);
        return repository.save(bird);
    }

    @PostMapping
    public Bird post(@RequestBody Bird bird) {


        log.info("Updating " + bird);
        return repository.save(bird);
    }
}
