# Builder

---

**Problema:**
Criar objetos complexos passo a passo, permitindo diferentes representações usando o mesmo processo de construção.

**Solução:**  
Separar o processo de construção (Director) da representação final (Builder/ConcreteBuilder).

**Quando usar**
- Quando a criação envolve muitos passos
- Quando diferentes representações do mesmo produto são necessárias
- Quando o algoritmo de construção deve ser independente das partes

**Vantagens**
- Controle fino sobre o processo de construção
- Representações diferentes com o mesmo fluxo
- Reduz complexidade do cliente

**Desvantagens**
- Pode aumentar o número de classes 
- Pode ser mais complexo que necessário para objetos simples
