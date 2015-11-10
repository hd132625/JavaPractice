package org.dimigo.collection;



import java.util.ArrayList;
import java.util.List;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MelonChartJSONParser {
	
	@SuppressWarnings("finally")
	public static Melon parse(String jsonString){
		Melon melon = new Melon();
		try{
			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject)parser.parse(jsonString);
			JSONObject json_melon = (JSONObject)json.get("melon");
			JSONObject songs = (JSONObject)json_melon.get("songs");
			JSONArray song = (JSONArray)songs.get("song");
			List<Song> list = new ArrayList<>();
			for(int i=0; i<song.size(); i++){
				Song newSong = new Song();
				JSONObject tmp = (JSONObject)song.get(i);
				newSong.setSongId((long)tmp.get("songId"));
				newSong.setSongName((String)tmp.get("songName"));
				/*newSong.setAlbumId(((Song)song.get(i)).getAlbumId());
				newSong.setAlbumName(((Song)song.get(i)).getAlbumName());
				newSong.setCurrentRank(((Song)song.get(i)).getCurrentRank());
				newSong.setPastRank((((Song)song.get(i)).getPastRank()));
				newSong.setPlayTime((((Song)song.get(i)).getPlayTime()));
				newSong.setIssueDate((((Song)song.get(i)).getIssueDate()));*/
				list.add(newSong);
			}
			melon.setSongs(list);
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
		finally
		{
			return melon;
		}
	}

}
