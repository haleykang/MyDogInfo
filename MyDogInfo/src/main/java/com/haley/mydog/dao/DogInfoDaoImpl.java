package com.haley.mydog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haley.mydog.domain.DogInfo;

// Impl 클래스 - Dao에서 작성한 인터페이스를 함수로 구현하는 클래스

// 1. @Repository 선언 - 이 클래스의 객체를 자동으로 생성해달라는 요청
// -> 이 클래스는 데이터베이스에 접근하는 클래스라고 알려주는 용도
@Repository
public class DogInfoDaoImpl implements DogInfoDao {

	// 2. SqlSession 변수 선언
	// @Autowired : 동일한 자료형으로 만들어진 객체가 있으면 자동으로 연결 해줌
	@Autowired
	private SqlSession sqlSession;

	// 3. 재정의 함수 구현

	// 3-1) insert() : 데이터 삽입 함수
	@Override
	public int insert(DogInfo dogInfo) {
		/*
		 * <mapper namespace="DogInfo"> <insert id="insert"
		 * parameterType="com.haley.mydog.domain.DogInfo"> insert into doginfo
		 * values(#{code},#{dname},#{age},#{gender}) </insert>
		 */

		// 삽입에 성공할 경우 숫자 1이 return
		return sqlSession.insert("DogInfo.insert", dogInfo);

	}

	// 3-2) selectAll() : mapper.xml에 있는 selectAll sql을 실행해서 결과를 List로 리턴
	@Override
	public List<DogInfo> selectAll() {

		/*
		 * <mapper namespace="DogInfo"> <select id="selectAll"
		 * resultType="com.haley.mydog.domain.DogInfo"> select * from doginfo
		 * </select>
		 */
		return sqlSession.selectList("DogInfo.selectAll");
	}

	// 3-3) selectOne() : 기본키로 데이터 검색하는 함수
	@Override
	public DogInfo selectOne(int code) {
		/*
		 * <select id="selectOne" resultType="com.haley.mydog.domain.DogInfo"
		 * parameterType="java.lang.Integer"> select * from doginfo where code =
		 * #{code} </select>
		 */
		return sqlSession.selectOne("DogInfo.selectOne", code);
	}

	// 3-4) update() : 데이터 수정 함수
	@Override
	public int update(DogInfo dogInfo) {
		/*
		 * <update id="update" parameterType="com.haley.mydog.domain.DogInfo">
		 * update doginfo set dname=#{dname}, age=#{age}, gender=#{gender} where
		 * code = #{code} </update>
		 */
		return sqlSession.update("DogInfo.update", dogInfo);
	}

	// 3-5) delete() : 데이터 삭제 함수
	@Override
	public int delete(int code) {

		/*
		 * <delete id="delete" parameterType="java.lang.Integer"> delete from
		 * doginfo where code = #{code} </delete>
		 */
		return sqlSession.delete("DogInfo.delete", code);
	}

}
