/**
 * 
 */
package org.dimigo.collection;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ JSONTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 12.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class JSONTest {

	private static final String FILE_PATH = "C:/Users/Skyclad Observer/git/JavaPractice/JavaClass/src/org/dimigo/collection/json_input.txt";
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
					
			String result;
			StringBuilder jsonString = new StringBuilder();
					
			// 1 라인씩 읽어오기 	
			while((result = br.readLine()) != null) {
				jsonString.append(result);
			}
			
			System.out.println(jsonString);
			
			// JSON String을 Parsing하여 Person 객체에 담기
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString.toString());
			
			Person person = new Person();
			person.setName((String)jsonObject.get("name"));
			person.setAge(Integer.parseInt((String)jsonObject.get("age")));
			
			person.setSido((String)((JSONObject)jsonObject.get("address")).get("sido"));
			person.setDong((String)((JSONObject)jsonObject.get("address")).get("dong"));
			person.setDetailAddress((String)((JSONObject)jsonObject.get("address")).get("detailAddress"));
			
			JSONArray phoneNumbers = (JSONArray)jsonObject.get("phoneNumbers");
			int size = phoneNumbers.size();
			List<Phone> phoneList = new ArrayList<>();
			for(int i=0; i<size; i++){
				JSONObject phoneObj = (JSONObject)phoneNumbers.get(i);
				Phone phone = new Phone();
				phone.setType((String)phoneObj.get("type"));
				phone.setNumber((String)phoneObj.get("number"));
				phoneList.add(phone);
			}
			
			person.setPhoneNumbers(phoneList);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
