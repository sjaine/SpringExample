package design.jaine.spring.ex.datebase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import design.jaine.spring.ex.datebase.domain.UsedGoods;
import design.jaine.spring.ex.datebase.service.UsedGoodsService;

// request와 response 처리 담당
@Controller
public class UsedGoodsController {

	@Autowired
	private UsedGoodsService usedGoodsService;
	
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> usedGoodsList() {
		// 중고물품 게시글 리스트 얻어 오기
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		
		return usedGoodsList;
	}
}
