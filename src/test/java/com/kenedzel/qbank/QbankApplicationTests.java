package com.kenedzel.qbank;

import com.kenedzel.qbank.model.Answer;
import com.kenedzel.qbank.model.Question;
import com.kenedzel.qbank.service.impl.QuestionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class QbankApplicationTests {

	@Mock
	private QuestionServiceImpl questionService;

	@Autowired
	protected MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	protected void mockSaveQuestion() {
		Mockito.doNothing().when(questionService.save(any()));
	}

	private Question mockExpectedQuestion() {
		Answer answer1 = new Answer();
		answer1.setAnswer("ayyyy1");
		answer1.setIsAnswer("false");

		Answer answer2 = new Answer();
		answer2.setAnswer("ayyyy2");
		answer2.setIsAnswer("false");

		Answer answer3 = new Answer();
		answer3.setAnswer("ayyyy3");
		answer3.setIsAnswer("false");

		Answer answer4 = new Answer();
		answer4.setAnswer("ayyyy4");
		answer4.setIsAnswer("false");

		List<Answer> answerList = new ArrayList<>();

		answerList.add(answer1);
		answerList.add(answer2);
		answerList.add(answer3);
		answerList.add(answer4);

		Question question = new Question();
		question.setCategory("Computer");
		question.setType("Basic");
		question.set_id("10");
		question.setQuestion("Dafuq?");
		question.setAnswerList(answerList);

		return question;
	}

}
