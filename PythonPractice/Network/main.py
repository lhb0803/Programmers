def solution(n, computers):
    answer = 0
    net_stack = list()
    
    checked = dict()
    for i in range(n):
        checked[i] = False
    
    for i, computer in enumerate(computers):
        if not checked[i]:
            checked[i] = True
            net_stack.append((i, computer))
            
            c = 1
            while len(net_stack) > 0:
                j = net_stack[-1][0]+c
                if j >= n: # there is no connected computer
                    temp = net_stack.pop()[0] 
                    if len(net_stack) > 0:
                        c = temp - net_stack[-1][0] + 1
                    continue
                
                if net_stack[-1][1][j]: # jth computer is connected
                    checked[j] = True
                    net_stack.append((j, computers[j]))
                    c = 1   
                else: # jth computer is not connected
                    c += 1
                    
        else:
            continue
            
        if len(net_stack) == 0:
            answer += 1
            
    return answer


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