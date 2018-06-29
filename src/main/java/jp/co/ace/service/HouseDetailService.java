package jp.co.ace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.ace.entity.HouseDetail;
import jp.co.ace.entity.HouseDetailExample;
import jp.co.ace.mapper.HouseDetailMapper;

@Service
public class  HouseDetailService {

	@Autowired
	HouseDetailMapper houseDetailMapper;

	//List
	public List<HouseDetail> getList() {
		return houseDetailMapper.selectByExample(new HouseDetailExample());
	}

	//Get ID
	public HouseDetail getHouseDetailById(Integer id) {
		return houseDetailMapper.selectByPrimaryKey(id);
	}

	//Insert
	public int insert(HouseDetail houseDetail) {
		return houseDetailMapper.insertSelective(houseDetail);
	}

	//Update
	public int update(HouseDetail houseDetail){

		HouseDetailExample example = new HouseDetailExample();
		example.createCriteria().andIdEqualTo(houseDetail.getId()).andExclusiveEqualTo(houseDetail.getExclusive());

		houseDetail.setExclusive(houseDetail.getExclusive() + 1);
		return houseDetailMapper.updateByExample(houseDetail, example);
	}

	//Delete
	public int delete(Integer houseDetailId){
		return houseDetailMapper.deleteByPrimaryKey(houseDetailId);
	}

}