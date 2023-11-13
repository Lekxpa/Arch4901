from typing import List
from model_store import Flash, Camera, PoligonalModel, Scene

class ImodelChangeObserver:
    def apply_update_model(self):
        pass

class IModelChanger:
    def notity_change(self, sender: IModelChanger):
        pass

class ModelStore(IModelChanger):

    def __init__(self, changeObserver: List[ImodelChangeObserver]):
        self.models = []
        self.scenas = []
        self.flashes = []
        self.cameras = []
        self.changeObservers = changeObserver

        textures = []
        self.models.append(PoligonalModel(textures))
        self.cameras.append(Camera())
        self.flashes.append(Flash())
        self.scenas.append(Scene(0, self.models, self.flashes, self.cameras))




    def get_scena(self, id):
        for scene in self.Scenas:
            if scene.id == id:
                return scene
            
    def notity_change(self, sender: IModelChanger):
        pass