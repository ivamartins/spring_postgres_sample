package io.sggc.infrastructure.configuration;


import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MapperConfiguration {

    @Bean
    public MapperFactory getMapperFactory() {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory;
    }

    @Bean
    public MapperFacade mapperFacade(MapperFactory mapperFactory) {
        return mapperFactory.getMapperFacade();
    }
}
