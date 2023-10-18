package com.ghost.contentcalendar.repository;

import com.ghost.contentcalendar.model.Content;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}
