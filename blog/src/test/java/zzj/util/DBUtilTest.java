package zzj.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

public class DBUtilTest {
    @Test
    public void testConnection(){
        Assert.assertNotNull(DBUtil.getConnection());
    //    Connection connection = DBUtil.getConnection();
    //    Assert.assertNotNull(connection);
    }
}
