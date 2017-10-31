package com.bolao;

import java.util.List;

public interface IArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
    List<Lotacao> getAllLotacoes() ;
	void addLotacao(Lotacao lotacao);
} 
