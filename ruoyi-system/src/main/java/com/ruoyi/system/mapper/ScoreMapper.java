package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Score;
import com.ruoyi.system.domain.dto.ScoreDTO;
import com.ruoyi.system.domain.vo.ScoreVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * scoreMapper接口
 * 
 * @author ruoyi
 * @date 2024-06-02
 */
public interface ScoreMapper 
{
    /**
     * 查询score
     * 
     * @param id score主键
     * @return score
     */
    public Score selectScoreById(Long itemId);

    /**
     * 查询score列表
     * 
     * @param scoreDTO score
     * @return score集合
     */
    public List<ScoreVO> selectScoreList(ScoreDTO scoreDTO);

    /**
     * 新增score
     * 
     * @param score score
     * @return 结果
     */
    public int insertScore(Score score);

    /**
     * 修改score
     * 
     * @param score score
     * @return 结果
     */
    public int updateScore(Score score);

    /**
     * 删除score
     * 
     * @param id score主键
     * @return 结果
     */
    public int deleteScoreById(Long id);

    /**
     * 批量删除score
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScoreByIds(Long[] ids);
}
