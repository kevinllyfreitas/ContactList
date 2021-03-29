package bussiness

import entity.ContactEntity
import repository.ContactRpository
import java.lang.Exception

class ContactBussiness {
    fun validate(name: String, phone: String, delete: Boolean) {
        if (delete && (name == ""|| phone == "")) {
            throw Exception("É necessário selecionar um contato antes de remover!")
        }
        if (name == "") {
            throw Exception("Nome é obrigatório!")
        }
        if (phone == "") {
            throw Exception("Telefone é obrigatório!")
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone, false)

        val contact = ContactEntity(name, phone)
        ContactRpository.save(contact);
    }

    fun delete(name: String, phone: String) {
        validate(name, phone, true)

        val contact = ContactEntity(name, phone)
        ContactRpository.delete(contact);
    }
}