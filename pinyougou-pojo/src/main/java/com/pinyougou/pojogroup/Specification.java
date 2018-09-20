package com.pinyougou.pojogroup;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * @描述:
 * @创建人: 柯南_java
 * @修改人和其它信息:
 */
public class Specification  implements Serializable{

    private TbSpecification specification;
    private List<TbSpecificationOption> specificationOptionList;



    public TbSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(TbSpecification specification) {
        this.specification = specification;
    }

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionsList) {
        this.specificationOptionList = specificationOptionsList;
    }


}
