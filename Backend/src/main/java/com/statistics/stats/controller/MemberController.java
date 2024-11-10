package com.statistics.stats.controller;

import com.statistics.stats.model.entity.Member;
import com.statistics.stats.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@CrossOrigin(origins = "http://localhost:4200")
public class MemberController {

    MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/add-member")
    public ResponseEntity<?> addMember(@RequestBody Member newMember){

        return memberService.addMember(newMember);
    }
    @GetMapping("/find-all-members")
    public ResponseEntity<?> getMember(){
        return memberService.findAllMembers();
    }
    @GetMapping("/find-by-memberId/{memberId}")
    public ResponseEntity<?> getMemberByMemberId(@PathVariable String memberId){

        return memberService.findByMemberId(memberId);
    }
    @PutMapping("/edit-member")
    public ResponseEntity<?> editMember( @RequestBody Member newMember){

        return memberService.editMember(newMember);

    }

}
