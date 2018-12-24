package com.mass.RentMeHome.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {

	public byte[] getImage(String id) throws IOException {
        final InputStream in = getClass().getResourceAsStream("/static/images/"+id);
        return IOUtils.toByteArray(in);
    }
	
	public ResponseEntity<Object> uploadFile( MultipartFile file) throws IOException {
		File convertFile = new File(new File("").getAbsolutePath() + "\\src\\main\\resources\\static\\images\\"+file.getOriginalFilename());
		convertFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(convertFile);
		fout.write(file.getBytes());
		fout.close();		
		return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
	}
}
