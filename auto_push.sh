#!/bin/bash

cd ~/webFlyx

if [[ -n $(git status -s) ]]; then
    git add .
    git commit -m "Auto commit on $(date '+%Y-%m-%d %H:%M:%S')"
    git push origin main
else
    echo "No changes to commit."
fi
