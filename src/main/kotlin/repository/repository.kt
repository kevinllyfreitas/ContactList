package repository

import entity.ContactEntity

class ContactRpository {

    companion object {
        private val contactList = mutableListOf<
                ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity) {
        }
    }

}