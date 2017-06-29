package com.haley.mydog.dao;

import java.util.List;

import com.haley.mydog.domain.DogInfo;

// DAO (Data Access Object) : �����ͺ��̽� ������ ���� ��ü
public interface DogInfoDao {

	/*
	 * CRUD(Create,Read,Update,Delete) �Լ� �Ӹ� ����
	 */

	// 1. Create - �����͸� �����ϴ� �޼ҵ�
	// -> ���� �� �÷��� ��� ������ �־���ϱ� ������ DTO Ŭ������ ��� ������
	public int insert(DogInfo dogInfo);

	// 2. Read - �����͸� �д� �Լ�
	// 2-1) selectAll() - ��ü �����͸� �������� �޼ҵ� : �Խ��� ��ü����
	public List<DogInfo> selectAll();

	// 2-2) selectOne() - �⺻Ű(code)�� ������ �ϳ��� �����͸� ã�ƿ��� �޼ҵ� : �Խ��� �󼼺���
	public DogInfo selectOne(int code);

	// 3. Update - ������ ���� �޼ҵ�
	// -> ���� �� �÷��� ��� ���� �Է� -> �Ű� ���� - DTO Ŭ����
	public int update(DogInfo dogInfo);

	// 4. Delete - ������ ���� �޼ҵ�
	// -> ���� �� ��� �÷��� �� ���� �ʿ� ����, �⺻Ű�� �Ű� ������
	public int delete(int code);

}
