package io.sggc.business.adapter;

import io.sggc.business.domain.Provider;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PersistencePort {

    Mono<Provider> saveProvider(Provider provider);

    Mono<Provider> findProvider(String razaoSocial, String nomeFantasia);

    List<Provider> listProviders();
}
