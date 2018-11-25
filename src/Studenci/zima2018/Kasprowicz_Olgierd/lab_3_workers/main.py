from abc import abstractmethod, ABC

class Worker(ABC):
    def __init__(self, name, *args, **kwargs):
        self.name = name

    def __str__(self):
        return "Worker named {}".format(self.name)

class OfficeWorker(Worker):
    def __init__(self, *args, office_number=None, **kwargs):
        self.office_number = office_number
        super().__init__(*args, **kwargs)

    def __str__(self):
        return "{}, in office {}".format((super().__str__()), self.office_number)

class ManagedWorker(Worker):
    def __init__(self, *args, manager=None, **kwargs):
        self.manager = manager
        super().__init__(*args, **kwargs)

    def __str__(self):
        return "{}, managed by {}".format((super().__str__()), self.manager)

class ManagedOfficeWorker(ManagedWorker, OfficeWorker):
    pass

def main():
    stefan = OfficeWorker("Stefan", office_number=5)
    stefan = ManagedOfficeWorker(**(stefan.__dict__), manager="Roman")

    print(stefan)
    print("-" * 20)

    print(stefan.__class__.__mro__)
    print("-" * 20)

    ble = Worker()

main()
