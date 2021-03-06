package io.eventuate.examples.tram.sagas.ordersandcustomers.spring.integrationtests;

import io.eventuate.common.jdbc.spring.EventuateCommonJdbcOperationsConfiguration;
import io.eventuate.tram.inmemory.spring.TramInMemoryConfiguration;
import io.eventuate.tram.sagas.inmemory.TramSagaInMemoryConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({OrdersAndCustomersIntegrationCommonIntegrationTestConfiguration.class,
        TramInMemoryConfiguration.class,
        TramSagaInMemoryConfiguration.class,
        EventuateCommonJdbcOperationsConfiguration.class})
public class OrdersAndCustomersInMemoryIntegrationTestConfiguration {
}
