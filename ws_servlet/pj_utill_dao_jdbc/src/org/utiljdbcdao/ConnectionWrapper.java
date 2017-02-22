package org.utiljdbcdao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.utiljdbcdao.ex.ExBeginDao;
import org.utiljdbcdao.ex.ExCloseConnection;
import org.utiljdbcdao.ex.ExCommitDao;
import org.utiljdbcdao.ex.ExRollBackDao;

public class ConnectionWrapper {

	private Connection connection;
	private DataSourceMetaData dataSourceMetaData;
	private List<String> sqlList = new ArrayList<String>();

	public ConnectionWrapper(Connection connection,
			DataSourceMetaData dataSourceMetaData) {
		this.connection = connection;
		this.dataSourceMetaData = dataSourceMetaData;

	}

	public void add(String sql) {
		sqlList.add(sql);
	}
	
	public String getSql() {
		if(this.getSqlList() == null){
			return "unknown";
		}
		if (this.getSqlList().size() == 0) {
			return "unknown";
		}
		String r = "";
		for (String sql : this.getSqlList()) {
			r += "\n\t------------------------------------------------------------------------------------------";
			r += "\n\t" + sql;
		}

		return r;
	}


	public List<String> getSqlList() {
		return sqlList;
	}

	public Connection getConnection() throws SQLException {
		return connection;
	}
	
	public DataSourceMetaData getDataSourceMetaData(){
		return dataSourceMetaData;
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
	
	
	
	public void close(ConnectionWrapper connectionWrapper) {
		try {
			if (connectionWrapper.getConnection() != null
					& connectionWrapper.getConnection().isClosed() == false) {
				connectionWrapper.getConnection().close();
			}
			
			connectionWrapper.add("close();");
		} catch (SQLException e2) {
			ExCloseConnection ex2 = new ExCloseConnection(this.getClass(), e2,
					connectionWrapper);

			ex2.setFirstTrace(e2, this.getClass());

		}

	}

	public void begin(ConnectionWrapper connectionWrapper) {
		try {
			connectionWrapper.getConnection().setAutoCommit(false);
			connectionWrapper.add("begin();");
		} catch (Exception e) {

			ExBeginDao ex = new ExBeginDao(this.getClass(), e,
					connectionWrapper);

			ex.setFirstTrace(e, this.getClass());

			throw ex;
		}

	}

	public void commit(ConnectionWrapper connectionWrapper) {
		try {

			connectionWrapper.getConnection().commit();
			connectionWrapper.add("commit();");
			
			close(connectionWrapper);
		
		} catch (Exception e) {

			ExCommitDao ex = new ExCommitDao(this.getClass(), e,
					connectionWrapper);

			ex.setFirstTrace(e, this.getClass());

			throw ex;
		}

	}

	public void rollBack(ConnectionWrapper connectionWrapper) {
		try {

			connectionWrapper.getConnection().rollback();
			connectionWrapper.add("rollback();");
			
			close(connectionWrapper);
			
		} catch (Exception e) {

			ExRollBackDao ex = new ExRollBackDao(this.getClass(), e,
					connectionWrapper);

			ex.setFirstTrace(e, this.getClass());

			throw ex;
		}

	}

}
