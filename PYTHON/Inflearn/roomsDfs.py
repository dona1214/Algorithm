def canVisitAllRooms(rooms):
	visited = []
	
	def dfs(v):
		visited.append(v)
		for next_v in rooms[v]:
			if next_v in visited:
				dfs(next_v)

	def(0)

	if visited == len(rooms): 
		return True
	else: 
		return False

	roomss = [[1,3], [2,4], [0], [4], [], [3,4]]
	print(canVisitAllRooms(romms))