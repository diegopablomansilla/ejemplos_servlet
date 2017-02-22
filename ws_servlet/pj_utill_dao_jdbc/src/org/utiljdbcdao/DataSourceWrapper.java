package org.utiljdbcdao;

import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.utiljdbcdao.ex.ExGetConnection;
import org.utiljdbcdao.ex.ExMetaDataDbCloseConnection;
import org.utiljdbcdao.ex.ExMetaDataDbDao;

public class DataSourceWrapper {

	private DataSource dataSource;

	private DataSourceMetaData dataSourceMetaData;

	public DataSourceWrapper(Properties properties) {

		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setDriverClassName(properties.getProperty("jdbc.model.driverClassName"));

		dataSource.setUrl(properties.getProperty("jdbc.model.url"));

		dataSource.setUsername(properties.getProperty("jdbc.model.username"));

		dataSource.setPassword(properties.getProperty("jdbc.model.password"));

		dataSource.setInitialSize(new Integer(properties.getProperty("jdbc.model.InitialSize")));

		dataSource.setMaxActive(new Integer(properties.getProperty("jdbc.model.MaxActive")));

		init(dataSource);
	}

	public DataSourceWrapper(DataSource dataSource) {
		init(dataSource);
	}

	private void init(DataSource dataSource) {
		this.dataSource = dataSource;

		Connection connection = null;
		try {
			connection = dataSource.getConnection();

			dataSourceMetaData = new DataSourceMetaData();

			dataSourceMetaData.url = connection.getMetaData().getURL();
			dataSourceMetaData.userName = connection.getMetaData().getUserName();
			dataSourceMetaData.databaseProductName = connection.getMetaData().getDatabaseProductName();
			dataSourceMetaData.databaseProductVersion = connection.getMetaData().getDatabaseProductVersion();
			dataSourceMetaData.driverName = connection.getMetaData().getDriverName();
			dataSourceMetaData.driverVersion = connection.getMetaData().getDriverVersion();
			dataSourceMetaData.jDBCMajorVersion = connection.getMetaData().getJDBCMajorVersion();
			dataSourceMetaData.jDBCMinorVersion = connection.getMetaData().getJDBCMinorVersion();

			try {
				connection.close();
			} catch (Exception e) {
				ExMetaDataDbCloseConnection exMetaDataDbCloseConnection = new ExMetaDataDbCloseConnection(this.getClass(), e);
				exMetaDataDbCloseConnection.setFirstTrace(e, this.getClass());
				throw exMetaDataDbCloseConnection;
			}
		} catch (Exception e) {
			ExMetaDataDbDao exMetaDataDb = new ExMetaDataDbDao(this.getClass(), e);
			exMetaDataDb.setFirstTrace(e, this.getClass());
			throw exMetaDataDb;
		}
	}

	public String getUrl() {
		return dataSourceMetaData.url;
	}

	public String getUserName() {
		return dataSourceMetaData.userName;
	}

	public String getDatabaseProductName() {
		return dataSourceMetaData.databaseProductName;
	}

	public String getDatabaseProductVersion() {
		return dataSourceMetaData.databaseProductVersion;
	}

	public String getDriverName() {
		return dataSourceMetaData.driverName;
	}

	public String getDriverVersion() {
		return dataSourceMetaData.driverVersion;
	}

	public int getjDBCMajorVersion() {
		return dataSourceMetaData.jDBCMajorVersion;
	}

	public int getjDBCMinorVersion() {
		return dataSourceMetaData.jDBCMinorVersion;
	}

	public synchronized ConnectionWrapper getConnectionWrapper() {

		try {
			return new ConnectionWrapper(dataSource.getConnection(), dataSourceMetaData);
		} catch (Exception e) {
			ExGetConnection ex = new ExGetConnection(this.getClass(), e, new ConnectionWrapper(null, dataSourceMetaData));

			ex.setFirstTrace(e, this.getClass());

			throw ex;
		}

	}

}
