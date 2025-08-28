package com.quizmate.question.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.quizmate.question.model.entity.QuestionViews;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionViewsMapper extends BaseMapper<QuestionViews> {
}