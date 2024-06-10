package com.example.umc_mission.domain.mapping;

import com.example.umc_mission.domain.Member;
import com.example.umc_mission.domain.PreferFood;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberSelectFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private PreferFood preferFood;

    public void setMember(Member member){
        if(this.member != null)
            member.getMemberSelectFoodList().remove(this);
        this.member = member;
        member.getMemberSelectFoodList().add(this);
    }

    public void setFoodCategory(PreferFood preferFood){
        this.preferFood = preferFood;
    }
}
