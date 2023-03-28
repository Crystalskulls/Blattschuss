package com.github.crystalskulls.blattschuss.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@Data
@RequiredArgsConstructor
public class AssociationMember {

    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
}
