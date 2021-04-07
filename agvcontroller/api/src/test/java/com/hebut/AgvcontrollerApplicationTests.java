package com.hebut;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.opentcs.access.KernelServicePortal;
import org.opentcs.access.rmi.KernelServicePortalBuilder;
import org.opentcs.access.to.model.PlantModelCreationTO;
import org.opentcs.components.kernel.services.PlantModelService;
import org.opentcs.components.kernel.services.TransportOrderService;
import org.opentcs.components.kernel.services.VehicleService;
import org.opentcs.components.plantoverview.PlantModelImporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AgvcontrollerApplicationTests.class})
class AgvcontrollerApplicationTests {
    private final static Logger log = LoggerFactory.getLogger(AgvcontrollerApplicationTests.class);

    @Test
    void contextLoads() {
        KernelServicePortal servicePortal = new KernelServicePortalBuilder("Alice", "xyz").build();
        // Connect and log in with a kernel somewhere.
        servicePortal.login("127.0.0.1", 1099);
        log.info(servicePortal.getState().toString());


        PlantModelService plantModelService = servicePortal.getPlantModelService();
        PlantOver


        List<Object> events = servicePortal.fetchEvents(1000);
    }

}
