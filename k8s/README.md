# Kubernetes Deployment for Sentiment API

## Files

- `deployment.yaml`: Spring Boot app deployment
- `service.yaml`: NodePort service exposing app
- `ingress.yaml`: ALB ingress with HTTPS via ACM
- `hpa.yaml`: Horizontal Pod Autoscaler

## Setup Steps

1. Apply Deployment + Service
```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml