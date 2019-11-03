package com.slk.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class StatusCode {
    Integer statusCode;
    String errorMessage;
    Object data;
}
