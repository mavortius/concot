package concot

class Supplier {

    String name
    String email

    static constraints = {
        name nullable: false, blank: false, maxSize: 128, unique: true
        email nullable: false, blank: false, email: true
    }

    @Override
    String toString() {
        name
    }
}
