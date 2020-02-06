/* 3.Retrieve the names of all borrowers who do not have any books checked out.*/
SELECT temp.name FROM
(SELECT b.name, bl.bookId
FROM tbl_borrower b
LEFT JOIN tbl_book_loans bl
ON b.cardNo = bl.cardNo) temp
WHERE temp.bookId IS NULL;