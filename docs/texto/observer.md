# Observer

---

**Problema:**  
Manter múltiplos objetos sincronizados com o estado de outro objeto, sem criar forte acoplamento entre eles.

**Solução:**  
Definir um Subject que mantém uma lista de Observers e os notifica automaticamente sempre que seu estado muda.

**Quando usar**
- Quando várias partes do sistema precisam reagir a mudanças de um mesmo objeto.
- Quando se deseja desacoplar produtor e consumidores de eventos.
- Quando notificações automáticas são necessárias.

**Vantagens**
- Desacoplamento entre sujeito e observadores.
- Facilita adição e remoção dinâmica de observers.
- Suporta múltiplos observers para o mesmo subject.

**Desvantagens**
- Pode gerar muitas notificações.
- Ordem de notificação pode ser relevante e não óbvia.