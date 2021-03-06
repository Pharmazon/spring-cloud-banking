package ru.shcheglov.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.aggregate.AggregateApplicationBuilder;

@SpringBootApplication
public class Aggregator {

    public static void main(String[] args) {
        new AggregateApplicationBuilder()
                .from(WordNumSplitter.class)
                .via(Processor.class)
                .run(args);
    }
}
