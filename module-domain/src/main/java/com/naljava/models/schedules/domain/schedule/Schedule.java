package com.naljava.models.schedules.domain.schedule;

import com.naljava.commons.base.BaseTimestampEntity;
import lombok.*;

import javax.persistence.*;

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

    private String code;

    private String name;

    private String description;

//    private Place place;

}
