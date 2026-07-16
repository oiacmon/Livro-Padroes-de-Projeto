# Template Method

---

**Problema:**  
Algoritmos complexos possuem partes fixas e partes variáveis. Implementar tudo em subclasses gera duplicação e dificulta manutenção.

**Solução:**  
Definir o esqueleto do algoritmo em um método final (template method), deixando que subclasses implementem apenas os passos variáveis.

**Quando usar**
- Quando algoritmos possuem estrutura fixa.
- Quando subclasses devem personalizar apenas partes específicas.
- Quando se deseja evitar duplicação de código.

**Vantagens**
- Reutilização de código.
- Estrutura clara e padronizada.
- Facilita extensão sem alterar o algoritmo principal.

**Desvantagens**
- Subclasses ficam dependentes da estrutura definida.
- Mudanças no template podem afetar todas as subclasses.