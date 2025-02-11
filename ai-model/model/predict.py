import joblib
import numpy as np

# Load trained model
model = joblib.load("model/route_optimizer.pkl")

def predict_route(distance, traffic):
    input_data = np.array([[distance, traffic]])
    estimated_time = model.predict(input_data)[0]
    return estimated_time

# Example prediction
distance = 12  # km
traffic = 2  # Medium traffic

print(f"Predicted Travel Time: {predict_route(distance, traffic)} minutes")
