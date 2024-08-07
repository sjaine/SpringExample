package design.jaine.spring.ex.datebase.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import design.jaine.spring.ex.datebase.domain.UsedGoods;

// 데이터베이스 관련 처리
// 쿼리 수행
@Mapper
public interface UsedGoodsRepository {

	// usedGoods 모든 행 조회
	public List<UsedGoods> selectUsedGoodsList();
	
	
	
}
