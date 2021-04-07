package com.hebut.service;

import org.opentcs.access.to.model.PlantModelCreationTO;
import org.opentcs.components.plantoverview.PlantModelImporter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
public class PlantService implements PlantModelImporter {
    @Override
    public Optional<PlantModelCreationTO> importPlantModel() throws IOException {
        PlantModelCreationTO plantModelCreationTO = new PlantModelCreationTO("test");
        return Optional.empty();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
