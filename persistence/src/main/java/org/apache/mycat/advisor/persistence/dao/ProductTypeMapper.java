package org.apache.mycat.advisor.persistence.dao;

import org.apache.mycat.advisor.persistence.model.ProductType;
import org.apache.mycat.advisor.persistence.util.MyMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by cloudsher on 2016/4/27.
 */
public interface ProductTypeMapper extends MyMapper<ProductType> {

    List<Map<String,Object>> selectByNameAndCode(String name);
}
