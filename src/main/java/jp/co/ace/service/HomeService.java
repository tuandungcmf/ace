package jp.co.ace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.ace.dao.HomeDAO;
import jp.co.ace.entities.Home;

@Service
@Transactional
public class HomeService {

	@Autowired
	private HomeDAO homeDAO;

	public List<Home> findAll() {
		return homeDAO.findAll();
	}

	public Home findById(final int id) {
		return homeDAO.findById(id);
	}

	public void save(final Home home) {
		Home homeDB = homeDAO.findById(home.getId());
		homeDB.setHouseName(home.getHouseName());
		homeDB.setHousePrice(home.getHousePrice());
		homeDAO.persist(homeDB);
	}

	public void update(final Home home) {
		homeDAO.update(home);
	}

	public void delete(final int id) {
		Home home = homeDAO.findById(id);
		if (home != null) {
			homeDAO.delete(home);
		}
	}
}
