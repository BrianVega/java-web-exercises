package com.bobocode;

import org.springframework.context.annotation.Bean;

public class StringTrimmingConfiguration {

    @Bean
    TrimmedAnnotationBeanPostProcessor trimmedAnnotationBeanPostProcessor() {
        return new TrimmedAnnotationBeanPostProcessor();
    }
}
