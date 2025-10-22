package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class UpdateSessionErrorCannotModifyOnCreateOnlyTagsDetails {
    @NonNull @JsonProperty("tag_names") List<String> tagNames;
}