package design.jaine.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import design.jaine.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	// id가 5인 행 조회
	public Review selectReview(@Param("id") int id);
}
