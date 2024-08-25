package numo.common;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;
import java.util.Map;

public class ListUtil {

    static public Object getPolygonGeoArr(String str) {
        JSONParser jp = new JSONParser();
        int start = str.indexOf("(");

        String geoStr = str.substring(start);
        geoStr = geoStr.replaceAll(",", "],[").replaceAll("\\)\\],\\[\\(", "],[").replaceAll("\\(", "[").replaceAll("\\)", "]").replaceAll(" ", ",");
        JSONArray geoArr = new JSONArray();
        try {
            geoArr = (JSONArray) jp.parse(geoStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return geoArr;
    }

    static public List<Map<String, Object>> getPolygonGeoResult(List<Map<String, Object>> geoList, String geoC1, String geoC2){

        for(Map<String, Object> map : geoList) {
            if(map.get(geoC1) != null) {
                String str = map.get(geoC1).toString();
                map.put(geoC1, getPolygonGeoArr(str));

                int start = str.indexOf("(");
                map.put(geoC1+"_TYPE", str.substring(0, start));
            }
            if(map.get(geoC2) != null) {
                String str = map.get(geoC2).toString();
                map.put(geoC2, getPolygonGeoArr(str));

                int start = str.indexOf("(");
                map.put(geoC2+"_TYPE", str.substring(0, start));
            }
        }
        return geoList;
    }

    static public Object getLineStringGeoArr(String str) {
        JSONParser jp = new JSONParser();
        int start = str.indexOf("(");

        String geoStr = str.substring(start);
        geoStr = "(" + geoStr + ")";
        geoStr = geoStr.replaceAll(",", "],[").replaceAll("\\)\\],\\[\\(", "],[").replaceAll("\\(", "[").replaceAll("\\)", "]").replaceAll(" ", ",");
        JSONArray geoArr = new JSONArray();
        try {
            geoArr = (JSONArray) jp.parse(geoStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return geoArr;
    }

    static public List<Map<String, Object>> getLineStringGeoResult(List<Map<String, Object>> geoList, String geoC1){

        for(Map<String, Object> map : geoList) {
            if(map.get(geoC1) != null) {
                String str = map.get(geoC1).toString();
                map.put(geoC1, getLineStringGeoArr(str));

                int start = str.indexOf("(");
                map.put(geoC1+"_TYPE", str.substring(0, start));
            }
        }
        return geoList;
    }

    static public Object getPointGeoArr(String str) {
        JSONParser jp = new JSONParser();
        int start = str.indexOf("(");

        String geoStr = str.substring(start);
        geoStr = "(" + geoStr + ")";
        geoStr = geoStr.replaceAll(",", "],[").replaceAll("\\)\\],\\[\\(", "],[").replaceAll("\\(", "[").replaceAll("\\)", "]").replaceAll(" ", ",");
        JSONArray geoArr = new JSONArray();
        try {
            geoArr = (JSONArray) jp.parse(geoStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return geoArr;
    }

    static public List<Map<String, Object>> getPointGeoResult(List<Map<String, Object>> geoList, String geoC1){

        for(Map<String, Object> map : geoList) {
            if(map.get(geoC1) != null) {
                String str = map.get(geoC1).toString();
                map.put(geoC1, getPointGeoArr(str));

                int start = str.indexOf("(");
                map.put(geoC1+"_TYPE", str.substring(0, start));
            }
        }
        return geoList;
    }
}
