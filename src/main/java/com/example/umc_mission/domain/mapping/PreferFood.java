package com.example.umc_mission.domain.mapping;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PreferFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String foodName;

    @OneToMany(mappedBy = "preferFood", cascade = CascadeType.ALL)
    private List<SelectFood> selectFoodList = new ArrayList<>();

}
