package fr.epita.quiz.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import fr.epita.quiz.datamodel.MCQQuestion;
import fr.epita.quiz.services.MCQQuestionJDBCDAO;

public class TestJDBC {

	public static void main(String[] args) throws SQLException {
		// testConnection();

		// testCreate();

		// given
		Connection connection = getConnection();
		connection.prepareStatement(
				"CREATE TABLE MCQQUESTIONS(ID INT AUTO_INCREMENT PRIMARY KEY,   QUESTION VARCHAR(500), DIFFICULTY INT)")
				.execute();

		MCQQuestion question = new MCQQuestion();
		question.setDifficulty(3);
		question.setQuestion("What is CSV?");

		MCQQuestionJDBCDAO dao = new MCQQuestionJDBCDAO();
		dao.create(question);

		// when
		List<MCQQuestion> resultList = dao.search("CSV", 4);
		// then
		boolean success = resultList.size() == 1;
		System.out.println(resultList);
		System.out.println("Success? : " + success);

	}

	private static void testCreate() throws SQLException {
		// given
		Connection connection = getConnection();
		connection.prepareStatement(
				"CREATE TABLE MCQQUESTIONS(ID INT AUTO_INCREMENT PRIMARY KEY,   QUESTION VARCHAR(500), DIFFICULTY INT)")
				.execute();

		MCQQuestion question = new MCQQuestion();
		question.setDifficulty(3);
		question.setQuestion("What is CSV?");

		MCQQuestionJDBCDAO dao = new MCQQuestionJDBCDAO();

		// when
		int id = dao.create(question);

		// then
		boolean success = id != 0;

		System.out.println("Success ? " + success);
	}

	private static void testConnection() throws SQLException {
		// given
		Connection connection = getConnection();

		// when
		String schema = connection.getSchema();

		// then
		boolean success = "PUBLIC".equals(schema);

		System.out.println("Success ? " + success);
		connection.close();
	}

	private static Connection getConnection() throws SQLException {
		// to connect to the database you need 4 information :
		// the url :
		String url = "jdbc:h2:mem:test2";

		// the user :
		String user = "test";

		// the password:
		String password = "test";

		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

}
