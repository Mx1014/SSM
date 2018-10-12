package com.kylin.electricassistsys.server.impl.other;

import com.kylin.electricassistsys.data.api.other.PieDataApi;
import com.kylin.electricassistsys.dto.other.PieDataDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.service.other.PieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/10/12 08:49
 * @Description:
 */
@Service
public class PieDataServerImpl implements PieDataApi {
    @Autowired
    private PieDataService pieDataService;

    @Override
    public List<PieDataDto> selectBdzTypeResult() {
        return MyBeanUtils.copyPropertiesList(pieDataService.selectBdzTypeResult(), PieDataDto.class);
    }

    @Override
    public List<PieDataDto> selectXlxxGyZyResult() {
        return MyBeanUtils.copyPropertiesList(pieDataService.selectXlxxGyZyResult(), PieDataDto.class);
    }
}
