package fr.epita.quiz.datamodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MCQQuestionCSVDAO {

	private static final String TOPIC_DELIMITER = "|||";
	private static final String COLUMN_DELIMITER = "@@@@";

	public void create(MCQQuestion mcqQuestion) {
		String formatted = String.valueOf(mcqQuestion.getId()) + COLUMN_DELIMITER;
		formatted += String.valueOf(mcqQuestion.getDifficulty()) + COLUMN_DELIMITER;
		formatted += mcqQuestion.getQuestion() + COLUMN_DELIMITER;
		String[] topics = mcqQuestion.getTopics();
		for (int i = 0; i < topics.length; i++) {
			formatted += topics[i] + TOPIC_DELIMITER;
		}
		System.out.println("formatted");
		System.out.println(formatted);

		// TODO write the formatted string in a file

	}

	public List<MCQQuestion> readAll() {

		List<MCQQuestion> results = new ArrayList<MCQQuestion>();
		// TODO read all the "line" values from the file

		String[] parts = line.split(COLUMN_DELIMITER);
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

		return results;
	}

}
