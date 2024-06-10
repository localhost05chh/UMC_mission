package com.example.umc_mission.domain.mapping;

import com.example.umc_mission.domain.InquiryImage;
import com.example.umc_mission.domain.Member;
import com.example.umc_mission.domain.common.BaseEntity;
import com.example.umc_mission.domain.enums.InquiryStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberInquiry extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Member member;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 500)
    private String body;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(20) DEFAULT 'INCOMPLETE'")
    private InquiryStatus inquiryStatus;

    @Column(length = 400)
    private String response;
}
