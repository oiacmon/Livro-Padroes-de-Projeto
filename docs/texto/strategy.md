# Strategy

---

**Problema:**  
Classes que precisam de múltiplos comportamentos acabam cheias de condicionais, difíceis de manter e estender.

**Solução:**  
Encapsular cada algoritmo em uma classe Strategy separada, permitindo que o Context selecione dinamicamente qual algoritmo usar.

**Quando usar**
- Quando existem várias variações de um algoritmo.
- Quando algoritmos devem ser intercambiáveis.
- Quando se deseja eliminar condicionais complexos.
- Quando o comportamento deve ser configurável em tempo de execução.

**Vantagens**
- Elimina condicionais.
- Facilita extensão de novos algoritmos.
- Permite troca dinâmica de comportamento.
- Desacopla cliente do algoritmo.

**Desvantagens**
- Aumenta o número de classes.
- Clientes precisam conhecer as estratégias disponíveis.