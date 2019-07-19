package com.kafka.producer.kafkaproducer.kafkaSchema;

import com.kafka.producer.kafkaproducer.modelsVO.TedVO;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.springframework.stereotype.Component;

@Component
public class TedMapper {

    public static final Schema schema = SchemaBuilder
            .record(TedVO.OBJECT_NAME).doc(TedVO.OBJECT_NAME)
            .namespace(TedVO.NAMESPACE)
            .fields()
            .name(TedVO.FIELD_ID).doc(TedVO.FIELD_ID).type().intType().noDefault()
            .name(TedVO.FIELD_DATE_PROCESSING).doc(TedVO.FIELD_DATE_PROCESSING).type().stringType().noDefault()
            .name(TedVO.FIELD_VALUE).doc(TedVO.FIELD_VALUE).type().doubleType().noDefault()
            .name(TedVO.FIELD_SOURCE_BANK).doc(TedVO.FIELD_SOURCE_BANK).type().stringType().noDefault()
            .name(TedVO.FIELD_SOURCE_AGENCY).doc(TedVO.FIELD_SOURCE_AGENCY).type().stringType().noDefault()
            .name(TedVO.FIELD_SOURCE_ACCOUNT).doc(TedVO.FIELD_SOURCE_ACCOUNT).type().stringType().noDefault()
            .name(TedVO.FIELD_DESTINATION_BANK).doc(TedVO.FIELD_DESTINATION_BANK).type().stringType().noDefault()
            .name(TedVO.FIELD_DESTINATION_AGENCY).doc(TedVO.FIELD_DESTINATION_AGENCY).type().stringType().noDefault()
            .name(TedVO.FIELD_DESTINATION_ACCOUNT).doc(TedVO.FIELD_DESTINATION_ACCOUNT).type().stringType().noDefault()
            .endRecord();

    public GenericRecord mapToGenericRecord(final TedVO tedVO){
        final GenericRecordBuilder genericRecordBuilder = new GenericRecordBuilder(schema);

        return genericRecordBuilder
                .set(TedVO.FIELD_ID, tedVO.getId().intValue())
                .set(TedVO.FIELD_DATE_PROCESSING, tedVO.getDateProcessing().toString())
                .set(TedVO.FIELD_VALUE, tedVO.getValue().doubleValue())
                .set(TedVO.FIELD_SOURCE_BANK, tedVO.getSourceBank())
                .set(TedVO.FIELD_SOURCE_AGENCY, tedVO.getSourceAgency())
                .set(TedVO.FIELD_SOURCE_ACCOUNT, tedVO.getSourceAccount())
                .set(TedVO.FIELD_DESTINATION_BANK, tedVO.getDestinationBank())
                .set(TedVO.FIELD_DESTINATION_AGENCY, tedVO.getDestinationAgency())
                .set(TedVO.FIELD_DESTINATION_ACCOUNT, tedVO.getDestinationAccount())
                .build();
    }
}
