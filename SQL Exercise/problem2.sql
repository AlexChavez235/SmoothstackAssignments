/* 2.How many copies of the book titled 1984 are owned by each library branch?*/
SELECT lb.branchName, temp.noOfCopies FROM tbl_library_branch lb
LEFT JOIN
(SELECT lb.branchName, bc.noOfCopies
FROM tbl_library_branch lb
LEFT JOIN tbl_book_copies bc
ON lb.branchId = bc.branchId
LEFT JOIN tbl_book b
ON bc.bookId = b.bookId
WHERE b.title = "1984") as temp
ON lb.branchName = temp.branchName;