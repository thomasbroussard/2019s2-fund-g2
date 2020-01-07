package fr.epita.quiz.tests;

import java.util.Arrays;

import fr.epita.quiz.datamodel.MCQQuestion;

public class TestMCQQuestionSerialization {

	private static final String TOPIC_DELIMITER = "|||";
	private static final String COLUMN_DELIMITER = "@@@@";

	public static void main(String[] args) {
		MCQQuestion mcqQuestion = new MCQQuestion();
		mcqQuestion.setDifficulty(3);
		mcqQuestion.setQuestion("What can we do with JDK?");
		mcqQuestion.setTopics(new String[] { "java", "compilation", "environments" });
		mcqQuestion.setId(1l);

		// formatting to csv
		// id;difficulty;question_content;topic1|topic2|topic3
		String formatted = String.valueOf(mcqQuestion.getId()) + COLUMN_DELIMITER;
		formatted += String.valueOf(mcqQuestion.getDifficulty()) + COLUMN_DELIMITER;
		formatted += mcqQuestion.getQuestion() + COLUMN_DELIMITER;
		String[] topics = mcqQuestion.getTopics();
		for (int i = 0; i < topics.length; i++) {
			formatted += topics[i] + TOPIC_DELIMITER;
		}
		System.out.println("formatted");
		System.out.println(formatted);

		// reconstruction phase

		String[] parts = formatted.split(COLUMN_DELIMITER);
		System.out.println(Arrays.asList(parts));
		Long id = Long.valueOf(parts[0]);
		Integer difficulty = Integer.valueOf(parts[1]);
		String question = parts[2];
		String[] readTopics = parts[3].split(TOPIC_DELIMITER);

		MCQQuestion reconstructed = new MCQQuestion();
		reconstructed.setDifficulty(difficulty);
		reconstructed.setId(id);
		reconstructed.setQuestion(question);
		reconstructed.setTopics(readTopics);
	}

}
