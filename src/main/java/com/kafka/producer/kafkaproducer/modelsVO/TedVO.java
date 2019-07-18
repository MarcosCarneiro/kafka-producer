package com.kafka.producer.kafkaproducer.modelsVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnore;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TedVO {

    @JsonIgnore
    public static final String NAMESPACE = "kafka.producer";
    @JsonIgnore
    public static final String OBJECT_NAME = "tedmessage";
    @JsonIgnore
    public static final String FIELD_ACCOUNT = "account";
    @JsonIgnore
    public static final String FIELD_AGENCY = "agency";

    private String account;
    private String agency;
}
