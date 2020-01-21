package fr.epita.quiz.tests;

import fr.epita.quiz.datamodel.MCQQuestion;
import fr.epita.quiz.services.MCQQuestionCSVDAO;

public class TestMCQQuestionCSVDAO {

	public static void main(String[] args) {
		// given
		MCQQuestionCSVDAO dao = new MCQQuestionCSVDAO();

		MCQQuestion mcqQuestion = new MCQQuestion();
		mcqQuestion.setDifficulty(3);
		mcqQuestion.setQuestion("What can we do with JDK?");
		mcqQuestion.setTopics(new String[] { "java", "compilation", "environments" });
		mcqQuestion.setId(1l);
		MCQQuestion mcqQuestion2 = new MCQQuestion();
		mcqQuestion2.setDifficulty(3);
		mcqQuestion2.setQuestion("What is CSV?");
		mcqQuestion2.setTopics(new String[] { "csv", "file", "data" });
		mcqQuestion2.setId(2l);

		// when
		dao.create(mcqQuestion);
		dao.create(mcqQuestion2);

		// then
		MCQQuestion readQuestion = dao.getById(1);
		boolean success = readQuestion.getId().equals(mcqQuestion.getId());
		System.out.println("success? " + success);
	}

}
