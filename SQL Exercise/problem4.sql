/* For each book that is loaned out from the "University Library" branch and whose DueDate is today, 
retrieve the book title, the borrower's name, and the borrower's address. */
SELECT b.title, bo.name, bo.address
FROM tbl_book b
INNER JOIN tbl_book_loans bl
ON b.bookId = bl.bookId
INNER JOIN tbl_borrower bo
ON bl.cardNo = bo.cardNo
INNER JOIN tbl_library_branch lb
ON lb.branchId = bl.branchId
WHERE lb.branchName = "University Library" AND bl.dueDate = CURDATE();