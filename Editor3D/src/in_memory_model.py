from typing import List

class ImodelChangeObserver:
    def apply_update_model(self):
        pass

class IModelChanger:
    def notity_change(self, sender: IModelChanger):
        pass

class ModelStore(IModelChanger):

    def __init__(self, changeObserver: List[ImodelChangeObserver]):
        self.Models = []
        self.Scenas = []
        self.Flashes = []
        self.Cameras = []
        self.ChangeObservers = changeObserver


    def get_scena(self, id):
        for scene in self.Scenas:
            if scene.id == id:
                return scene
            
    def notity_change(self, sender: IModelChanger):
        pass