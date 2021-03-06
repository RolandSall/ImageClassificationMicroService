package com.rhr.imageclassificationbackend.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class DataSets {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(nullable = false)
    private UUID datasetId;
    private String origin;
    private String description;

    @ManyToMany(mappedBy = "dataSetsArrayList")
    private List<Features> featuresArrayList = new ArrayList<>();
}
