package com.naljava.models.members.infra.member.repo;

import com.naljava.models.members.domain.member.Member;
import com.naljava.models.members.domain.member.repo.MemberRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
}
