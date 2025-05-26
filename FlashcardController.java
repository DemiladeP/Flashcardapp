package com.flashcard.flashcard;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/flashcards")
public class FlashcardController {

    private final FlashcardRepository repo;

    public FlashcardController(FlashcardRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Flashcard> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Flashcard create(@RequestBody Flashcard card) {
        return repo.save(card);
    }
}
