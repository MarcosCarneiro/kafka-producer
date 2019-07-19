package com.kafka.producer.kafkaproducer.modelsVO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TedVO {

    private static final String DATE_PATTERN = "yyyy-MM-dd";

    @JsonIgnore
    public static final String NAMESPACE = "kafka.producer";
    @JsonIgnore
    public static final String OBJECT_NAME = "tedmessage";
    @JsonIgnore
    public static final String FIELD_ID = "id";
    @JsonIgnore
    public static final String FIELD_DATE_PROCESSING = "dateProcessing";
    @JsonIgnore
    public static final String FIELD_VALUE = "value";
    @JsonIgnore
    public static final String FIELD_SOURCE_BANK = "sourceBank";
    @JsonIgnore
    public static final String FIELD_SOURCE_AGENCY = "sourceAgency";
    @JsonIgnore
    public static final String FIELD_SOURCE_ACCOUNT = "sourceAccount";
    @JsonIgnore
    public static final String FIELD_DESTINATION_BANK = "destinationBank";
    @JsonIgnore
    public static final String FIELD_DESTINATION_AGENCY = "destinationAgency";
    @JsonIgnore
    public static final String FIELD_DESTINATION_ACCOUNT = "destinationAccount";

    private Integer id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateProcessing;
    private BigDecimal value;
    private String sourceBank;
    private String sourceAgency;
    private String sourceAccount;
    private String destinationBank;
    private String destinationAgency;
    private String destinationAccount;

}
