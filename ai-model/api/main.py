from fastapi import FastAPI
from pydantic import BaseModel
import joblib
import numpy as np

# Load trained model
model = joblib.load("artifacts/route_optimizer.pkl")

# FastAPI app instance
app = FastAPI()

# Define the input schema using Pydantic
class RouteRequest(BaseModel):
    distance: float
    traffic: int

@app.get("/")
def home():
    return {"message": "AI Route Optimization API is running!"}

@app.post("/predict-route/")
def predict_route(request: RouteRequest):
    input_data = np.array([[request.distance, request.traffic]])
    estimated_time = model.predict(input_data)[0]
    return {"estimated_travel_time": round(estimated_time, 2)}
