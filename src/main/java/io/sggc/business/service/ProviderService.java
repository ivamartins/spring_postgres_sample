package io.sggc.business.service;

import io.sggc.api.dto.ProviderRequest;
import io.sggc.business.adapter.PersistencePort;
import io.sggc.business.domain.Provider;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ProviderService {

    private final PersistencePort persistencePort;
    private final MapperFacade mapperFacade;

    public ProviderService(PersistencePort persistencePort, MapperFacade mapperFacade) {
        this.persistencePort = persistencePort;
        this.mapperFacade = mapperFacade;
    }

    public Mono<Provider> saveProvider(ProviderRequest providerRequest) {
        return persistencePort.saveProvider(mapperFacade.map(providerRequest, Provider.class));
    }

    public Mono<Provider> updateProvider(ProviderRequest providerRequest) {
        return persistencePort.saveProvider(mapperFacade.map(providerRequest, Provider.class));
    }

    public Mono<Provider> findProvider(String razaoSocial, String nomeFantasia) {
        return persistencePort.findProvider(razaoSocial, nomeFantasia);
    }

    public List<Provider> listProvider() {
        return persistencePort.listProviders();
    }

}
