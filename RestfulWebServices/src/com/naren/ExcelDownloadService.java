package com.naren;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
 
/**
 *  Downloading the excel file - /excel/get
 *  http://localhost:8081/RestfulWebSer/rest/excel/get
 *  
 * @author Joshi
 *
 */
@Path("/excel")
public class ExcelDownloadService {
 
	private static final String FILE_PATH = "D:\\RestTest\\TestExcel.xls";
 
	@GET
	@Path("/get")
	@Produces("application/vnd.ms-excel")
	public Response getFile() {
 
		File file = new File(FILE_PATH);
 
		ResponseBuilder response = Response.ok((Object) file);
		
		response.header("Content-Disposition",
			"attachment; filename=new-excel-file.xls");
		return response.build();
 
	}
 
}