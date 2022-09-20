package com.naljava.models.schedules.domain.schedule;

import com.naljava.commons.base.BaseTimestampEntity;
import com.naljava.models.members.domain.member.Member;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", callSuper = false)
public class Schedule extends BaseTimestampEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 이름
     */
    private String name;

    /**
     * 고유 코드
     */
    private UUID code;

    /**
     * 설명
     */
    private String description;

    /**
     * 장소
     */
//    private Place place;

    /**
     * 구성원 목록
     */
    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<Member> members;

}
