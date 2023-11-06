package com.rest.demoRest.testTopo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
    private String statusString;
    private boolean reorganizing;
    private boolean bankrupting;
    private boolean dissolving;
    private boolean dissolved;
    private String date;
}
