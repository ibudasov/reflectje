package com.ibudasov.reflectje.unit.infrastructure;

import com.ibudasov.reflectje.domain.Id;
import com.ibudasov.reflectje.infrastructure.Uuid;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UuidTest {

    @Test
    public void whenGeneratingUuidFromString_thenUuidCreated_andValueEqualsExpected() {
        Id uuid = new Uuid("expected-value");
        assertThat(uuid.toString().contains("expected-value")).isTrue();
    }

    @Test
    public void whenGeneratingUuid_thenUuidCreated_andValueIsSomeSting() {
        Id uuid = (new Uuid()).generate();
        assertThat(uuid.toString().isEmpty()).isFalse();
    }

}
