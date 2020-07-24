package com.cci.apps.golfercatalog.repository;

import com.cci.apps.golfercatalog.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {

}
