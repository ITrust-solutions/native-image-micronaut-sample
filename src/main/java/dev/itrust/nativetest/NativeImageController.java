package dev.itrust.nativetest;

import dev.itrust.nativetest.model.HalloDTO;
import io.micronaut.http.annotation.*;

@Controller("/")
public class NativeImageController {

    @Get
    public HalloDTO hallo() {
        return new HalloDTO("No name");
    }

    @Get("/{name}")
    public HalloDTO hallo(@PathVariable String name) {
        return new HalloDTO(name);
    }
}
