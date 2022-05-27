
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Principal {

	public static void main(String[] args) {
		
		MongoClient cliente  = new MongoClient();
		MongoDatabase bd = cliente.getDatabase("test");
		MongoCollection<Document> alunos =  bd.getCollection("alunos");
		Document aluno = alunos.find().first();
		System.out.println(aluno);
		
		cliente.close();
	}

}
