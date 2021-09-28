package com.chase.chasecodinttest.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ResponseData {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull
    @NotEmpty
    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull
    @NotEmpty
    private Boolean isValid;
}
