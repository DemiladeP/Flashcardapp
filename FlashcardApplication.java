package com.flashcard.flashcard;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlashcardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashcardApplication.class, args);
    }

    @Bean
    CommandLineRunner testDatabase(FlashcardRepository repo) {
        return args -> {
            Flashcard card = new Flashcard("What’s 2 + 2?", "4", 1);
            repo.save(card);
            System.out.println("Saved flashcard with ID: " + card.getId());
        };
    }
}

