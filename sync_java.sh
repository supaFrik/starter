#!/bin/bash

# Source directory on WindSOURCE_DIRS=(
  "/mnt/c/JavaWorkspace/LeetCode/src"
  "/mnt/c/JavaWorkspace/F2025_PR1C_2301040197_TrinhQuocViet_W01/src"
  "/mnt/c/JavaWorkspace/F2025_PR1C_2301040197_TrinhQuocViet_W02/src"
  "/mnt/c/JavaWorkspace/F2025_PR1C_2301040197_TrinhQuocViet_W03/src"
  "/mnt/c/JavaWorkspace/F2025_PR1C_2301040197_TrinhQuocViet_W04/src"
  "/mnt/c/JavaWorkspace/F2025_Pr1C_2301040197_VietTrinh_W05/src" )
# Destination directory inside git repo
DEST_DIR="/home/deskt/webFlyx"

# Loop through all source directories
for SOURCE_DIR in "${SOURCE_DIRS[@]}"; do
  for folder in "$SOURCE_DIR"/*; do
    if [ -d "$folder" ]; then
      folder_name=$(basename "$folder")
      dest_folder="$DEST_DIR/$folder_name"

      # Create destination folder if it doesn't exist
      mkdir -p "$dest_folder"

      # Copy only .java files (if any)
      cp -u "$folder"/*.java "$dest_folder" 2>/dev/null
    fi
  done
done

# Go to repo and push if changes exist
cd "$DEST_DIR"

if [[ -n $(git status -s) ]]; then
  git add -A
  git commit -m "Synced Java folders on $(date '+%Y-%m-%d %H:%M:%S')"
  git push origin main
else
  echo "No changes to commit."
fi
