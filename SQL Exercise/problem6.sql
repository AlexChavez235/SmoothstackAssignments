/* 6. Retrieve the names, addresses, and number of books checked out for all borrowers
who have more than five books checked out. */
SELECT b.name, b.address, count(*) as total
FROM tbl_borrower b
INNER JOIN tbl_book_loans bl
ON b.cardNo = bl.cardNo
GROUP BY b.name
HAVING total > 5;