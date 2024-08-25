package numo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("homeDAO")
public class HomeDAO extends AbstractDAO {

	final private String namespace ="sql.home.";

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getHomeData() {
		return selectList(namespace+"getHomeData");

	}


}
