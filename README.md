# PlaceQueens
Place 8 queens in 8*8 grids

Write an algorithm to print all ways of arranging eight queens on an 8x8 chess board so that none of them share the same row, column or diagonal. In this case, "diagonal" means all diagonals, not just the two that bisect the board.

Use recursion, 1D array is enough since it will be always (0, ?),(1, ?),(2, ?),(3, ?),(4, ?),(5, ?),(6, ?),(7, ?)

row is from 0-7, but we put it into recursion

For each ?, try col from 0 to 7, check if it is available, if so, put columns[row]=col, recursion placeQueen(row+1, columns[], al);

if row==8, clone Integer[] columns to al

Check available, check if it is packed (check each row row2 before row1, row2's column ==passed value,)  and diagonal (rowDistance==columnDistance)
