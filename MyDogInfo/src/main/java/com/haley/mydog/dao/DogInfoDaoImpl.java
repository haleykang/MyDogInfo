package com.haley.mydog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haley.mydog.domain.DogInfo;

// Impl Ŭ���� - Dao���� �ۼ��� �������̽��� �Լ��� �����ϴ� Ŭ����

// 1. @Repository ���� - �� Ŭ������ ��ü�� �ڵ����� �����ش޶�� ��û
// -> �� Ŭ������ �����ͺ��̽��� �����ϴ� Ŭ������� �˷��ִ� �뵵
@Repository
public class DogInfoDaoImpl implements DogInfoDao {

	// 2. SqlSession ���� ����
	// @Autowired : ������ �ڷ������� ������� ��ü�� ������ �ڵ����� ���� ����
	@Autowired
	private SqlSession sqlSession;

	// 3. ������ �Լ� ����

	// 3-1) insert() : ������ ���� �Լ�
	@Override
	public int insert(DogInfo dogInfo) {
		/*
		 * <mapper namespace="DogInfo"> <insert id="insert"
		 * parameterType="com.haley.mydog.domain.DogInfo"> insert into doginfo
		 * values(#{code},#{dname},#{age},#{gender}) </insert>
		 */

		// ���Կ� ������ ��� ���� 1�� return
		return sqlSession.insert("DogInfo.insert", dogInfo);

	}

	// 3-2) selectAll() : mapper.xml�� �ִ� selectAll sql�� �����ؼ� ����� List�� ����
	@Override
	public List<DogInfo> selectAll() {

		/*
		 * <mapper namespace="DogInfo"> <select id="selectAll"
		 * resultType="com.haley.mydog.domain.DogInfo"> select * from doginfo
		 * </select>
		 */
		return sqlSession.selectList("DogInfo.selectAll");
	}

	// 3-3) selectOne() : �⺻Ű�� ������ �˻��ϴ� �Լ�
	@Override
	public DogInfo selectOne(int code) {
		/*
		 * <select id="selectOne" resultType="com.haley.mydog.domain.DogInfo"
		 * parameterType="java.lang.Integer"> select * from doginfo where code =
		 * #{code} </select>
		 */
		return sqlSession.selectOne("DogInfo.selectOne", code);
	}

	// 3-4) update() : ������ ���� �Լ�
	@Override
	public int update(DogInfo dogInfo) {
		/*
		 * <update id="update" parameterType="com.haley.mydog.domain.DogInfo">
		 * update doginfo set dname=#{dname}, age=#{age}, gender=#{gender} where
		 * code = #{code} </update>
		 */
		return sqlSession.update("DogInfo.update", dogInfo);
	}

	// 3-5) delete() : ������ ���� �Լ�
	@Override
	public int delete(int code) {

		/*
		 * <delete id="delete" parameterType="java.lang.Integer"> delete from
		 * doginfo where code = #{code} </delete>
		 */
		return sqlSession.delete("DogInfo.delete", code);
	}

}
