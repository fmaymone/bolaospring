package com.bolao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ArticleService implements IArticleService {
	@Autowired
	private IArticleDAO articleDAO;
	@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}	
	@Override
	public List<Article> getAllArticles(){
		return articleDAO.getAllArticles();
	}
	@Override
	public synchronized boolean addArticle(Article article){
                if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
    	            return false;
                } else {
    	            articleDAO.addArticle(article);
    	            return true;
                }
	}
	@Override
	public void updateArticle(Article article) {
		articleDAO.updateArticle(article);
	}
	@Override
	public void deleteArticle(int articleId) {
		articleDAO.deleteArticle(articleId);
	}
	@Override
	public List<Lotacao> getAllLotacoes() {
		
			return articleDAO.getAllLotacoes();
		
	}
	@Override
	public boolean addLotacao(Lotacao lotacao) {
		
	    articleDAO.addLotacao(lotacao);
	    return true;
        
	}
} 