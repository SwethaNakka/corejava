package com.tns.jdbccrud;

import java.sql.SQLException;

import com.tns.jdbccrud.service.Service;

public class Client {

	public static void main(String[] args) throws SQLException {
		Service service=new Service();
		service.addStudent();
        //service.getStudents();
       //service.updateStudent();
      // service.deleteStudent();
		//service.storedProcedure();
        //service.closeSession();
	}

}
