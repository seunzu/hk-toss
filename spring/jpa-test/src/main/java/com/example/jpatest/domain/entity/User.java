package com.example.jpatest.domain.entity;

import ch.qos.logback.core.util.StringUtil;
import com.example.jpatest.config.BaseEntity;
import com.example.jpatest.domain.dto.UserRequest;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "USERS",
        indexes = {
                @Index(columnList = "email"),
                @Index(columnList = "username")
        }
)
public class User extends BaseEntity {
    // 필드를 가지긴 하는데 완벽히 종속된 것은 아닌 user, store, order의 생성 시간
    // 다른 곳에서도 가질 수 있게 하는 것: 상속

    @Id @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 10, nullable = false)
    private String username;

    @OneToMany(mappedBy = "user")
    @Builder.Default
    private List<Store> stores = new ArrayList<>();

    // @Builder.Default
    // private LocalDateTime createdAt = LocalDateTime.now();

    public void update(UserRequest userRequest) {
        if (StringUtil.isNullOrEmpty(userRequest.password()))
            this.password = userRequest.password();
        if (StringUtil.isNullOrEmpty(userRequest.username()))
            this.username = userRequest.username();
    }
}
