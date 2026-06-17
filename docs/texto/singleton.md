# Singleton

---

**Problema:**  
Garantir que uma classe tenha apenas uma instância e fornecer um ponto global de acesso a ela.

**Solução:**  
Criar um construtor privado e expor um método estático que controla a criação da instância.

**Quando usar**  
- Quando apenas um objeto deve existir no sistema
- Quando é necessário controle centralizado
- Quando múltiplas instâncias causariam inconsistência

**Vantagens**
- Controle total sobre a instância
- Economia de recursos
- Fácil acesso global

**Desvantagens**  
- Pode dificultar testes
- Pode introduzir estado global indesejado
- Pode violar princípios de responsabilidade única