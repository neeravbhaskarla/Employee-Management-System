package emporg.employeeservice.support;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PerformanceReview {
    private LocalDate reviewDate;
    private String reviewer;
    private String comments;
    private double rating;
}
