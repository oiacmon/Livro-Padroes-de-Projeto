# Façade

---

**Problema:**  
Subsistemas podem ser complexos, com muitas classes e interações internas.
O cliente não deveria conhecer ou depender de todos esses detalhes.

**Solução:**  
Criar uma fachada que fornece uma interface simples e unificada para o subsistema.

**Quando usar**
- Quando você quer simplificar o uso de um subsistema complexo
- Quando deseja reduzir acoplamento entre cliente e classes internas
- Quando quer estruturar o sistema em camadas

**Vantagens**
- Reduz dependências
- Simplifica o uso do subsistema
- Facilita manutenção e evolução

**Desvantagens**
- Pode virar um “Deus” se crescer demais
- Pode esconder funcionalidades importantes