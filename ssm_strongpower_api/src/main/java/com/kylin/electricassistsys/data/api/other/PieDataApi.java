package com.kylin.electricassistsys.data.api.other;

import com.kylin.electricassistsys.dto.other.PieDataDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/10/11 17:28
 * @Description:
 */
public interface PieDataApi {
    public List<PieDataDto> selectBdzTypeResult();

    public List<PieDataDto> selectXlxxGyZyResult();
}
