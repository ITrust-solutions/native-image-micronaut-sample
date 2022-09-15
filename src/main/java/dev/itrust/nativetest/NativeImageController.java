package dev.itrust.nativetest;

import dev.itrust.nativetest.model.HalloDTO;
import io.micronaut.http.annotation.*;

@Controller("/")
public class NativeImageController {

    @Get
    public HalloDTO hello() {
        return new HalloDTO("No name");
    }

    @Get("/{name}")
    public HalloDTO hello(@PathVariable String name) {
        return new HalloDTO(name);
    }
}
