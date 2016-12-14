package com.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;

/**
 * Created by vinod on 13/12/16.
 */


public class Producer {

    @Autowired
    @Qualifier("inputToKafka")
    MessageChannel channel;
}
