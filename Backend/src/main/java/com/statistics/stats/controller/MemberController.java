package com.statistics.stats.controller;

import com.statistics.stats.model.entity.Member;
import com.statistics.stats.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class MemberController {

    MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @PostMapping("/add-user")
    public ResponseEntity<?> addMember(@RequestBody Member newMember){

        return memberService.addMember(newMember);
    }
}
