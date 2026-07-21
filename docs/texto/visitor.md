# Visitor

---

**Problema:**  
Adicionar novas operações a uma estrutura de objetos complexa geralmente exige modificar todas as classes envolvidas, violando o princípio aberto/fechado.

**Solução:**  
Separar as operações em uma hierarquia de visitantes. Cada elemento da estrutura aceita um visitante, delegando a ele a operação apropriada.

**Quando usar**
- Quando novas operações precisam ser adicionadas frequentemente.
- Quando a estrutura de classes é estável.
- Quando se deseja evitar poluir classes com múltiplas operações não relacionadas.

**Vantagens**
- Facilita adicionar novas operações.
- Mantém elementos simples e focados.
- Permite percorrer estruturas heterogêneas.

**Desvantagens**
- Difícil adicionar novos tipos de elementos.
- Pode quebrar encapsulamento se visitantes precisarem acessar muitos detalhes internos.