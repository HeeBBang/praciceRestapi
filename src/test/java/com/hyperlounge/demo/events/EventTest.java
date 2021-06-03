package com.hyperlounge.demo.events;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {



    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Hyper Spring Rest API")
                .description("Hyper Spring Rest API")
                .build();
        assertThat(event).isNotNull();
    }

    @Bean
    public void javaBean() {
        // Given
        String name = "Event";
        String description = "Spring";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);

    }

}