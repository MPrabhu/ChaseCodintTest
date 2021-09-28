package com.chase.chasecodinttest.model.dataprovider;

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
public class DataProviderResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull
    @NotEmpty
    private Boolean isValid;
}
