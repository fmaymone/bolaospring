package com.bolao;
import java.net.URI;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
@Transactional
@Repository
public class RestClientUtil {
	
			
	
	public void getArticleByIdDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/article/{id}";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Article> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Article.class, 1);
        Article article = responseEntity.getBody();
        System.out.println("Id:"+article.getArticleId()+", Title:"+article.getTitle()
                 +", Category:"+article.getCategory());      
    }
    public void getAllArticlesDemo() {
	HttpHeaders headers = new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/articles";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Article[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Article[].class);
        Article[] articles = responseEntity.getBody();
        for(Article article : articles) {
              System.out.println("Id:"+article.getArticleId()+", Title:"+article.getTitle()
                      +", Category: "+article.getCategory());
        }
    }
    public void getAllLotacoesDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
            RestTemplate restTemplate = new RestTemplate();
    	String url = "http://localhost:8080/user/lotacoes";
            HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
            ResponseEntity<Lotacao[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Lotacao[].class);
            Lotacao[] lotacoes= responseEntity.getBody();
        	System.out.println(lotacoes.length);
            for(Lotacao lotacao : lotacoes) {
            	
            	System.out.println(lotacao.getNomeLotacao());
                  
                        
            }
        }
    public void addArticleDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/article";
	Article objArticle = new Article();
	objArticle.setTitle("Spring REST Security using Hibernate");
	objArticle.setCategory("Spring");
        HttpEntity<Article> requestEntity = new HttpEntity<Article>(objArticle, headers);
        URI uri = restTemplate.postForLocation(url, requestEntity);
        System.out.println(uri.getPath());    	
    }
    public void addLotacaoDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/lotacao";
	Lotacao objLotacao = new Lotacao();
	objLotacao.setNomeLotacao("Lotacao Maymone");
	
        HttpEntity<Lotacao> requestEntity = new HttpEntity<Lotacao>(objLotacao, headers);
        URI uri = restTemplate.postForLocation(url, requestEntity);
        System.out.println(uri.getPath());    	
    }
    public void updateArticleDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/user/article";
	Article objArticle = new Article();
	objArticle.setArticleId(1);
	objArticle.setTitle("Update:Java Concurrency");
	objArticle.setCategory("Java");
        HttpEntity<Article> requestEntity = new HttpEntity<Article>(objArticle, headers);
        restTemplate.put(url, requestEntity);
    }
    public void deleteArticleDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/article/{id}";
        HttpEntity<Article> requestEntity = new HttpEntity<Article>(headers);
        restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, 4);        
    }
    public static void main(String args[]) {
    	RestClientUtil util = new RestClientUtil();
        
    	util.getAllLotacoesDemo();
    	util.addArticleDemo();
    	
    	//util.updateArticleDemo();
    	//util.deleteArticleDemo();
    	
    	
    	
    	
    }    
} 
