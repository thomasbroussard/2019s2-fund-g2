package fr.epita.quiz.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.epita.quiz.datamodel.MCQQuestion;

public class MCQQuestionJDBCDAO {

	public int create(MCQQuestion mcqQuestion) {

		PreparedStatement preparedStatement;
		try (Connection connection = getConnection()) {
			preparedStatement = connection
					.prepareStatement("INSERT INTO MCQQUESTIONS (QUESTION, DIFFICULTY) VALUES (?, ?)");
			preparedStatement.setString(1, mcqQuestion.getQuestion());
			preparedStatement.setInt(2, mcqQuestion.getDifficulty());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public List<MCQQuestion> search(String contentInQuestion, int searchedDifficulty) {

		try (Connection connection = getConnection()) {
			PreparedStatement prepareStatement = connection
					.prepareStatement("SELECT ID, QUESTION, DIFFICULTY FROM MCQQUESTIONS\r\n" + "WHERE "
							+ "	QUESTION LIKE ?" + "	AND DIFFICULTY < ?");
			prepareStatement.setString(1, "%" + contentInQuestion + "%");
			prepareStatement.setInt(2, searchedDifficulty);
			ResultSet result = prepareStatement.executeQuery();
			List<MCQQuestion> resultList = new ArrayList<>();
			while (result.next()) {
				int difficulty = result.getInt("DIFFICULTY");
				int id = result.getInt("ID");
				String content = result.getString("QUESTION");
				MCQQuestion currentQuestion = new MCQQuestion();
				currentQuestion.setDifficulty(difficulty);
				currentQuestion.setId(Long.valueOf(id));
				currentQuestion.setQuestion(content);
				resultList.add(currentQuestion);

			}
			return resultList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<>();

	}

	private static Connection getConnection() throws SQLException {
		// to connect to the database you need 4 information :
		// the url : TODO : change hardcoded values by values from the configuration
		// file
		String url = "jdbc:h2:mem:test2";

		// the user :
		String user = "test";

		// the password:
		String password = "test";

		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

}
