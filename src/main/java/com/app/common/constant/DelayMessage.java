package com.app.common.constant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 舒润
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DelayMessage {

    public static final String DELAY_QUEUE="DelayQueue";
    public static final String DELAY_EXCHANGE="DelayExchange";
    public static final String DELAY_ROUTE_KEY="DelayRoutKey";

    private Long id;
}
