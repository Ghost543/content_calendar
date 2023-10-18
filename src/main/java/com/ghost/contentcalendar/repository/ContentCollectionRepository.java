package com.ghost.contentcalendar.repository;

import com.ghost.contentcalendar.model.Content;
import com.ghost.contentcalendar.model.Status;
import com.ghost.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository(){}
    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public boolean existsById(Integer id) {
        return content.stream().anyMatch(c -> c.id().equals(id));
    }
    public void save(Content con) {
        content.removeIf(c -> c.id().equals(con.id()));
        System.out.println(con);
        content.add(con);
    }

//    public void update(id)

    @PostConstruct
    private void init() {
        Content c = new Content(1, "My Bog", "it is bad", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), null, "");
        content.add(c);
    }

    public void deleteById(Integer id) {
        content.removeIf(c-> c.id().equals(id));
    }
}
