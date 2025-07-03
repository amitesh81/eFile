package gov.mo.courts.cases.mapper;

import gov.mo.courts.cases.dto.CaseDto;
import gov.mo.courts.cases.model.Case;

public class CaseMapper {
    public static CaseDto toDto(Case caseObj, CaseDto dto) {
        if (caseObj == null) {
            return null;
        }
        if (dto == null) {
            dto = new CaseDto();
        }
        dto.setCaseId(caseObj.getCaseId());        // Map other fields as needed
        dto.setSecurityLevel(caseObj.getSecurityLevel());
        dto.setTypeCode(caseObj.getTypeCode());
        dto.setStyle(caseObj.getStyle());
        dto.setLocationCode(caseObj.getLocationCode());
        dto.setOriginalCaseId(caseObj.getOriginalCaseId());
        dto.setOriginalLocationCode(caseObj.getOriginalLocationCode());
        return dto;
    }
    public static Case toEntity(CaseDto dto, Case caseObj) {
        if (dto == null) {
            return null;
        }
        if (caseObj == null) {
            caseObj = new Case();
        }
        caseObj.setCaseId(dto.getCaseId());
        caseObj.setSecurityLevel(dto.getSecurityLevel());
        caseObj.setTypeCode(dto.getTypeCode());
        caseObj.setStyle(dto.getStyle());
        caseObj.setLocationCode(dto.getLocationCode());
        caseObj.setOriginalCaseId(dto.getOriginalCaseId());
        caseObj.setOriginalLocationCode(dto.getOriginalLocationCode());
        caseObj.setActivityId(dto.getActivityId());
        caseObj.setActivityDate(dto.getActivityDate());
        // Map other fields as needed
        return caseObj;
    }

}
