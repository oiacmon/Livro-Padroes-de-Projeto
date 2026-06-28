# Chain of Responsibility

---

**Problema:**  
Evitar acoplamento direto entre quem envia uma solicitação e quem a trata, permitindo que múltiplos objetos tenham chance de processar a mesma requisição.

**Solução:**  
Encadear objetos manipuladores (Handlers), onde cada um decide se trata a solicitação ou a repassa para o próximo na cadeia.

**Quando usar**
- Quando múltiplos objetos podem tratar uma mesma solicitação
- Quando não se quer conhecer explicitamente quem é o receptor
- Quando se deseja flexibilidade para reorganizar a cadeia em tempo de execução

**Vantagens**
- Reduz acoplamento entre remetente e receptor
- Facilita extensão e reorganização da cadeia
- Permite múltiplos pontos potenciais de tratamento

**Desvantagens**
- Não garante que a solicitação será tratada
- Pode ser difícil depurar o fluxo da cadeia