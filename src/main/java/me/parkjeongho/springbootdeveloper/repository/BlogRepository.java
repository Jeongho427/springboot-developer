package me.parkjeongho.springbootdeveloper.repository;

import me.parkjeongho.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
