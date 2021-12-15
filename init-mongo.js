use bookDetails;

db.createUser(
  {
    user:  "kaori02",
    pwd:   "kaori02",
    roles: [
      {
        role: "readWrite",
        db:   "bookDetailsDB"
      }
    ]
  }
);

db.books.insertMany([
  { id: "book-1", name: "Harry Potter and the Philosopher's Stone", pageCount: 223, authorId: "author-1" },
  { id: "book-2", name: "Moby Dick", pageCount: 635, authorId: "author-2" },
  { id: "book-3", name: "Interview with the vampire", pageCount: 371, authorId: "author-3" }
])

db.authors.insertMany([
  { id: "author-1", firstName: "Joanne", lastName: "Rowling" },
  { id: "author-2", firstName: "Herman", lastName: "Melville" },
  { id: "author-3", firstName: "Anne", lastName: "Rice" }
])