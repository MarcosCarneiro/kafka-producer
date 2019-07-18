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
            .name(TedVO.FIELD_ACCOUNT).doc(TedVO.FIELD_ACCOUNT).type().stringType().noDefault()
            .name(TedVO.FIELD_AGENCY).doc(TedVO.FIELD_AGENCY).type().stringType().noDefault()
            .endRecord();

    public GenericRecord mapToGenericRecord(final TedVO tedVO){
        final GenericRecordBuilder genericRecordBuilder = new GenericRecordBuilder(schema);

        return genericRecordBuilder
                .set(TedVO.FIELD_ACCOUNT, tedVO.getAccount())
                .set(TedVO.FIELD_AGENCY, tedVO.getAgency())
                .build();
    }
}
