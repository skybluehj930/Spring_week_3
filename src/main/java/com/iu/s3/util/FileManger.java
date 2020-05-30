package com.iu.s3.util;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManger {
	//2. MultipartFile에서 제공하는 메서드 사용
	public String saveByTransfer(MultipartFile file, String realPath)throws Exception{
		String fileName="";
		
		File f = new File(realPath);
		if(!f.exists()) {
			f.mkdirs();
		}
		
		fileName = UUID.randomUUID().toString();
		fileName = fileName+"_"+file.getOriginalFilename();
		
		f= new File(f, fileName);
		
		file.transferTo(f);
		
		return fileName;
	}
	
	//1. Spring에서 제공하는 FileCopyUtils 클래스의 메서드 사용
	public String save(MultipartFile file, String realPath)throws Exception{
		String fileName="";
		
		//1. 파일을 저장할 폴더 작업
		File f = new File(realPath);
		if(!f.exists()) {
			f.mkdirs();
		}
		
		//2. 저장할 파일 명 생성
		//1) 시간
		//2) unique 클래스 생성
		fileName = UUID.randomUUID().toString();
		
		fileName = fileName+"_"+file.getOriginalFilename();
		
		System.out.println("fileName : "+fileName);
		
		
		//3. 폴더에 파일을 저장
		f = new File(f, fileName);
		FileCopyUtils.copy(file.getBytes(), f);
		
		return fileName;
	}
	
	
	

}
