package zzj.dao;

import zzj.model.Article;
import zzj.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class ArticleDAO {

    //文章添加操作
    public static boolean addArticle(Article article) {
        //jdbc操作流程
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            connection = DBUtil.getConnection();
            String sql = "insert into article(title, content, user_id,create_time) "+
                    "value (?,?,?,?)";
            ps = connection.prepareStatement(sql);
            //替换占位符
            ps.setString(1,article.getTitle());
            ps.setString(2,article.getContent());
            ps.setInt(3,article.getUserId());
            ps.setTimestamp(4,
                    new Timestamp(new java.util.Date().getTime()));

            int num = ps.executeUpdate();
            return num>0;
        } catch (Exception e){
            throw new RuntimeException("文章添加失败：",e);
        } finally{
            DBUtil.close(connection,ps);
        }
    }
}
