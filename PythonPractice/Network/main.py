def solution(n, computers):
    checked = set()
    answer = 0

    for start in range(len(computers)):
        res, checked = dfs(computers, start, checked)
        answer += res

    return answer

def dfs(computers, start, checked):
    if start in checked:
        return 0, checked
    
    checked.add(start)
    neighbors = computers[start]

    for i, connected in enumerate(neighbors):
        if i == start or not connected: continue
        if i not in checked:
            dfs(computers, i, checked)
    
    return 1, checked


if __name__=='__main__':
    input_tuple = (
        (3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]), 
        (3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]),
        (3, [[1, 0, 0], [0, 1, 1], [0, 1, 1]]),
        (4, [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]),
        (4, [[1, 1, 1, 1], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]),
        (5, [[1, 1, 0, 0, 0], [1, 1, 1, 1, 0], [0, 1, 1, 0, 0], [0, 1, 0, 1, 1], [0, 0, 0, 1, 1]]),
        (5, [[1, 0, 1, 1, 0], [0, 1, 0, 0, 1], [1, 0, 1, 1, 0], [1, 0, 1, 1, 0], [0, 1, 0, 0, 1]]),
        (4, [[1, 1, 1, 0], [1, 1, 0, 1], [1, 0, 1, 0], [0, 1, 0, 1]]),
        (4, [[1, 1, 0, 0], [1, 1, 1, 0], [0, 1, 1, 0], [0, 0, 0, 1]]),
        (7, [[1,1,0,1,0,0,0],[1,1,0,0,0,0,0],[0,0,1,0,0,1,1],[1,0,0,1,0,1,0],[0,0,0,0,1,0,1],[0,0,1,1,0,1,0],[0,0,1,0,0,0,1]])
    )
    answer_tuple = (
        2, 
        1, 
        2,
        4, 
        1, 
        1,
        2,
        1,
        2,
        2
    )
    for i, input_ in enumerate(input_tuple):
        to_printout = f"Number {i+1}: "
        if solution(input_[0], input_[1]) == answer_tuple[i]:
            to_printout += "O"
        else:
            to_printout += "X"
        print(to_printout)