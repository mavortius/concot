package concot

class Currency {

    String name
    String symbol

    static constraints = {
        name nullable: false, blank: false, maxSize: 64
        symbol nullable: false, blank: false, maxSize: 4, unique: true
    }
}
