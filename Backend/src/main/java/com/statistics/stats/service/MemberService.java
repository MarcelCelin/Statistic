package com.statistics.stats.service;

import com.statistics.stats.model.entity.Member;
import com.statistics.stats.repository.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public ResponseEntity<?> addMember(Member newMember) {

        Member member = new Member();
        member.setAddress(newMember.getAddress());
        member.setContact(newMember.getContact());
        member.setDateOfBirth(newMember.getDateOfBirth());
        member.setEmail(newMember.getEmail());
        member.setGender(newMember.getGender());
        member.setLastName(newMember.getLastName());
        member.setProfession(newMember.getProfession());
        member.setSituation(newMember.getSituation());
        member.setFirstName(newMember.getFirstName());

        if(memberRepository.findByContact(member.getContact()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("There is already someone with this contact");
        }

        try {
            memberRepository.save(member);
            System.out.println(member.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body("Member with the firstname "+ member.getFirstName() + " added successfully");
    }
}
