package com.oop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Video;
import com.oop.service.VideoServiceImpl;

/**
 * Servlet implementation class UpdateVideo
 */
@WebServlet("/UpdateVideo")
public class UpdateVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateVideo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Video video=new Video();
		video.setDvdId(request.getParameter("DvdId"));
		video.setDvdName(request.getParameter("DvdName"));
		video.setDvdPrice(Float.parseFloat(request.getParameter("DvdPrice")));
		
		VideoServiceImpl videoService=new VideoServiceImpl();
		videoService.updateVideo(video);
		
		response.sendRedirect("ModifyVideo.jsp");
	}

}
