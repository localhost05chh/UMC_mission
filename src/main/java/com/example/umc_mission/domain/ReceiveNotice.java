package com.example.umc_mission.domain;


import com.example.umc_mission.domain.enums.IsReceive;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ReceiveNotice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String dtype;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private IsReceive isReceive;

    @OneToMany(mappedBy = "receiveNotice", cascade = CascadeType.ALL)
    private List<Notice> noticeList = new ArrayList<>();
}
