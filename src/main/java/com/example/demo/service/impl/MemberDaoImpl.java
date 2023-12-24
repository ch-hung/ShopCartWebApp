package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.service.MemberDao;
import com.example.demo.vo.Member;

@Service
public class MemberDaoImpl implements MemberDao {
	@Autowired
	MemberMapper memberMapper;

	@Override
	public void addMember(Member m) {
		memberMapper.addMember(m);
		return;
	}

	@Override
	public Member queryMember(String username, String password) {
		Member m = memberMapper.queryMember(username, password);
		return m;
	}

	@Override
	public boolean queryUsername(String username) {
		if (memberMapper.queryUsername(username) != null) {
			return false;
		} else {
			return true;
		}
	}
}
