package app;

import db.Connection;

public class App {
	public static void main(String[] args) {
		Connection connection = Connection.getInstance();
		Connection connection1 = Connection.getInstance();
		System.out.println(connection);
		System.out.println(connection1);
	}
}
