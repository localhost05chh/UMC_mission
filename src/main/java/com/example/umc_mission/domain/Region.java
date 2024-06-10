package com.example.umc_mission.domain;

import com.example.umc_mission.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Region extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String regionName;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    private List<Restaurant> restaurantList = new ArrayList<>();
}
