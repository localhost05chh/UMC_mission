package com.example.umc_mission.domain;

import com.example.umc_mission.domain.common.BaseEntity;
import com.example.umc_mission.domain.enums.Gender;
import com.example.umc_mission.domain.enums.PhoneCheck;
import com.example.umc_mission.domain.enums.UserStatus;
import com.example.umc_mission.domain.mapping.*;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@DynamicUpdate
@DynamicInsert
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String userName;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(length = 20)
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "INT")
    private Gender gender;

    private LocalDate birthday;

    @Column(length = 50)
    private String userAdders;

    @Column(nullable = false, length = 20)
    private String nickname;

    @Column(nullable = false, length = 20)
    private String email;

    @Column(nullable = false, length = 20)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(20) DEFAULT 'INCOMPLETE'")
    private PhoneCheck phoneCheck;

    private Integer myPoint;

    private Integer successMission;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private UserStatus userStatus;

    private LocalDate inactive;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberSelectFood> memberSelectFoodList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberTermAgree> memberTermAgreeList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberInquiry> memberInquiryList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberSelectMission> memberSelectMissionList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Notice> noticeList = new ArrayList<>();
}
