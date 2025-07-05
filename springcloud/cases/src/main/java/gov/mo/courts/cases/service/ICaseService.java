package gov.mo.courts.cases.service;

import gov.mo.courts.cases.dto.CaseDto;

public interface ICaseService {
    // Define methods for case management operations
    // For example:
    // List<Case> getAllCases();
    // Case getCaseById(Long id);
    // Case createCase(CaseDto caseDto);
    // Case updateCase(Long id, Case updatedCase);
    // void deleteCase(Long id);
    // EfileSubmissionResponseDto submitEfile(CaseDto caseDto);
    // Additional methods can be added as needed
    // Example method signatures:

    /**
     * Creates a new case based on the provided CaseDto.
     *
     * @param caseDto the data transfer object containing case details
     */
    public void createCase(CaseDto caseDto);


}
