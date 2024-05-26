package com.example.umc_mission.domain.mapping;

import com.example.umc_mission.domain.enums.IsEssential;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Term {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String termName;

    @Column(nullable = false, length = 500)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(20)")
    private IsEssential isEssential;

    @OneToMany(mappedBy = "term", cascade = CascadeType.ALL)
    private List<TermAgree> termAgreeList = new ArrayList<>();
}
