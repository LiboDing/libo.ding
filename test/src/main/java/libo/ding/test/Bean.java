package libo.ding.test;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author libo.ding
 * @since 2016-03-04
 */
public class Bean {

    private Date date;
    private java.sql.Date dateSql;
    private Timestamp timestamp;
    private Time time;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public java.sql.Date getDateSql() {
        return dateSql;
    }

    public void setDateSql(java.sql.Date dateSql) {
        this.dateSql = dateSql;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
