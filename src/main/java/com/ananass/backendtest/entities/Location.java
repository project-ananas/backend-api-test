package com.ananass.backendtest.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "devices",
        "location",
        "gps",
        "total"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @JsonProperty("devices")
    private List<Device> devices;
    @JsonProperty("location")
    private String location;
    @JsonProperty("gps")
    private Gps gps;
    @JsonProperty("total")
    private Integer total;
}