# Adapter

---

**Problema:**  
Duas classes precisam trabalhar juntas, mas suas interfaces são incompatíveis.

**Solução:**  
Criar um adaptador que converte a interface existente (Adaptee) na interface esperada pelo cliente (Target).

**Quando usar**
- Quando você quer reutilizar uma classe existente cuja interface não é compatível
- Quando deseja integrar componentes de bibliotecas diferentes
- Quando não é possível alterar o código original

**Vantagens**
- Reutilização de código legado
- Desacoplamento entre cliente e adaptee
- Flexibilidade para adaptar múltiplas classes

**Desvantagens**
- Pode aumentar a complexidade
- Pode introduzir camadas extras de indireção