package com.chase.chasecodinttest.model.request;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IncomingRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull
    @NotEmpty
    private String accountNumber;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> providers;
}
