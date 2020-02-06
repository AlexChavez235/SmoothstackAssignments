/* 1. How many copies of the book titled Animal Farm are owned by the library branch
whose name is "Blake Library"? */
SELECT noOfCopies 
FROM tbl_book_copies c
INNER JOIN tbl_library_branch lb
ON c.branchId = lb.branchId
INNER JOIN tbl_book b 
ON c.bookId = b.bookId
WHERE b.title = "Animal Farm" && lb.branchName = "Blake Library";
	