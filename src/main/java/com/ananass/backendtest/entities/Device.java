package com.ananass.backendtest.entities;

import java.sql.Timestamp;
import java.util.HashMap;
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
        "device",
        "vendor",
        "timestamp",
        "probability",
        "randomized",
        "num_scanners",
        "active_mins",
        "first_seen"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    @JsonProperty("device")
    private String device;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("timestamp")
    private Timestamp timestamp;
    @JsonProperty("probability")
    private Double probability;
    @JsonProperty("randomized")
    private Boolean randomized;
    @JsonProperty("num_scanners")
    private Integer numScanners;
    @JsonProperty("active_mins")
    private Integer activeMins;
    @JsonProperty("first_seen")
    private Timestamp firstSeen;
}