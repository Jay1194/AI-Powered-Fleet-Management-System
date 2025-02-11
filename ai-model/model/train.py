import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestRegressor
import joblib

# Sample dataset: Routes (distance, traffic congestion, estimated time)
data = {
    "distance_km": [5, 10, 15, 20, 25, 30],
    "traffic_level": [1, 2, 3, 2, 1, 3],  # 1 = Low, 2 = Medium, 3 = High
    "estimated_time_min": [10, 20, 35, 45, 50, 70]  # Ground truth
}

df = pd.DataFrame(data)

# Features & Labels
X = df[["distance_km", "traffic_level"]]
y = df["estimated_time_min"]

# Split dataset
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Train model
model = RandomForestRegressor(n_estimators=100, random_state=42)
model.fit(X_train, y_train)

# Save trained model
joblib.dump(model, "model/route_optimizer.pkl")

print("✅ AI Model trained and saved as 'route_optimizer.pkl'")
