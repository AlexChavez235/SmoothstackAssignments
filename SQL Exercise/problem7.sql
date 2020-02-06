/* 7. For each book authored (or co-authored) by "Stephen King", retrieve the title and the number of 
copies owned by the library branch whose name is "John Adams Building". */
SELECT b.title, bc.noOfCopies
FROM tbl_author a
INNER JOIN tbl_book_authors ba
ON a.authorId = ba.authorId
INNER JOIN tbl_book b
ON ba.bookId = b.bookId
INNER JOIN tbl_book_copies bc
ON b.bookId = bc.bookId
INNER JOIN tbl_library_branch lb
ON bc.branchId = lb.branchId
WHERE a.authorName = "Stephen King" AND lb.branchName = "John Adams Building";
