package org.dimigo.collection;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 26.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class MelonChart {

	private static final String APP_KEY = "4ce8bb31-9934-376b-8a64-0b5922ad9f71";
	private static final String MELON_OPEN_URL = "http://apis.skplanetx.com/melon/charts/realtime?";	
	private static final String QUERY_STRING = "count=10&page=1&version=1";
	
	public static void main(String[] args) {		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
	    try {
	    	HttpGet httpget = new HttpGet(MELON_OPEN_URL + QUERY_STRING);
	        
	        httpget.setHeader("appKey", APP_KEY);
	        
	        System.out.println("Executing request : " + httpget.getRequestLine());

	        // Create a custom response handler
	        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
	            @Override
	            public String handleResponse(
	                    final HttpResponse response) throws ClientProtocolException, IOException {
	                int status = response.getStatusLine().getStatusCode();
	                if (status >= 200 && status < 300) {
	                    HttpEntity entity = response.getEntity();
	                    return entity != null ? EntityUtils.toString(entity) : null;
	                } else {
	                    throw new ClientProtocolException("Unexpected response status: " + status);
	                }
	            }

	        };
	        
	        String responseBody = httpclient.execute(httpget, responseHandler);
	        System.out.println("------------------------------------------------");
	        System.out.println(responseBody);
	        
	        Melon melon = MelonChartJSONParser.parse(responseBody);
	        System.out.println(melon);
	        int i=1;
	        for(Song song : melon.getSongs()){
	        	System.out.println(i+". "+song.getSongName()+" - ");
	        	i++;
	        }
	        
	        
	    } catch (IOException e) {
			e.printStackTrace();
		} finally {
	        try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

	}

}
