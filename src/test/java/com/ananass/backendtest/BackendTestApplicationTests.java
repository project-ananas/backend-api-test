package com.ananass.backendtest;

import com.ananass.backendtest.entities.Device;
import com.ananass.backendtest.entities.Location;
import com.ananass.backendtest.mock.DeviceMocker;
import com.ananass.backendtest.mock.LocationMocker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class BackendTestApplicationTests {

	@Test
	void contextLoads() {
		LocationMocker mocker = new LocationMocker();

		System.out.println(mocker.mockSingle("test").getDevices().size());
	}

}
