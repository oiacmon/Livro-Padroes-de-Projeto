# Prototype

---

**Problema:**  
Criar objetos pode ser caro ou complexo, e o sistema deve ser independente de como esses objetos são criados.

**Solução:**  
Usar um objeto protótipo e criar novos objetos copiando esse protótipo.

**Quando usar**
-  Quando a criação é custosa
- Quando objetos têm poucas combinações de estado
- Quando queremos evitar hierarquias paralelas de fábricas
- Quando objetos devem ser criados dinamicamente em runtime

**Vantagens**
- Reduz número de subclasses
- Permite adicionar novos tipos em runtime
- Evita acoplamento com classes concretas

**Desvantagens**
- Clonagem profunda pode ser complexa
- Pode ser difícil clonar objetos com referências circulares