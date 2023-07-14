package me.parkjeongho.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity //엔티티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자 생성
public class Article {

    @Id //id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "author", nullable = false)
    private String author;

    @CreatedDate //엔티티가 생성될 때 생성 시간 저장
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate //엔티티가 수정될 때 수정 시간 저장
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Builder
    public Article(String author, String title, String content) { //빌드 패턴으로 객체 생성
        this.author = author;
        this.title = title;
        this.content = content;
    }
}
