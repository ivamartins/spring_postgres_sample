package io.sggc.api.controller;

import io.sggc.api.dto.ProviderRequest;
import io.sggc.business.domain.Provider;
import io.sggc.business.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/providers")
public class CompulsoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompulsoryController.class);

    private final ProviderService service;

    public CompulsoryController(ProviderService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@Valid @RequestBody ProviderRequest request) {
        service.saveProvider(request)
                .doOnError(e -> LOGGER.error(e.toString(), e))
                .subscribe();
    }

    @GetMapping
    public List<Provider> listProvider() {
       return service.listProvider();
    }

}
