package io.sggc.business.adapter;


import io.sggc.business.domain.Provider;
import io.sggc.infrastructure.persistence.ProviderRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class PersistenceAdapter implements PersistencePort {

    private final ProviderRepository providerRepository;

    public PersistenceAdapter(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public Mono<Provider> saveProvider(Provider provider) {
        return Mono.just(providerRepository.save(provider));
    }

    @Override
    public Mono<Provider> findProvider(String razaoSocial, String nomeFantasia) {
        return Flux.fromIterable(providerRepository.findProvider(razaoSocial, nomeFantasia)).last();
    }

    @Override
    public List<Provider> listProviders() {
        return providerRepository.findAll();
    }
}
