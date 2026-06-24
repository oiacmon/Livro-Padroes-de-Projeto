# Composite

---

**Problema:**  
Representar estruturas hierárquicas partes‑todo, permitindo que objetos simples e compostos sejam tratados da mesma forma.

**Solução:**  
Definir uma interface comum (Component) e permitir que objetos compostos (Composite) contenham outros componentes recursivamente.

**Quando usar**
- Quando você precisa representar árvores de objetos
- Quando deseja tratar objetos simples e compostos de forma uniforme
- Quando quer evitar condicionais do tipo “se for folha… se for composto…”

**Vantagens**
- Simplifica o código do cliente
- Permite estruturas recursivas complexas
- Facilita adicionar novos tipos de componentes

**Desvantagens**
- Pode deixar o sistema muito genérico
- Difícil restringir quais componentes podem ser filhos