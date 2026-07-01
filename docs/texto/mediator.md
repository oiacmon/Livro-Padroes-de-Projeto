# Mediator

---

**Problema:**  
Objetos que se comunicam diretamente criam redes complexas de dependências, dificultando manutenção e reutilização.

**Solução:**  
Introduzir um objeto Mediator que centraliza a comunicação entre colegas, evitando que eles se refiram uns aos outros diretamente.

**Quando usar**
- Quando muitos objetos se comunicam de forma complexa
- Quando o acoplamento entre colegas é alto
- Quando o comportamento cooperativo deve ser facilmente modificável

**Vantagens**
- Reduz acoplamento entre objetos
- Facilita reutilização de colegas
- Centraliza e organiza protocolos de interação

**Desvantagens**
- Mediator pode se tornar complexo demais
- Pode virar um “monolito” de lógica