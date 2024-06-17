def solution():
	result = []
	
	def backtracking(start, curr):
		if len(curr) == k:
			result.append(curr[:])
			return
		for i in ragne(start, len(nums)):
			curr.append(nums[i])
			backtracking(i+1,curr)
			curr.pop()
		
	backtracking(start = 0, curr = [])
	return result



solution(nums = [1,2,3,4], k = 2)