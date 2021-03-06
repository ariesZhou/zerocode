package org.jsmart.zerocode.integration.tests.kafka.produce;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/kafka_test_server_unique.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class KafkaProduceUniqueClientIdTest {

    @Test
    @JsonTestCase("kafka/produce/test_kafka_produce.json")
    public void testProduce() throws Exception {
    }

}
