# Proxy

---

**Problema:**  
Controlar o acesso a um objeto, adicionando lógica extra (controle, cache, lazy loading, segurança) sem alterar o objeto real.

**Solução:**  
Criar um objeto representante (Proxy) que implementa a mesma interface do objeto real (RealSubject) e decide quando e como delegar chamadas.

**Quando usar**  
- Quando o objeto real é caro de criar (virtual proxy)
- Quando o objeto está remoto (remote proxy)
- Quando é necessário controle de acesso (protection proxy)
- Quando é preciso executar lógica extra ao acessar o objeto (smart reference)

**Vantagens**  
- Controle centralizado de acesso
- Suporte a lazy loading
- Possibilidade de adicionar cache, logging, segurança

**Desvantagens**
- Mais indireção
- Pode aumentar complexidade
