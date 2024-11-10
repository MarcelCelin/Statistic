package com.statistics.stats.service;

import com.statistics.stats.model.entity.Member;
import com.statistics.stats.repository.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public ResponseEntity<?> findAllMembers() {
         List<Member> members = memberRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(members);
    }

    public ResponseEntity<?> findByMemberId(String memberId) {

        Optional<Member> member = memberRepository.findMemberByMemberId(memberId);
        if(member.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(member.get());
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Member not found");
        }
    }
    public ResponseEntity<?> editMember(Member member) {

        Optional<Member> editMember = memberRepository.findMemberByMemberId(member.getMemberId());
        if(editMember.isPresent()) {
            memberRepository.save(member);
            return ResponseEntity.status(HttpStatus.OK).body("Member with the firstname "+ member.getFirstName() + " edited successfully");
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Member not found");
        }
    }
}
