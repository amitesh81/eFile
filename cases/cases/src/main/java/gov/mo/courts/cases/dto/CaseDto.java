package gov.mo.courts.cases.dto;

import lombok.Data;

@Data
public class CaseDto {
    private String caseId;
    private String securityLevel;
    private String typeCode;
    private String style;
    private String locationCode;
    private String originalCaseId;
    private String originalLocationCode;
}
