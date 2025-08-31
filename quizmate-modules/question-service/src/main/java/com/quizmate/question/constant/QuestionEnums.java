package com.quizmate.question.constant;

/**
 * @author moru
 * @since 2025/8/27 23:16
 * @Description TODO
 */
public enum QuestionEnums {

    DIFFICULTY_EASY(1, "简单"),
    DIFFICULTY_MEDIUM(2, "中等"),
    DIFFICULTY_HARD(3, "困难");

    private final int value;
    private final String description;

    QuestionEnums(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
