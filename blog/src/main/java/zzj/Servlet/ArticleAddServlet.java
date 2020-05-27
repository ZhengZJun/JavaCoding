package zzj.Servlet;

import zzj.dao.ArticleDAO;
import zzj.model.Article;
import zzj.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

// 注意：路径要/开头 且和前端相同
@WebServlet("/articleAdd")
public class ArticleAddServlet extends BaseServlet {

    @Override
    public Object process(HttpServletRequest req)throws Exception{
        Article article = JSONUtil.deserialize(req.getInputStream(), Article.class);
        article.setUserId(1);
        System.out.println("请求数据" + article);
        if(!ArticleDAO.addArticle(article)){
            throw new RuntimeException("文章添加失败");
        }
        return null;
    }
}
