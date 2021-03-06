package ru.shcheglov.cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ProcessorChannel {

    String WORDS = "words";
    String UPPER_WORDS = "upperWords";

    @Input(WORDS)
    SubscribableChannel words();

    @Output(UPPER_WORDS)
    MessageChannel upperWords();
}

