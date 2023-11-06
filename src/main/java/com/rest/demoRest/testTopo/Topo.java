package com.rest.demoRest.testTopo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Topo {
    String topoShortName;
    String getTopoValue;
    String topoValue;
}
