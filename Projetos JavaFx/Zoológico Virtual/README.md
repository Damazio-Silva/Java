# Zoológico Virtual - ProjetoJavaFX_02

Aplicação desktop desenvolvida com **Java + JavaFX** como projeto de aprendizado na SENAI. Simula um zoológico virtual onde é possível cadastrar animais e reproduzir seus sons.

## Funcionalidades

- Cadastrar animais com nome, idade e tipo
- Listar os animais cadastrados
- Emitir o som do animal selecionado (reproduz áudio `.mp3`)
- Exibir no campo de saída o tipo do animal que emitiu o som

## Tecnologias

- Java 21
- JavaFX 21.0.6 (controls, fxml, media)
- Maven

## Estrutura do Projeto

```
ProjetoJavaFX_02/
├── src/main/java/org/senai/
│   ├── MainApp.java                  # Ponto de entrada da aplicação
│   ├── Controller/
│   │   ├── MainController.java
│   │   └── ZooController.java        # Lógica da tela principal
│   └── Model/
│       ├── Animal.java               # Classe base (abstrata)
│       ├── Cachorro.java
│       ├── Gato.java
│       ├── Vaca.java
│       └── Macaco.java
└── src/main/resources/org/senai/
    ├── ZooController-view.fxml       # Layout da tela
    ├── styles/
    │   └── zoo.css
    └── Sons/
        ├── cachorro.mp3
        ├── gato.mp3
        ├── vaca.mp3
        └── macaco.mp3
```

## Como Executar

**Pré-requisitos:** JDK 21 e Maven instalados.

```bash
# Clonar o repositório
git clone <url-do-repositorio>
cd ProjetoJavaFX_02

# Executar
mvn javafx:run
```

Ou abra o projeto no IntelliJ IDEA e execute a classe `MainApp`.

## Animais Disponíveis

| Tipo     | Som        |
|----------|------------|
| Cachorro | Au Au      |
| Gato     | Miau       |
| Vaca     | Muuu       |
| Macaco   | Uuh Uuh    |

## Conceitos Aplicados

- Herança (`Cachorro`, `Gato`, `Vaca`, `Macaco` estendem `Animal`)
- Polimorfismo (método `emitirSom()` sobrescrito em cada subclasse)
- `ObservableList` para atualização automática da `ListView`
- `MediaPlayer` do JavaFX para reprodução de áudio
- Padrão MVC com FXML
