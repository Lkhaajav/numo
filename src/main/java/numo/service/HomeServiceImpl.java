package numo.service;

import numo.dao.HomeDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("homeService")
public class HomeServiceImpl implements HomeService {
	
	@Resource(name="homeDAO")
	private HomeDAO homeDAO;

	@Override
	public List<Map<String, Object>> getHomeData() {
		return homeDAO.getHomeData();
	}
}
