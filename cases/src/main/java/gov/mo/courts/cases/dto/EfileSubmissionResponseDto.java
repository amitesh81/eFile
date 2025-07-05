package gov.mo.courts.cases.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class EfileSubmissionResponseDto {
    private String statusCode;
    private String statusMessage;
}
