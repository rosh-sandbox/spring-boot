package com.boot.demo;

import com.boot.demo.controller.ShipwreckController;
import com.boot.demo.model.Shipwreck;
import com.boot.demo.repository.ShipwreckRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet() {
        Shipwreck shipwreck = new Shipwreck();
        shipwreck.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(shipwreck);

        Shipwreck data = shipwreckController.get(1L);
        verify(shipwreckRepository).findOne(1L);

        MatcherAssert.assertThat(data.getId(), Is.is(1L));
    }
}
