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
        "locations",
        "message",
        "success"
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @JsonProperty("locations")
    public List<Location> locations;    
    @JsonProperty("message")
    public String message;
    @JsonProperty("success")
    public Boolean success;
}
