package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.dto.ScoreDTO;
import com.ruoyi.system.domain.vo.ScoreVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ScoreMapper;
import com.ruoyi.system.domain.Score;
import com.ruoyi.system.service.IScoreService;

/**
 * scoreService业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-02
 */
@Service
public class ScoreServiceImpl implements IScoreService 
{
    @Autowired
    private ScoreMapper scoreMapper;

    /**
     * 查询score
     * 
     * @param id score主键
     * @return score
     */
    @Override
    public Score selectScoreById(Long itemId)
    {
        return scoreMapper.selectScoreById(itemId);
    }

    /**
     * 查询score列表
     * 
     * @param scoreDTO score
     * @return score
     */
    @Override
    public List<ScoreVO> selectScoreList(ScoreDTO scoreDTO)
    {

        List<ScoreVO> scores = scoreMapper.selectScoreList(scoreDTO);

        return scores;
    }

    /**
     * 新增score
     * 
     * @param score score
     * @return 结果
     */
    @Override
    public int insertScore(Score score)
    {
        score.setCreateTime(DateUtils.getNowDate());
        return scoreMapper.insertScore(score);
    }

    /**
     * 修改score
     * 
     * @param score score
     * @return 结果
     */
    @Override
    public int updateScore(Score score)
    {
        return scoreMapper.updateScore(score);
    }

    /**
     * 批量删除score
     * 
     * @param ids 需要删除的score主键
     * @return 结果
     */
    @Override
    public int deleteScoreByIds(Long[] ids)
    {
        return scoreMapper.deleteScoreByIds(ids);
    }

    /**
     * 删除score信息
     * 
     * @param id score主键
     * @return 结果
     */
    @Override
    public int deleteScoreById(Long id)
    {
        return scoreMapper.deleteScoreById(id);
    }
}
