package gov.mo.courts.cases.model;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class MetaData {
    @Column(updatable = false)
    private String activityId;
    @Column(updatable = false)
    private LocalDate activityDate;
}
