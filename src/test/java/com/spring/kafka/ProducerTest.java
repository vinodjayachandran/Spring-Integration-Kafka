package com.spring.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by vinod on 13/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:kafka-outbound-context.xml"
        })
public class ProducerTest{

    @Autowired
    @Qualifier("inputToKafka")
    MessageChannel channel;

    @Test
    public void test_send_message() {

        channel.send(MessageBuilder.withPayload("Test Message")
                .setHeader(KafkaHeaders.TOPIC, "test").build());

    }

}
