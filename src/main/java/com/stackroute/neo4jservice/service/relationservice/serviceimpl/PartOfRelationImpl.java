package com.stackroute.neo4jservice.service.relationservice.serviceimpl;

import com.stackroute.neo4jservice.domain.relation.IsARelation;
import com.stackroute.neo4jservice.domain.relation.PartOfRelation;
import com.stackroute.neo4jservice.repository.relationrepository.IsARepository;
import com.stackroute.neo4jservice.repository.relationrepository.PartOfRepository;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.PartOfRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartOfRelationImpl implements PartOfRelationService {
    PartOfRepository partOfRepository;

    @Autowired
    public PartOfRelationImpl(PartOfRepository partOfRepository)
    {
        this.partOfRepository=partOfRepository;
    }

    @Override
    public PartOfRelation savePartOfRelation(PartOfRelation partOfRelation) {
        PartOfRelation savedPartOfRelation = partOfRepository.save(partOfRelation);
        return savedPartOfRelation;
    }

    @Override
    public List<PartOfRelation> getAllPartOfRelation() {
        return (List<PartOfRelation>)partOfRepository.findAll();
    }
}
