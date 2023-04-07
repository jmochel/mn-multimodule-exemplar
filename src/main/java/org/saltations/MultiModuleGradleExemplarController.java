package org.saltations;

import io.micronaut.http.annotation.*;

@Controller("/multiModuleGradleExemplar")
public class MultiModuleGradleExemplarController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}