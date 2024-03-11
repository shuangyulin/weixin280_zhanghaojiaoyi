package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MaijiapingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MaijiapingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MaijiapingjiaView;


/**
 * 卖家评价
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface MaijiapingjiaService extends IService<MaijiapingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MaijiapingjiaVO> selectListVO(Wrapper<MaijiapingjiaEntity> wrapper);
   	
   	MaijiapingjiaVO selectVO(@Param("ew") Wrapper<MaijiapingjiaEntity> wrapper);
   	
   	List<MaijiapingjiaView> selectListView(Wrapper<MaijiapingjiaEntity> wrapper);
   	
   	MaijiapingjiaView selectView(@Param("ew") Wrapper<MaijiapingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MaijiapingjiaEntity> wrapper);
   	

}

