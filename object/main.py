class RecordMarks:

    def __init__(self, student, test1, test2, test3, mark):
        self.test1 = test1
        self.test2 = test2
        self.test3 = test3
        self.mark = mark
        self.student = student
    def input_attributes(self):
        self.student=(input(" faka amanani omfundi"))
        self.test1 = float(input("Faka amanqaku akho ovavanyo lokuqala"))
        self.test2 = float(input("Faka amanqaku akho ovavanyo lwesibini"))
        self.test3 = float(input("Faka amanqaku akho ovanyo lwesithathu"))
        self.mark = float(input("Faka amanqaku akho emviwo"))

    def calculate_DP(self):
        if self.test1 < self.test2 and self.test1 < self.test3:
            return (self.test2 + self.test3)/2

        if self.test2 < self.test1 and self.test2 < self.test3:
            return(self.test1 + self.test3)/2

        if self.test3 < self.test1 and self.test3 < self.test2:
            return(self.test1 + self.test2)/2

    def calculate_finalMark(self):
        if float(self.calculate_DP()) < 40.0:
            return 0.0

        if self.calculate_DP() >= 40.0:
            return self.calculate_DP() * 0.4 + self.mark * 0.6

    def display_output(self):
         print("Amanqaku onyaka wakho xa ephelele nanga:", self.calculate_DP())
         print("Amanqaku wakho okuphela konyaka ewonke:", self.calculate_finalMark())


if __name__ == '__main__':
    c = RecordMarks("5356", 29, 98.0, 90.6, 98.8)
    c.input_attributes()
    c.display_output()

