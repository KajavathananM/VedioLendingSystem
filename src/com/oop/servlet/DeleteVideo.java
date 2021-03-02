package com.oop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Video;
import com.oop.service.VideoServiceImpl;

@WebServlet("/DeleteVideo")
public class DeleteVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteVideo() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Video video=new Video();
		video.setDvdId(request.getParameter("videoId"));
		
		VideoServiceImpl videoService=new VideoServiceImpl();
		videoService.deleteVideo(video);
	
		response.sendRedirect("ModifyVideo.jsp");
	}

}
