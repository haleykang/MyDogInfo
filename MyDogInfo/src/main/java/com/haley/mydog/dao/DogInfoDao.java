package com.haley.mydog.dao;

import java.util.List;

import com.haley.mydog.domain.DogInfo;

// DAO (Data Access Object) : 데이터베이스 연동을 위한 객체
public interface DogInfoDao {

	/*
	 * CRUD(Create,Read,Update,Delete) 함수 머리 구현
	 */

	// 1. Create - 데이터를 삽입하는 메소드
	// -> 삽입 시 컬럼의 모든 정보를 넣어야하기 때문에 DTO 클래스를 멤버 변수로
	public int insert(DogInfo dogInfo);

	// 2. Read - 데이터를 읽는 함수
	// 2-1) selectAll() - 전체 데이터를 가져오는 메소드 : 게시판 전체보기
	public List<DogInfo> selectAll();

	// 2-2) selectOne() - 기본키(code)를 가지고 하나의 데이터를 찾아오는 메소드 : 게시판 상세보기
	public DogInfo selectOne(int code);

	// 3. Update - 데이터 수정 메소드
	// -> 수정 시 컬럼의 모든 정보 입력 -> 매개 변수 - DTO 클래스
	public int update(DogInfo dogInfo);

	// 4. Delete - 데이터 삭제 메소드
	// -> 삭제 시 모든 컬럼을 다 넣을 필요 없음, 기본키를 매개 변수로
	public int delete(int code);

}
