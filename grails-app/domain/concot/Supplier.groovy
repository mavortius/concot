package concot

class Supplier {

    String name

    static constraints = {
        name nullable: false, blank: false, maxSize: 128, unique: true
    }
}
