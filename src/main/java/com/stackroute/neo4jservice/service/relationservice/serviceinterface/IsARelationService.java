package com.stackroute.neo4jservice.service.relationservice.serviceinterface;

import com.stackroute.neo4jservice.domain.nodes.Concept;
import com.stackroute.neo4jservice.domain.relation.Attempt;
import com.stackroute.neo4jservice.domain.relation.IsARelation;

import java.util.List;

public interface IsARelationService {
    public IsARelation saveIsARelation(IsARelation isARelation);
    public List<IsARelation> getAllIsARelation();
}
