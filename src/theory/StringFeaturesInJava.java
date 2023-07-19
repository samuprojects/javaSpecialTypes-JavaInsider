package theory;

@SuppressWarnings("ALL")
public class StringFeaturesInJava {

    // Strings no java são classes, diferente dos tipos primitivos...
    // as variáveis (na memória Stack) do tipo String apenas armazenam o endereço que aponta para o objeto String na memória Heap
    // Exemplos:
    // String s = "A"; s está na stack apontando para A que está no heap
    // String w = "B"; w está na stack apontando para B que está no heap
    // String z = w; z está na stack apontando para o mesmo endereço de objeto contido na variável w, ou seja, "B";
    // em tese se alterar o valor de w, z será afetado, porque as Strings são compartilhados.
    // para evitar esse problema as Strings no Java são imutáveis
}
