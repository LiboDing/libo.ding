package libo.ding.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author libo.ding
 * @since 2016-03-04
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Bean bean = new Bean();
        bean.setDate(new Date(System.currentTimeMillis()));
        bean.setDateSql(new java.sql.Date(System.currentTimeMillis()));
        bean.setTimestamp(new Timestamp(System.currentTimeMillis()));
        bean.setTime(new Time(System.currentTimeMillis()));

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(bean);
        System.out.println(json);

        json = "{\"date\":1457083805342,\"dateSql\":\"2016-03-04\",\"timestamp\":1457083805344,\"time\":\"17:30:05\"}";
        bean = mapper.readValue(json, Bean.class);

        System.out.println(bean);

    }
}
