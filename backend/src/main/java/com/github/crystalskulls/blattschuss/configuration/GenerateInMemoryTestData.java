package com.github.crystalskulls.blattschuss.configuration;

import com.github.crystalskulls.blattschuss.domain.AssociationMember;
import com.github.crystalskulls.blattschuss.repositories.AssociationMemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class GenerateInMemoryTestData {

    @Bean
    CommandLineRunner createAssociationMemberTestData(AssociationMemberRepository associationMemberRepository) {
        return args -> {
            log.info("Creating AssociationMember " + associationMemberRepository.save(new AssociationMember("Benedikt", "Müller")));
        };
    }
}
