# Interpreter

---

**Problema:**  
Interpretar sentenças de uma linguagem definida por uma gramática, permitindo que cada regra seja representada como uma classe.

**Solução:**  
Representar a gramática como uma árvore sintática abstrata, onde cada nó é uma expressão que implementa a operação `interpret()`.

**Quando usar**
- Quando a linguagem é simples
- Quando expressões podem ser representadas como árvores
- Quando extensibilidade da gramática é importante

**Vantagens**
- Fácil de estender a gramática
- Estrutura clara baseada em árvore
- Permite múltiplas interpretações

**Desvantagens**
- Muitas classes para gramáticas grandes
- Pode ser menos eficiente que analisadores tradicionais