package designpatterns.builder.dominio;
/**
 * Representa uma pessoa no sistema.
 * <p>
 * Esta classe é imutável e só pode ser criada através do {@link PersonBuilder},
 * garantindo que o objeto esteja sempre em um estado válido.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    /**
     * Construtor privado para forçar o uso do Builder.
     */
    private Person(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    /**
     * Builder responsável pela construção controlada de {@link Person}.
     */
    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        private PersonBuilder() {
        }

        /**
         * Inicia a criação de uma {@link Person}.
         *
         * @return uma nova instância de {@link PersonBuilder}
         */
        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        /**
         * Define o primeiro nome da pessoa.
         *
         * @param firstName nome obrigatório
         * @return o próprio builder para encadeamento
         */
        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Define o sobrenome da pessoa.
         */
        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Define o nome de usuário.
         */
        public PersonBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Define o e-mail da pessoa.
         */
        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Constrói uma instância válida de {@link Person}.
         *
         * @return uma nova {@link Person}
         * @throws IllegalStateException se os dados obrigatórios não forem informados
         */
        public Person build() {
            if (firstName == null || firstName.isBlank()) {
                throw new IllegalStateException("First name é obrigatório");
            }
            return new Person(firstName, lastName, userName, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }
}

