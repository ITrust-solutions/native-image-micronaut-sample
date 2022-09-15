package dev.itrust.nativetest.model;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 2022.09.13
 */
@Data
@AllArgsConstructor
@Introspected
public class HalloDTO {
    String name;
}
