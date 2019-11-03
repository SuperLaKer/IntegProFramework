package com.slk.returnObj;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class StatusCode {
    Integer statusCode;
    String errorMessage;
    Object data;
}
