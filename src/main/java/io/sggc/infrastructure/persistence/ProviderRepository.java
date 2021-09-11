package io.sggc.infrastructure.persistence;

import io.sggc.business.domain.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ProviderRepository extends JpaRepository<Provider, String>,
        JpaSpecificationExecutor<Provider> {

    @Query(value = "select p" +
            " from provider p" +
            " where p.razao_social  = :razaoSocial or p.nome_fantasia  = :nomeFantasia", nativeQuery = true)
    Collection<Provider> findProvider(@Param("razaoSocial") String razaoSocial, @Param("nomeFantasia") String nomeFantasia);
}
