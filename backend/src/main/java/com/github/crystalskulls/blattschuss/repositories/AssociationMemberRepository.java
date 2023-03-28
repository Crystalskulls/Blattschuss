package com.github.crystalskulls.blattschuss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.github.crystalskulls.blattschuss.domain.AssociationMember;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssociationMemberRepository extends JpaRepository<AssociationMember, UUID> {



}
