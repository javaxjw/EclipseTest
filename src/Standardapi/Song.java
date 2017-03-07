package Standardapi;

import java.io.Serializable;

/**
 * 歌曲类
 * @author KayWen
 *
 */

public class Song implements Serializable{
	
	private static final long serialVersionUID = -4378519611415205255L;
	
	private String songName;
	private String artist;
	private String time;
	
	public Song() {
		// TODO 自动生成的构造函数存根
	}

	public Song(String songName, String artist, String time) {

		this.songName = songName;
		this.artist = artist;
		this.time = time;
	}
	
	public Song(String songName){
		this.songName= songName;
	}
	
	public void play(){
		System.out.println("歌曲播放中！");
	}
	
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		
		return "[" + "songName:" + songName + ", artist:" + artist + " , time:" + time + "]";
	}
	
//	@Override
//	public int compareTo(Song s) {
//		
//		
//		return songName.length() > s.getSongName().length() ? 1 : songName.length() == s.getSongName().length() ? 0: -1;
//	}
//	
}
