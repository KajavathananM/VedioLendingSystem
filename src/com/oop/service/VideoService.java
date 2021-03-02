package com.oop.service;

import com.oop.model.Video;

public interface VideoService {
	public void addVideo(Video video);
	public void deleteVideo(Video video);
	public void updateVideo(Video video);
	public Video searchVideo(String msg);
}
