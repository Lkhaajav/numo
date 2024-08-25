package numo.controller;

import numo.service.HomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home/*")
public class HomeController {
	
	@Resource(name="homeService")
	private HomeService homeService;

	@RequestMapping("getHomeData.json")
    public List<Map<String, Object>> getHomeData() {
        return homeService.getHomeData();
    }

}