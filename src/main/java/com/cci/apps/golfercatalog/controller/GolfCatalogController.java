package com.cci.apps.golfercatalog.controller;

import com.cci.apps.golfercatalog.model.Member;
import com.cci.apps.golfercatalog.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class GolfCatalogController {

    @Autowired
    private MemberRepository repository;

    @GetMapping(value = "/members")
    private List<Member> getAllMembers() {
        return repository.findAll();
    }

    @GetMapping(value = "/member/{id}")
    private Optional getMemberById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping(value = "/member")
    private void createMember(Member member) {
        repository.save(member);
    }
}
