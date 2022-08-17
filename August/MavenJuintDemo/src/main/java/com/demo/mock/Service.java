package com.demo.mock;

public class Service {
	private DataBase database;

	public Service(DataBase database) {
		super();
		this.database = database;
	}
	
	public boolean query(String query)
	{
		return database.isAvailable();
	}

	@Override
	public String toString() {
		return "Using database with id"+String.valueOf(database.getUniqueid());
	}
	
	
	
	
	
	}
