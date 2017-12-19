package com.boot.demo;

import com.boot.demo.model.Shipwreck;
import com.boot.demo.repository.ShipwreckRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Test
    public void testFindAll() {
        List<Shipwreck> shipwrecks = shipwreckRepository.findAll();
        MatcherAssert.assertThat(shipwrecks.size(), Is.is(Matchers.greaterThanOrEqualTo(0)));
    }

}
