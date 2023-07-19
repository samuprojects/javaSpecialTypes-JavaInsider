package theory;

@SuppressWarnings("ALL")
public class JavaStringPool {

    // O fato de as Strings serem imutáveis permite que sejam compartilhadas sem medo
    // O Java aloca essas Strings numa área de memória chamada Heap e é denominada Pool, um repositório de Strings
    // Exemplos
    // String a = "A"; String b = "B"; String c = "A"; String d = "A";
    // nesse caso o objeto referenciado nas variáveis stack a, c e d são o mesmo pois o valor já está no pool
    // Isso ocorre quando atribuímos diretamente utilizando as aspas "A"
    // o problema é quando explicitamente utilizamos o new para criar uma nova String, dessa forma
    // se utilizarmos String e = new String ("A"); esse objeto estará no Heap, porém, fora do pool
    // esse cenário não é recomendado caso crie vários novos objetos Strings com o mesmo valor, desperdiçando recursos
}
