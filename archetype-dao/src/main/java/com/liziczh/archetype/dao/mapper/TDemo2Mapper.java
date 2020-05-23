package com.liziczh.archetype.dao.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.base.common.repository.BaseRepository;

@Repository
@Mapper
public interface TDemo2Mapper extends BaseRepository<TDemo, Integer> {
	@Override
	@Select("SELECT * FROM T_DEMO WHERE ID = #{id}")
	TDemo get(@Param("id") Integer id);
	@Override
	@Insert("insert into T_DEMO (ID, NAME, CREATE_TIME, CREATE_USER, UPDATE_TIME, UPDATE_USER, PERMIT_ROLE, VALID) "
			+ "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR},"
			+ "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=VARCHAR},#{updateTime,jdbcType=TIMESTAMP},"
			+ "#{updateUser,jdbcType=VARCHAR}, #{permitRole,jdbcType=VARCHAR}, #{valid,jdbcType=VARCHAR})")
	int insert(TDemo entity);
	@Override
	@Update(" update T_DEMO set NAME = #{name,jdbcType=VARCHAR}, "
			+ "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},"
			+ "CREATE_USER = #{createUser,jdbcType=VARCHAR},"
			+ "UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP},"
			+ "UPDATE_USER = #{updateUser,jdbcType=VARCHAR},"
			+ "PERMIT_ROLE = #{permitRole,jdbcType=VARCHAR},"
			+ "VALID = #{valid,jdbcType=VARCHAR},"
			+ "where ID = #{id,jdbcType=INTEGER}")
	int update(TDemo entity);
	@Override
	@Delete("delete from T_DEMO where ID = #{id,jdbcType=BIGINT}")
	int delete(Integer pk);
}