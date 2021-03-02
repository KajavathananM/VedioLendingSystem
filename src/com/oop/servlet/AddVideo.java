package com.oop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Video;
import com.oop.service.VideoServiceImpl;


@WebServlet("/AddVideo")
public class AddVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddVideo() {
    	super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		Video video  = new Video();
		video.setDvdId(request.getParameter("DvdId"));
		video.setDvdName(request.getParameter("DvdName"));
		video.setDvdPrice(Float.parseFloat(request.getParameter("DvdPrice")));

		VideoServiceImpl videoService = new VideoServiceImpl();
		videoService.addVideo(video);
		
		response.sendRedirect("ModifyVideo.jsp");
	}

}
