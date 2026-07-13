name1 = input("What is Player 1's name? ")
name2 = input("What is Player 2's name? ")
 
# Get the users choices
name1_answer = input(name1 + ", do you want to choose rock, paper or scissors? ").lower()
name2_answer = input(name2 + ", do you want to choose rock, paper or scissors? ").lower()
if name1_answer == name2_answer:
    print("It's a tie!")
elif name1_answer == 'rock':
    if name2_answer == 'scissors':
        print("rock wins!")
    else:
        print("Paper wins!")
elif name1_answer == 'scissors':
    if name2_answer == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif name1_answer == 'paper':
    if name2_answer == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")