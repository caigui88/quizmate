package service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import com.quizmate.question.model.dto.questionBankQuestion.QuestionBankQuestionQueryRequest;
import com.quizmate.question.model.entity.QuestionBankQuestion;
import com.quizmate.question.model.vo.QuestionBankQuestionVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题库题目关联表服务
 *

 */
public interface QuestionBankQuestionService extends IService<QuestionBankQuestion> {

    /**
     * 校验数据
     *
     * @param questionBankQuestion
     * @param add 对创建的数据进行校验
     */
    void validQuestionBankQuestion(QuestionBankQuestion questionBankQuestion, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQuestionQueryRequest
     * @return
     */
    QueryWrapper<QuestionBankQuestion> getQueryWrapper(QuestionBankQuestionQueryRequest questionBankQuestionQueryRequest);
    
    /**
     * 获取题库题目关联表封装
     *
     * @param questionBankQuestion
     * @param request
     * @return
     */
    QuestionBankQuestionVO getQuestionBankQuestionVO(QuestionBankQuestion questionBankQuestion, HttpServletRequest request);

    /**
     * 分页获取题库题目关联表封装
     *
     * @param questionBankQuestionPage
     * @param request
     * @return
     */
    Page<QuestionBankQuestionVO> getQuestionBankQuestionVOPage(Page<QuestionBankQuestion> questionBankQuestionPage, HttpServletRequest request);

    /**
     * 批量向题库添加题目
     * @param questionIdList
     * @param questionBankId
     * @param loginUser
     * @return 出现问题会抛出异常，不出问题就是成功插入
     */
    void batchAddQuestionToBank(List<Long> questionIdList, long questionBankId, User loginUser);

    @Transactional(rollbackFor = Exception.class)
    void batchAddQuestionsToBankInner(List<QuestionBankQuestion> questionBankQuestions);

    @Transactional(rollbackFor = Exception.class)
    void batchAddQuestionsToBankInnerBatch(List<QuestionBankQuestion> questionBankQuestions);

    /**
     * 批量从题库移除题目
     * @param questionIdList
     * @param questionBankId
     */
    void batchRemoveQuestionsFromBank(List<Long> questionIdList,Long questionBankId);


}
