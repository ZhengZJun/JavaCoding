package zzj.Servlet;

import zzj.model.Article;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 1.发送articleList路径http请求
 * 2.tomcat接收http请求，根据路径找到servlet
 * 3.根据当前的servlet，调用service方法
 * 4.service方法中调用子类（BaseServlet）重写的doGet和doPost方法
 * 5.doGet/doPost调用ArticleListServlet的process
 */

@WebServlet("/articleList")
public class ArticleListServlet extends BaseServlet {
    @Override
    public Object process(HttpServletRequest req) throws Exception {
        Integer id = Integer.parseInt(req.getParameter("id"));
        List<Article>
        return new ArrayList<>();
    }
}
