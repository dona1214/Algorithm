score = {
	'math' : 97,
	'eng' : 97,
	'kor' : 89
}

score['math']

score['math'] = 45
print(score['math'])
score['sci'] = 100
print(score['sci'])

#print('music' in score)

if 'music' in score:
	print(score['music'])
else:
	score['music'] = 0
