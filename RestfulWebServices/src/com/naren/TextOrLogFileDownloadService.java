package com.naren;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 *  Downloading the log file - /excel/get
 *  http://localhost:8081/RestfulWebSer/rest/file/get
 *  
 * @author Joshi
 *
 */

@Path("/file")
public class TextOrLogFileDownloadService {
 
	private static final String FILE_PATH = "D:\\RestTest\\TestLog.log";
 
	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response getFile() {
 
		File file = new File(FILE_PATH);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=\"file_from_server.log\"");
		return response.build();
 
	}
 
	
}