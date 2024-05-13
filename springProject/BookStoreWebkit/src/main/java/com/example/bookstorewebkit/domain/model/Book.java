package com.example.bookstorewebkit.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private int price;
    @Enumerated(value = EnumType.STRING)
    BookType bookType;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "book")
    @Builder.Default
    @JsonIgnoreProperties("book")
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    private Publisher publisherId;

    @ManyToOne
    private Author authorID;

    public void addTagAll(List<Tag> tags) {
        this.tags.addAll(tags);
    }
}
