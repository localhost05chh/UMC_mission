package com.example.umc_mission.domain;

import com.example.umc_mission.domain.mapping.MemberInquiry;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class InquiryImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inquiry_id")
    private MemberInquiry memberInquiry;

    private Long imageOrder;

    @Column(length = 50)
    private String imageUri;


}
