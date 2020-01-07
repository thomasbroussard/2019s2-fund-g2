package fr.epita.quiz.tests;

import java.util.List;

import fr.epita.quiz.datamodel.MCQQuestion;
import fr.epita.quiz.datamodel.MCQQuestionCSVDAO;

public class TestMCQQuestionCSVDAO {

	public static void main(String[] args) {
		MCQQuestionCSVDAO dao = new MCQQuestionCSVDAO();

		MCQQuestion mcqQuestion = new MCQQuestion();
		mcqQuestion.setDifficulty(3);
		mcqQuestion.setQuestion("What can we do with JDK?");
		mcqQuestion.setTopics(new String[] { "java", "compilation", "environments" });
		mcqQuestion.setId(1l);

		dao.create(mcqQuestion);

		List<MCQQuestion> allQuestions = dao.readAll();
	}

}
