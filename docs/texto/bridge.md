# Bridge

---

**Problema:**  
Abstrações e implementações tendem a crescer juntas, criando explosões de subclasses e forte acoplamento.

**Solução:**  
Separar a abstração da implementação, permitindo que ambas variem de forma independente.

**Quando usar**
- Quando você quer evitar vínculo fixo entre abstração e implementação
- Quando implementações podem mudar em runtime
- Quando deseja estender abstrações e implementações separadamente

**Vantagens**
- Reduz acoplamento
- Facilita extensões independentes
- Permite troca de implementações em runtime

**Desvantagens**
- Pode aumentar o número de classes
- Estrutura inicial mais complexa