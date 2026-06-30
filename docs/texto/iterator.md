# Iterator

---

**Problema:**  
Percorrer coleções internas sem expor sua estrutura ou implementação.

**Solução:**  
Criar um objeto iterador que encapsula a lógica de navegação, oferecendo operações padronizadas como `hasNext()` e `next()`.

**Quando usar**
- Quando se deseja percorrer coleções sem expor detalhes internos
- Quando múltiplas formas de iteração são necessárias
- Quando se quer desacoplar coleção e lógica de navegação

**Vantagens**
- Desacoplamento entre coleção e iteração
- Permite múltiplos iteradores simultâneos
- Facilita novas estratégias de navegação

**Desvantagens**
- Pode aumentar o número de classes
- Iteradores complexos podem exigir mais lógica