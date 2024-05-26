package com.example.umc_mission.domain.mapping;

import com.example.umc_mission.domain.common.BaseEntity;
import com.example.umc_mission.domain.enums.IsConfirmed;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Notice extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receive_id")
    private ReceiveNotice receiveNotice;

    @Enumerated(EnumType.STRING)
    private IsConfirmed isConfirmed;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 500)
    private String body;
}
