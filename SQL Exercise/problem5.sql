/* 5. For each library branch, retrieve the branch name and the total number of books loaned out 
from that branch. */
SELECT lb.branchName, count(*) as total
FROM tbl_library_branch lb
LEFT JOIN tbl_book_loans bl
ON lb.branchId = bl.branchId
GROUP BY lb.branchName;
