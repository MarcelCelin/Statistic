package com.statistics.stats.repository;

import com.statistics.stats.model.entity.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {

    Optional<Member> findByMemberId(String memberId);
    Optional<Member> findByContact(String contact);

}
