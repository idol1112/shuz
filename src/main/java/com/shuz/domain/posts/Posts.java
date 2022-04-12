package com.shuz.domain.posts;

import com.shuz.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter	// {6}
@NoArgsConstructor	// {5}
@Entity	// {1} JPA의 어노테이션 / 테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {

    @Id	// {2} 해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)	// {3} PK의 생성 규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false)	// {4}
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder	// {7}
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
