# Dicionário para armazenar as informações dos clientes
clientes = {}

def criar_conta():
    nome = input("Digite seu nome: ")
    saldo_inicial = float(input("Digite o saldo inicial da conta: "))
    clientes[nome] = saldo_inicial
    print("Conta criada com sucesso!")

def verificar_saldo(nome):
    if nome in clientes:
        saldo = clientes[nome]
        print(f"Saldo de {nome}: R${saldo:.2f}")
    else:
        print("Cliente não encontrado.")

def depositar(nome):
    if nome in clientes:
        valor = float(input("Digite o valor a ser depositado: "))
        clientes[nome] += valor
        print("Depósito realizado com sucesso!")
    else:
        print("Cliente não encontrado.")

def sacar(nome):
    if nome in clientes:
        valor = float(input("Digite o valor a ser sacado: "))
        if valor <= clientes[nome]:
            clientes[nome] -= valor
            print("Saque realizado com sucesso!")
        else:
            print("Saldo insuficiente.")
    else:
        print("Cliente não encontrado.")



if __name__ == "__main__":
    while True:
        print("\n1. Criar conta")
        print("2. Verificar saldo")
    
        print("3. Depositar")
        print("4. Sacar")
        print("5. Sair")
        
        opcao = input("\nEscolha uma opção: ")
        
        if opcao == '1':
            criar_conta()
        elif opcao == '2':
            nome = input("Digite seu nome: ")
            verificar_saldo(nome)
        elif opcao == '3':
            nome = input("Digite seu nome: ")
            depositar(nome)
        elif opcao == '4':
            nome = input("Digite seu nome: ")
            sacar(nome)
        elif opcao == '5':
            print("Saindo...")
            break
        else:
            print("Opção inválida. Tente novamente.")