# State

---

**Problema:**  
Objetos que possuem múltiplos estados internos geralmente precisam alterar seu comportamento conforme esse estado muda. Implementar isso com condicionais grandes (if/switch) torna o código rígido e difícil de manter.

**Solução:**  
Encapsular cada estado em uma classe separada. O objeto Context delega o comportamento para o objeto State atual, que pode decidir qual será o próximo estado.

**Quando usar**
- Quando o comportamento depende do estado interno.
- Quando há muitos condicionais repetidos baseados em estado.
- Quando estados precisam ser adicionados ou modificados facilmente.

**Vantagens**
- Elimina condicionais complexos.
- Facilita adição de novos estados.
- Torna transições explícitas.
- Encapsula comportamento específico de cada estado.

**Desvantagens**
- Aumenta o número de classes.
- Pode introduzir dependências entre estados.