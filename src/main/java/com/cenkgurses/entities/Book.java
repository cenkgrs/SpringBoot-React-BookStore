package com.cenkgurses.entities;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@NoArgsConstructor
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column
    private String name;

    @Column
    private String summary;

    @ManyToOne
    @JoinColumn(
            name = "author_id",
            referencedColumnName = "id"
    )
    private Author author;

    @Column(name = "page_count")
    private Integer pageCount;
    
    @DateTimeFormat
    @Column(name = "publish_date")
    private Date publishDate;

    @Column(name = "read_count")
    private Integer readCount;

    @Column(name = "reading_count")
    private Integer readingCount;

    @Column(name = "will_read_count")
    private Integer willReadCount;

    @OneToMany(mappedBy = "comment")
    private List<Comment> comments;

}
