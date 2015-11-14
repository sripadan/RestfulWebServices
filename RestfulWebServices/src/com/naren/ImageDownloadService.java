package com.naren;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
 

/**
 *  Downloading the log file - /excel/get
 *  http://localhost:8081/RestfulWebSer/rest/image/get
 *  
 * @author Joshi
 *
 */

@Path("/image")
public class ImageDownloadService {
 
	private static final String FILE_PATH = "D:\\RestTest\\Testing.JPEG";
 
	@GET
	@Path("/get")
	@Produces("image/jpeg")
	public Response getFile() {
 
		File file = new File(FILE_PATH);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=image_from_server.jpeg");
		return response.build();
 
	}
 
}