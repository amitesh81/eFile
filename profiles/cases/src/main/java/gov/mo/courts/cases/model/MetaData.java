package gov.mo.courts.cases.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@MappedSuperclass
@Getter
@Setter
@ToString
public class MetaData {
    private String activityId;
    private LocalDateTime activityDate;
}
