package com.salgu.salguauth.util.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ResponseBuilder {
    private int output;
    private String result;

    @Builder
    public ResponseBuilder(int output, String result) {
        this.output = output;
        this.result = result;
    }
}
