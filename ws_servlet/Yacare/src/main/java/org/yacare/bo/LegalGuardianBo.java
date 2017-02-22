package org.yacare.bo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.utiljdbc.ConnectionWrapper;
import org.utiljdbc.DataSourceWrapper;
import org.yacare.model.academic.student.Student;
import org.yacare.model.person.Person;

public class LegalGuardianBo {

	private final String MSG_1 = "Error al levantar las propiedades de configuración.";
	private final String MSG_2 = "Error al tratar de obtener los datos del grupo familiar.";
	private final String MSG_3 = "No existe un grupo familiar en base al id de usuario ";
	private final String MSG_4 = "Error al tratar de obtener los datos del grupo familiar. Se esperaba un solo grupo familiar, y la consulta retorno ";
	private final String MSG_5 = "Error al tratar de obtener los datos del grupo familiar. Se esperaba que el responsable familiar tenga un id y la consulta retorno un valor null.";

	private String urlFiles; // URL de Repositorio de Archivos
	private Properties properties;
	private DataSourceWrapper dataSourceWrapper;

	public String getUrlFiles() {
		return urlFiles;
	}

	public void setUrlFiles(String urlFiles) {
		this.urlFiles = urlFiles;
	}

	public DataSourceWrapper getDataSourceWrapper() {
		return dataSourceWrapper;
	}

	public void setDataSourceWrapper(DataSourceWrapper dataSourceWrapper) {
		this.dataSourceWrapper = dataSourceWrapper;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void init() {

		if (dataSourceWrapper == null) {
			if (urlFiles == null) {
				urlFiles = "/home/java/Dropbox/dev/ws_servlet/Yacare/yacare_files/yacare.properties";
			}
			if (properties == null) {
				properties = new Properties();
			}
			try {
				properties.load(new FileInputStream(urlFiles));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException(MSG_1);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(MSG_1);
			}
			dataSourceWrapper = new DataSourceWrapper(properties);
		}

	}

//	public FamilyGroup getFamilyGroupByUserId(String userId) {
//		try {
//
//			FamilyGroup familyGroup = null;
//
//			ConnectionWrapper connectionWrapper = this.dataSourceWrapper.getConnectionWrapper();
//
//			String sql = "SELECT * FROM yacare.f_person_by_id(?);";
//			Person person = (Person) connectionWrapper.findToJsonById(sql, userId);
//
//			// String sql = "SELECT * FROM yacare.v_responsible_family where id = ?";
//
//			// FamilyGroup familyGroup = (FamilyGroup) connectionWrapper.findToJsonById(sql, userId);
//
//			// Object[][] table = connectionWrapper.findToTable(sql, userId);
//
//			// if (table == null) {
//			// throw new RuntimeException(MSG_3 + userId);
//			// }
//			//
//			// if (table.length == 0) {
//			// throw new RuntimeException(MSG_3 + userId);
//			// }
//			//
//			// if (table.length > 1) {
//			// throw new RuntimeException(MSG_4 + table.length + " grupos familiares, en base al id de usuario " + userId);
//			// }
//
//			// ============================================================
//
//			// familyGroup = new FamilyGroup();
//			//
//			// ResponsibleFamily responsibleFamily = new ResponsibleFamily();
//			//
//			// Person person = new Person();
//			// if (table[0][0] == null) {
//			// throw new RuntimeException(MSG_3);
//			// }
//			// person.setId(table[0][0].toString());
//			// if (table[0][1] == null) {
//			// person.setErased(false);
//			// } else if ((Boolean)table[0][1] == null) {
//			// person.setErased(false);
//			// }
//
//			// ============================================================
//
//			connectionWrapper.close();
//
//			return familyGroup;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new RuntimeException(MSG_2);
//		}
//	}

//	public Person getPersonById(String personId) {
//		try {
//
//			ConnectionWrapper connectionWrapper = this.dataSourceWrapper.getConnectionWrapper();
//
//			String sql = "SELECT * FROM yacare.f_person_by_id(?);";
//			Person person = (Person) connectionWrapper.findToJsonById(sql, Person.class, personId);			
//
//			connectionWrapper.close();
//
//			return person;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new RuntimeException(MSG_2);
//		}
//	}
	
	public Student getStudentById(String studentId) {
		try {

			ConnectionWrapper connectionWrapper = this.dataSourceWrapper.getConnectionWrapper();

			String sql = "SELECT * FROM yacare.f_student_by_id(?);";
			Student student = (Student) connectionWrapper.findToJsonById(sql, Student.class, studentId);			

			connectionWrapper.close();

			return student;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(MSG_2);
		}
	}

}
