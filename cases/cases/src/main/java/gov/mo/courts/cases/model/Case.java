package gov.mo.courts.cases.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EFILE_CASE")
@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Case extends MetaData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "case_seq_gen")
    @SequenceGenerator(name = "case_seq_gen")
    private Long caseInfoNo;
    private String caseId;
    private String securityLevel;
    private String typeCode;
    private String style;
    private String locationCode;
    private String originalCaseId;
    private String originalLocationCode;
}
