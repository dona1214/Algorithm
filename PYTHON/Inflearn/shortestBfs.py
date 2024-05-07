from collections import deque

def shortestPathBinaryMatrix(grid):
	shortest_path_len = -1
	row = len(grid)
	col = len(grid[0])
	visited = [[False] * col for _ in range(row)]
	
	if grid[0][0] != 0 or grid[row-1][col-1] != 0:
		return shortest_path_len

	delta = [(1,0), (-1,0), (0,1), (0,-1),
			(1,1), (1,-1), (-1,1), (-1,-1) ]

	queue = deque((0,0,1))
	visited[0][0] = True


	while queue:
		cur_r, cur_c, cur_len = queue.popleft()
		if cur_r == row -1 and cur_c == col -1:
			shortest_path_len = cur_len
			break

		for dr, dc in delta:
			next_r = cur_r + dr
			next_c = cur_c + dc
			if next_r >= 0 and next_r < row and next)c >= 0 and next_c < col:
				if grid[next_r][next_c] == 0 and not  visited[next_r][next_c]:
					queue.append((next_r, next_c, cur_len +1))
					visited[next_r][next_c] = True
		
	return shortest_path_len