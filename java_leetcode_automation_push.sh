#!/bin/bash

cd ~/webFlyx

# Stage everything
git add .

# Commit with timestamp
git commit -m "Auto commit on $(date '+%Y-%m-%d %H:%M:%S')"

# Push to GitHub
git push origin main

