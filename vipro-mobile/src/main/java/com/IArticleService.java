package com;

import java.util.List;
public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
     List<Lotacao> getAllLotacoes();
	boolean addLotacao(Lotacao lotacao);
     
} 