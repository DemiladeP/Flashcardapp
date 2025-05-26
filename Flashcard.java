package com.flashcard.flashcard;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Flashcard")
public class Flashcard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String question;

    @Column(nullable = false, length = 255)
    private String answer;

    private Integer deckId;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    public Flashcard() {}

    public Flashcard(String question, String answer, Integer deckId) {
        this.question = question;
        this.answer = answer;
        this.deckId = deckId;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters

    public Long getId() { return id; }
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
    public Integer getDeckId() { return deckId; }
    public void setDeckId(Integer deckId) { this.deckId = deckId; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}

