package gov.mo.courts.cases.service;

import gov.mo.courts.cases.dto.CaseDto;
import gov.mo.courts.cases.exception.CaseException;
import gov.mo.courts.cases.mapper.CaseMapper;
import gov.mo.courts.cases.model.Case;
import gov.mo.courts.cases.repository.CaseRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CaseServiceImpl implements ICaseService {

    private CaseRepository caseRepository;
    @Override
    public void createCase(CaseDto caseDto) {
        if(caseDto == null){
            throw new CaseException(
                "CaseDto cannot be null. Please provide valid case details."
            );
        }
        Case caseEntity =CaseMapper.toEntity(caseDto, createDummyCase());
        Case savedCase = caseRepository.save(caseEntity);
    }

    private Case createDummyCase() {
        Case caseEntity = new Case();
        caseEntity.setCaseId("CASE-" + new Random().nextInt(10000));
        caseEntity.setSecurityLevel("PUBLIC");
        caseEntity.setTypeCode("CIVIL");
        caseEntity.setStyle("John Doe vs. Jane Smith");
        caseEntity.setLocationCode("STL");
        caseEntity.setOriginalCaseId("ORIG-" + new Random().nextInt(10000));
        caseEntity.setOriginalLocationCode("ORIG-STL");

        return caseEntity;
    }

}
