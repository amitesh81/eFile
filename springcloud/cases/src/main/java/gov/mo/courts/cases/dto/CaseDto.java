package gov.mo.courts.cases.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        description = "Data Transfer Object for Case",
        title = "Case",
        requiredProperties = {"caseId", "locationCode", "activityId", "activityDate"})
public class CaseDto {
    @Max(15)
    private String caseId;
    private String securityLevel;
    private String typeCode;
    private String style;
    @NotBlank
    private String locationCode;
    private String originalCaseId;
    private String originalLocationCode;
    @NotBlank
    private String activityId;
    @NotBlank
    private LocalDateTime activityDate;
}
