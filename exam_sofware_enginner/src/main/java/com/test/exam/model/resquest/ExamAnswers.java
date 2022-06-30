package com.test.exam.model.resquest;

import java.io.Serializable;
import java.util.List;

public class ExamAnswers implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<AnswerSelect> answers;

    public List<AnswerSelect> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerSelect> answers) {
        this.answers = answers;
    }
}
