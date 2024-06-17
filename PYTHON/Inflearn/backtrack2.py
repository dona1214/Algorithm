def solution(nums, target):
	def backtrack(start, curr):
		if len(curr) == 2 and sum(nums[i] for i in curr) == target:
			return curr

		for i in range(start, len(nums)):
			curr.append(i)
			ret = backtrack(i+1, curr)

			if ret:
				return ter

			curr.pop()
		return None
	return backtrack(0, [])

print(solution(nums = [4,9,7,5,1], target = 15))