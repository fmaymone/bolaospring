

@Transactional
public void someMethod() {
	
	em.persist(u1);
	em.persist(u2);
	
	//Se eu dou um flush ele amnda os dados. Senao soh quando terminar o metodo que ele comita
	em.flush()
	
}

//Pra quê usar @Transactional em Unit tests? 

//Eu só preciso de @Transactional em querys se eu for usar o lazzy
//se for usar soh consultas, nao precisa

//Porque usamos @DirtiesContext? Pra poder dar um rollback em testes. 