package com.mkaszynski.wpm.demo.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class CarHireIT {
    private static final String CARS =
            "[" +
                    "{\"vin\":\"1\",\"model\":\"Ford\",\"numberOfSeats\":5}," +
                    "{\"vin\":\"2\",\"model\":\"Toyota\",\"numberOfSeats\":5}," +
                    "{\"vin\":\"3\",\"model\":\"Fiat\",\"numberOfSeats\":3}" +
                    "]";
    private static final String NEW_CAR = "{\n" +
            "\"vin\": \"1\",\n" +
            "\"model\": \"Ford\",\n" +
            "\"numberOfSeats\": 5\n" +
            "}";
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnAllCars() throws Exception {
        this.mockMvc.perform(get("/cars"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(content().string(containsString(CARS)));
    }

    @Test
    public void shouldCreateNewCar() throws Exception {
        this.mockMvc.perform(post("/cars").contentType(MediaType.APPLICATION_JSON).content(NEW_CAR))
                    .andDo(print())
                    .andExpect(status().isOk());
    }
}
