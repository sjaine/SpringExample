package design.jaine.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import design.jaine.spring.ex.mybatis.domain.Review;
import design.jaine.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// id가 전달받은 id와 일치하는 행인 리뷰 정보 리턴 기능
	public Review getReview(int id) {
		// new_review 테이블에서 id가 전달받은 id와 일치하는 행 조회
		Review review = reviewRepository.selectReview(id);
		return review;
	}
	
	// 리뷰에 저장할 값들을 전달 받고, 리뷰 저장 기능
	public int addReview(int storeId
			, String menu
			, String userName
			, double point
			, String review) {
		
			int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
			return count;
	}
	
	// 리뷰에 저장할 값들을 객체로 전달 받고, 리뷰 저장 기능
	public int addReviewByObject(Review review) {
		int count = reviewRepository.insertReviewByObject(review);
		return count;
	}
}
